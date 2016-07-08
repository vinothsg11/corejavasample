/**
 * 
 */
package thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author user
 *
 */
public class TimerTaskExample extends TimerTask
{
public void run() {
System.out.println("Start time:" + new Date());
callTimerTask();
System.out.println("End time:" + new Date());
}
private void callTimerTask() {
try {
    Thread.sleep(10000);
}catch(Exception e){

}
}

public static void main(String args[]) {
TimerTask timerTask = new TimerTaskExample();
// running timer task as daemon thread
Timer timer = new Timer(true);
timer.scheduleAtFixedRate(timerTask, 0, 10 * 1000);
System.out.println("TimerTask begins! :" + new Date());
try {
    Thread.sleep(2000);
} catch (InterruptedException e) {
    e.printStackTrace();
	}
timer.cancel();
System.out.println("TimerTask cancelled! :" + new Date());
try {
    Thread.sleep(30000);	
} catch (InterruptedException e) {
    e.printStackTrace();
}
}
}
