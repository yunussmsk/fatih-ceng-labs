public class P2 {

  public static void main(String[] args) {
    print("Hello", 5);
  }

  private static void print(String message, int n) {
    if (n <= 0) return;
    System.out.println(message);
    print(message, n - 1);
  }
}
