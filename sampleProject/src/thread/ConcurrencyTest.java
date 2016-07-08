/**
 * 
 */
package thread;


/**
 * @author user
 *
 */
public class ConcurrencyTest
{
public static void main(String[] args){
int numThreads = 10;
Counter counter =  new Counter();
Thread[] threadList = new Thread[numThreads];
for(int i=0; i<numThreads; i++){
	threadList[i] =  new Thread(new ClientTask(counter));
	threadList[i].start();
}
for(int i=0; i<numThreads; i++){
try{
	threadList[i].join();
}catch(InterruptedException ie){
	ie.printStackTrace();
}
	
}
System.out.println("Final Thread Counter-" + counter.getCtr());

}
}
