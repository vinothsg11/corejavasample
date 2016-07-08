/**
 * 
 */
package utility;


/**
 * @author user
 *
 */
public class HashCodeNew
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
if(o == null)                return false;
if(!(o instanceof HashCodeNew)) return false;

HashCodeNew other = (HashCodeNew) o;
if(! this.className.equals(other.getClassName())) return false;
return true;
}

public String toString(){
return this.className;
}
}
