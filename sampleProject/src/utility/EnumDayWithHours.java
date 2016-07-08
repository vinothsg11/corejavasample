package utility;

/**
 * Created by user on 6/20/2016.
 */
public enum EnumDayWithHours {
  SUNDAY(10, 1), MONDAY(9, 5), TUESDAY(9, 5), WEDNESDAY(9, 5), THURSDAY(9, 5), FRIDAY(9,
      5), SATURDAY(9, 5);
  int start;
  int end;

  EnumDayWithHours(int startTime, int endTime) {
    start = startTime;
    end = endTime;
  }
}
