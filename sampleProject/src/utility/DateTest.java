package utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {

  public static void main(String[] args) throws ParseException {
    String myDate = "20160101100901";
    // other format dd/M/yyyy , dd-M-yyyy hh:mm:ss , yyyy/MM/dd HH:mm:ss
    //yyyyMMddHHmmss
    
    SimpleDateFormat sm = new SimpleDateFormat("yyyyMMddHHmmss");
    System.out.println("parsed date ->" + sm.parse("20160101100901"));
    
    Date sampleDate = new Date();
    String strDate = sm.format(sampleDate);

    System.out.println("strDate->" + strDate);
    PrintCalendar();
  }

  public static void PrintCalendar() {
    Calendar cal = new GregorianCalendar(2016, 05, 01);
    Calendar calendarObject = Calendar.getInstance();

    SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
    String strDate = sm.format(cal.getTime());
    System.out.println("Date returned from calendar->" + strDate);
    System.out.println("Year->" + cal.get(Calendar.YEAR));
    System.out.println("Month->" + cal.get(Calendar.MONTH));
    System.out.println("Day->" + cal.get(Calendar.DAY_OF_MONTH));

  }
}
