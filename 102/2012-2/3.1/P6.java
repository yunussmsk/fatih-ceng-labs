public class P6 {

  public static void main(String[] args) {
    System.out.print("Enter an integer: ");
    printReversed(new java.util.Scanner(System.in).nextInt());
  }

  private static void printReversed(int n) {
    if (n <= 0) return;
    System.out.print(n % 10 + " ");
    printReversed(n / 10);
  }
}
