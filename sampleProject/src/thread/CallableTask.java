/**
 * 
 */
package thread;

import java.util.concurrent.Callable;

/**
 * @author user
 *
 */

public class CallableTask implements Callable<String>{

@Override
public String call() throws Exception {
String s="Callable Task Run at "+System.currentTimeMillis();
return s;
}

}
