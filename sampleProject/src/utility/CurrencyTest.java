package utility;

import java.util.Currency;
import java.util.Locale;

public class CurrencyTest {

  public static void main(String[] args) {
    // Print all the country currency locale
    Locale[] locale = Locale.getAvailableLocales();
    for (Locale l : locale) {
      System.out.println(l.getDisplayCountry());
      System.out.println(l.getISO3Country());

    }
    Currency cur = Currency.getInstance("SGD");
    System.out.println(cur.getSymbol());
    System.out.println(cur.getDisplayName());
  }
}
