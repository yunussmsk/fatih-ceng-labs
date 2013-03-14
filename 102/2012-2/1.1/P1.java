public class P1 {

  public static void main(String[] args) {
    int r = (int) (Math.random() * 10) + 1;
    System.out.println("n = " + r);
    drawSquare(r);
    drawRightTriangle(r);
  }

  private static void drawSquare(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++)
        System.out.print("* ");
      System.out.println();
    }
  }

  private static void drawRightTriangle(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++)
        System.out.print("* ");
      System.out.println();
    }
  }
}
