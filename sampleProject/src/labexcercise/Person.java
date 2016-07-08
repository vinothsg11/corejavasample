/**
 * 
 */
package labexcercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author user
 *
 */
public class Person
{
String name;
String nationalIdNumber;
Date dateOfBirth;
Country country;
String city;
String postalCode;
Person(){

}
Person(String name, String nationalIdNumber, Date dateOfBirth,
				Country country, String city,  String postalCode){

this.name = name;
this.nationalIdNumber = nationalIdNumber;
this.dateOfBirth = dateOfBirth;
this.country = country;
this.postalCode =  postalCode;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getNationalIdNumber() {
return nationalIdNumber;
}

public void setNationalIdNumber(String nationalIdNumber) {
this.nationalIdNumber = nationalIdNumber;
}

public Date getDateOfBirth() {
return dateOfBirth;
}

public void setDateOfBirth(Date dateOfBirth) {
this.dateOfBirth = dateOfBirth;
}

public Country getCountry() {
return country;
}

public void setCountry(Country country) {
this.country = country;
}

public String getCity() {
return city;
}

public void setCity(String city) {
this.city = city;
}

public String getPostalCode() {
return postalCode;
}

public void setPostalCode(String postalCode) {
this.postalCode = postalCode;
}

void addPersonData(List<Person> personList , Person person) throws Exception{
if(personList ==  null){
	throw new Exception ("Personal List can not be null");
}
personList.add(person);
}

public int getYearOfBirth(Person person){
Calendar cal = Calendar.getInstance();
cal.setTime(person.getDateOfBirth());
return cal.get(Calendar.YEAR);
}
}
