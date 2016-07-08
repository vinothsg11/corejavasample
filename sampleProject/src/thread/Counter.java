/**
 * 
 */
package thread;


/**
 * @author user
 *
 */
public class Counter
{
private static int ctr=0;


public int getCtr() {
return ctr;
}


public void setCtr(int ctr) {
this.ctr = ctr;
}
public void increment(){
ctr++;
}
}
