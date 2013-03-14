import java.util.Scanner;

public class P4 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = s.nextInt();
    System.out.println("e = " + e(n));
  }

  private static double e(int n) {
    if (n <= 0) return 1;
    return 1.0 / f(n) + e(n - 1);
  }

  private static double f(int n) {
    if (n <= 0) return 1;
    return n * f(n - 1);
  }
}
