public class P2 {

  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++)
      System.out.println(i + "! = " + factorial(i));
  }

  private static int factorial(int n) {
    int product = 1;

    for (int i = 1; i <= n; i++)
      product *= i;

    return product;
  }
}
