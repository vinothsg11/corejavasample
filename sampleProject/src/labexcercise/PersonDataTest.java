/**
 * 
 */
package labexcercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Name|National Id Number|DateOfBirth|Country|City|PostalCode|
//Donald|S98791111|10-10-1989|SGP|Bishan|6723458987|
//Allan|S98791112|10-10-1989|SGP|Bishan|9876|
//Atkinson|UXUYT67876|10-12-1989|SGP|LLL|123456|
//Samuel|FX898765|01-03-1989|BHR|LKIUY|66765|
//Jackson|IOKu55611|08-17-1979|BHR|IU987)|8766|
//Trump|KJNU09876|10-10-1980|POL|BGTRE|12345|
//Angel|NHJNU09876|10-10-1981|POL|Avenue10|87654|
//Mocha|GYUJNU09876|10-10-1980|POL|Avenue4|12346|
//Google|YUNU09876|10-10-1982|SGP|Tampines|67854|
//Hotmail|OLJNU09876|10-10-1982|SGP|Bedok|12345|
//
//// Write a method to create a hashMap with <String, List<PersonData>>. Group the records
//based on country.
//String - key - country.

/**
 * @author user
 *
 */
public class PersonDataTest
{
static Map<String, Country> countryMap;
public static void main(String[] args){

}

static List<Person> addPersonDataToList() throws Exception {
List personList =  new ArrayList();
Person person = new Person();
person.addPersonData(personList, new Person("Donald", "S98791111", setDate("10-10-1989"),getCountry("SGP"), "Bishan","6723458987"));
person.addPersonData(personList, new Person("Atkinson", "UXUYT67876", setDate("10-12-1989"),getCountry("BHR"), "Bishan","6723458987"));
person.addPersonData(personList, new Person("Angel", "S98791111", setDate("10-10-1989"),getCountry("POL"), "Bishan","6723458987"));
person.addPersonData(personList, new Person("Hotmail", "S98791111", setDate("10-10-1989"),getCountry("SGP"), "Bishan","6723458987"));
return personList;
}


static Map<String, List<Person>> groupByCountry(List<Person> personList) {
//Create new HashMap
Map<String, List<Person>> personMapGroupedByCountry = new HashMap<>();
//Iterate through the list of person List
for(Person person : personList){
	//If the hashmap does not have any record for the countrycode key
	//then create a new ArrayList and add the Person Record
	if(personMapGroupedByCountry.get(person.getCountry().getIsoCode()) ==null ) {
		List<Person> newPersonList = new ArrayList();
		newPersonList.add(person);
	} else {
		//Hashmap already has the list of person for that specific code
		//Just get the list and next person to that existing list
		personMapGroupedByCountry.get(person.getCountry().getIsoCode()).add(person);
	}
}
return personMapGroupedByCountry;
}


static Date setDate(String dateToSet) throws ParseException{
SimpleDateFormat smdf =  new SimpleDateFormat("dd-MM-yyyy");
Calendar cal = Calendar.getInstance();
cal.setTime(smdf.parse(dateToSet));
return cal.getTime();
}

static Country getCountry(String countryCode){
if(countryMap == null) {
	countryMap = new Country().loadCountry();
}
return countryMap.get(countryCode);
}
}
