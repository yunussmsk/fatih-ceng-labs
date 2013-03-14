import java.util.Scanner;

public class P5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    print(s.nextInt());
  }

  private static void print(int n) {
    if (n <= 0) return;
    System.out.println(n);
    print(n / 10);
  }
}
