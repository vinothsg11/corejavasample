/**
 * 
 */
package thread;


/**
 * @author user
 *
 */
public class ClientTask implements Runnable
{
int iteration=100;
static int counterMax=0;
Counter counter;
public ClientTask(Counter counter){
this.counter =  counter;
}
public void run(){
//synchronized(counter){
	for (;counterMax<1000; counterMax++){
		counter.increment();
	}	
//}

}
}
