/**
 * 
 */
package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author user
 *
 */
public class ExecutorTestClient
{
/**
* @param args
*/
public static void main(String[] args) {
// Step1 : Create a Runnable
Runnable simpleTask = new RunnableWithExecutorTask();
// Step 2: Configure Executor
// Uses FixedThreadPool executor
ExecutorService executor = Executors.newSingleThreadExecutor();
executor.submit(simpleTask);
executor.shutdown();
 
}
}
