package test;

import java.math.RoundingMode;
import java.text.DecimalFormat;

//BigDecimal
//Math.round
//DecimalFormat

public class DecimalFormatterTest {

  static public void customFormat(String pattern, double value) {
    DecimalFormat myFormatter = new DecimalFormat(pattern);
    myFormatter.setRoundingMode(RoundingMode.HALF_UP);
    String output = myFormatter.format(value);
    System.out.println(value + "  " + pattern + "  " + output);
  }

  static public void main(String[] args) {

    customFormat("###,###.###", 123456.789);
    customFormat("###.##", 123456.789);
    customFormat("000000.000", 123.78);
    customFormat("$###,###.###", 12345.67);
  }

}
