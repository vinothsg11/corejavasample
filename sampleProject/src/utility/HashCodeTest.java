/**
 * 
 */
package utility;


/**
 * @author user
 *
 */
public class HashCodeTest
{

private String className;
private long classId;

public long getClassId() {
return classId;
}

public void setClassId(long classId) {
this.classId = classId;
}


public String getClassName() {
return className;
}


public void setClassName(String className) {
this.className = className;
}

public int hashCode(){
return className.hashCode();
}

public boolean equals(Object o){
System.out.println("equals method called");
if(o !=null){
	HashCodeTest other = (HashCodeTest) o;
	if(! this.className.equals(other.className)) {
		return false;
	} else {
		return true;
	}	
}
return false;
}

public String toString(){
return this.className;
}
}
