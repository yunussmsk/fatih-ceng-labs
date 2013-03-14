public class P3 {

  public static void main(String[] args) {
    countDown(10);
  }

  private static void countDown(int n) {
    if (n <= 1) {
      System.out.println("1 second left!");
      System.out.println("BANG!");
      return;
    }
    System.out.println(n + " seconds left!");
    countDown(n - 1);
  }
}
