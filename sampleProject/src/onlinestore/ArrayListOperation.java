/**
 * 
 */
package onlinestore;

import java.util.ArrayList;

/**
 * @author user
 *
 */
//Read the authorFile
//Create Method to create  Authors from the authorFile and add it to ArrayList and return  
//ArrayList of authors.

public class ArrayListOperation
{
public Integer findNameFromList(ArrayList<String> listOfNames, String nameToSearch){
Integer positionOfTheName = -1;

for(int i=0; i< listOfNames.size(); i++){
if(listOfNames.get(i).equalsIgnoreCase(nameToSearch)){
	positionOfTheName = i;
	break;
}
}

for (String nameToFind : listOfNames){
	if(nameToFind.equalsIgnoreCase(nameToSearch)){
		positionOfTheName++;
		break;
	}
}
return positionOfTheName;
}
}