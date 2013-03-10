public class P3 {

  public static void main(String[] args) {
    int r = (int) (Math.random() * 11) + 10;

    for (int i = 0; i <= r; i++)
      System.out.println("fibonacci(" + i + ") = " + fibonacci(i));
  }

  private static int fibonacci(int n) {
    int first = 0, second = 1, sum = 0;

    if (n == 0 || n == 1)
      return n;

    for (int i = 1; i < n; i++) {
      sum = first + second;
      first = second;
      second = sum;
    }

    return sum;
  }
}
