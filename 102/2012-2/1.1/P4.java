import java.util.Scanner;

public class P4 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter numbers: ");

    int n = s.nextInt(), max = n, count = 1;

    while (true) {
      n = s.nextInt();
      if (n == 0) {
        break;
      }
      else if (n > max) {
        max = n;
        count = 1;
      }
      else if (n == max) {
        count++;
      }
    }

    System.out.println("Largest number is " + max);
    System.out.println("Repeat count of " + max + " is " + count);
  }
}
