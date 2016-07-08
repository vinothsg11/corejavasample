
package utility;

import java.util.HashSet;

public class DuplicateHashCodeTest
{
public static void main(String[] args){

HashCodeTest codeFirst = new HashCodeTest();
codeFirst.setClassName("one");

HashCodeTest codeFirst1 = new HashCodeTest();
codeFirst1.setClassName("one");

HashCodeTest codeFirst2 = new HashCodeTest();
codeFirst2.setClassName("one");

HashCodeTest codeFirst3 = new HashCodeTest();
codeFirst3.setClassName("three");

HashSet hashCodeList = new HashSet();
hashCodeList.add(codeFirst);
hashCodeList.add(codeFirst1);
hashCodeList.add(codeFirst2);
hashCodeList.add(codeFirst3);

//HashSet hashCodeList = new HashSet();
//hashCodeList.add("First Value");
//hashCodeList.add("First Value1");


System.out.println("Collection value -> "+ hashCodeList);

HashCodeTest testData = new HashCodeTest();
testData.setClassName("TestClassName");
System.out.println(testData);

}
}
