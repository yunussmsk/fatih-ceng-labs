import java.util.Scanner;

public class P3 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter your birth year, month, and day: ");
    int y0 = s.nextInt(), m0 = s.nextInt(), d0 = s.nextInt();
    
    System.out.print("Enter today's year, month, and day: ");
    int y1 = s.nextInt(), m1 = s.nextInt(), d1 = s.nextInt();

    int days = dateDiff(y1, m1, d1, y0, m0, d0);

    System.out.println("You are " + days + " days old.");
    System.out.println("You were born on " + weekDay(y0, m0, d0));
    System.out.println("Today is " + weekDay(y1, m1, d1));
  }

  private static int dateDiff(int y1, int m1, int d1, int y2, int m2, int d2) {
    return daysSince010101(y1, m1, d1) - daysSince010101(y2, m2, d2);
  }

  // Calculates number of days passed since January 1 of year 0001
  private static int daysSince010101(int year, int month, int day) {
    return 365 * (year - 1)
         + leapYearsSince01(year - 1)
         + daysSinceNewYear(year, month, day);
  }

  private static int leapYearsSince01(int year) {
    return year / 4 - year / 100 + year / 400;
  }

  private static int daysSinceNewYear(int year, int month, int day) {
    int m, days = 0;
    for (m = 1; m < month; m++)
      days += daysInMonth(year, m);
    return days + day;
  }

  private static int daysInMonth(int year, int month) {
    switch (month) {
      case 2: return isLeap(year) ? 29 : 28;
      case 4: case 6: case 9: case 11: return 30;
      default: return 31;
    }
  }

  private static boolean isLeap(int year) {
    return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
  }

  private static String weekDay(int year, int month, int day) {
    int diff = dateDiff(year, month, day, 2006, 1, 1);
    int index = (diff % 7 + 7) % 7;
    String weekDays[] = { "Sunday", "Monday", "Tuesday",
                          "Wednesday", "Thursday", "Friday", "Saturday" };
    return weekDays[index];
  }
}
