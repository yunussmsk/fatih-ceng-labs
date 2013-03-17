import java.util.Scanner;

public class DateTest {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter year, month, and day: ");
    Date date1 = new Date(s.nextInt(), s.nextInt(), s.nextInt());
    System.out.println(date1);

    System.out.println("Enter year, month, and day: ");
    Date date2 = new Date(s.nextInt(), s.nextInt(), s.nextInt());
    System.out.println(date2);

    if (date1.isNewerThan(date2))
      System.out.println(date1 + " is newer than " + date2);
    if (date2.isNewerThan(date1))
      System.out.println(date2 + " is newer than " + date1);

    int diff = Math.abs(date1.getYear() - date2.getYear());
    System.out.println("Difference is " + diff + " years.");
  }
}
