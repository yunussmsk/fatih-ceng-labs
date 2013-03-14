public class P1 {

  public static void main(String[] args) {
    System.out.println(sum(100));
  }

  private static int sum(int num) {
    num = num - num % 5;
    if (num <= 0) return 0;
    return num + sum(num - 5);
  }
}
