package thread;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import onlinestore.FileProcessor;

public class ThreadSchedulerTest {
  /** Run the example. */
  public static void main(String... aArgs) throws InterruptedException {
    log("Main started.");
    ThreadSchedulerTest fileProcessTask = new ThreadSchedulerTest(1, 1, 10);
    fileProcessTask.fileProcessActivity();
    /*
     * To start the alarm at a specific date in the future, the initial delay needs to be calculated
     * relative to the current time, as in : Date futureDate = ... long startTime =
     * futureDate.getTime() - System.currentTimeMillis(); AlarmClock alarm = new
     * AlarmClock(startTime, 1, 20); This works only if the system clock isn't reset.
     */
    log("Main ended.");
  }

  ThreadSchedulerTest(long aInitialDelay, long aDelayBetweenBeeps, long aStopAfter) {
    fInitialDelay = aInitialDelay;
    fDelayBetweenRuns = aDelayBetweenBeeps;
    fShutdownAfter = aStopAfter;
    fScheduler = Executors.newScheduledThreadPool(NUM_THREADS);
  }
  void fileProcessActivity() {
    Runnable soundAlarmTask = new FileProcessTask();
    ScheduledFuture<?> soundAlarmFuture = fScheduler.scheduleWithFixedDelay(soundAlarmTask,
        fInitialDelay, fDelayBetweenRuns, TimeUnit.MINUTES);
    Runnable stopAlarm = new StopFileProcessTask(soundAlarmFuture);
    fScheduler.schedule(stopAlarm, fShutdownAfter, TimeUnit.MINUTES);
  }

  // PRIVATE
  private final ScheduledExecutorService fScheduler;
  private final long fInitialDelay;
  private final long fDelayBetweenRuns;
  private final long fShutdownAfter;

  private static void log(String aMsg) {
    System.out.println(aMsg);
  }

  /** If invocations might overlap, you can specify more than a single thread. */
  private static final int NUM_THREADS = 1;
  private static final boolean DONT_INTERRUPT_IF_RUNNING = false;

  private static final class FileProcessTask implements Runnable {
    @Override
    public void run() {
      try {
        FileProcessor fileProcessor = new FileProcessor();
        fileProcessor.printAuthorFileContent();

      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    private int fCount;
  }

  private final class StopFileProcessTask implements Runnable {
    StopFileProcessTask(ScheduledFuture<?> aSchedFuture) {
      fSchedFuture = aSchedFuture;
    }

    @Override
    public void run() {
      log("Stopping File Processors.");
      fSchedFuture.cancel(DONT_INTERRUPT_IF_RUNNING);
      /*
       * Note that this Task also performs cleanup, by asking the scheduler to shutdown gracefully.
       */
      fScheduler.shutdown();
    }

    private ScheduledFuture<?> fSchedFuture;
  }
}