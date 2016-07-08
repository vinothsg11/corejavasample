package utility;

/**
 * Created by user on 6/20/2016.
 */
public class EnumTest {
  EnumDay day;

  public EnumTest(EnumDay day) {
    this.day = day;
  }

  public void tellItLikeItIs() {
    switch (day) {
    case MONDAY:
      System.out.println("Mondays are bad.");
      break;

    case FRIDAY:
      System.out.println("Fridays are better.");
      break;

    case SATURDAY:
    case SUNDAY:
      System.out.println("Weekends are best.");
      break;

    default:
      System.out.println("Midweek days are so-so.");
      break;
    }
  }

  public static void main(String[] args) {
    EnumTest firstDay = new EnumTest(EnumDay.MONDAY);
    firstDay.tellItLikeItIs();

    EnumDay enumValues[] = EnumDay.values();
    try {
      System.out.println("Get Enum value using String -> " + EnumDay.valueOf("FRIDAY1"));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    for (int i = 0; i < enumValues.length; i++) {
      System.out.println(enumValues[i]);
    }

    for (int i = 0; i < enumValues.length; i++) {
      System.out.println(enumValues[i]);
      System.out.println(EnumDay.valueOf(enumValues[i].toString()));
    }

    // Get starting time based on the day
    System.out.println("Start of the working time ->" + getWorkintTime("MONDAY"));
  }

  static int getWorkintTime(String workingDay) {
    return EnumDayWithHours.valueOf(workingDay).start;
  }
}