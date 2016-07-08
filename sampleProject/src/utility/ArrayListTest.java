package utility;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
//create a new class ArrayListOperation.java to handle array list operations.
//create a new class to get input from user from command line and call ArrayListOperation to search
//array list values and return the output as Index, if the re

/**
 * @param args
 */
public static void main(String[] args) {
List<String> listString = new ArrayList<String>(10);
listString.add("Test");
listString.add("Value1");

for (int i = 0; i < listString.size(); i++)
{
	System.out.println("list of project value ->" + listString.get(i));
}
}
}