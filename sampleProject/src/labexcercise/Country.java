/**
 * 
 */
package labexcercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * @author user
 *
 */
public class Country
{
String name;
String isoCode;
Country(){

}
Country(String name, String isoCode){
this.name = name;
this.isoCode = isoCode;
}
public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getIsoCode() {
return isoCode;
}

public void setIsoCode(String isoCode) {
this.isoCode = isoCode;
}

public Map<String, Country> loadCountry() {
Locale[] localeList = Locale.getAvailableLocales();
Map<String, Country> countryMap = new HashMap<>();
for(Locale locale : localeList){
	countryMap.put( locale.getISO3Country(), new Country(locale.getDisplayCountry(), locale.getISO3Country()));
}
return countryMap;
}
}
