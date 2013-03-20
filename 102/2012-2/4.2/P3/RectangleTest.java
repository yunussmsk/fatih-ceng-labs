public class RectangleTest {

  public static void main(String[] args) {
    report();
    report(new Rectangle());
    report(new Rectangle(1, 2, 3, 4));
    report(new Rectangle(0, 2, 4, 6));
    report(new Rectangle(3, 2, 1, 0));
  }

  private static void report() {
    System.out.println("MAX_COUNT: " + Rectangle.MAX_COUNT);
    System.out.println("rectangleCount: " + Rectangle.getCount());
    System.out.println("isFull? " + Rectangle.isFull());
    System.out.println();
  }

  private static void report(Rectangle r) {
    System.out.println(r);
    System.out.println("contains(1,1)? " + r.contains(1, 1));
    System.out.println("rectangleCount: " + Rectangle.getCount());
    System.out.println("isFull? " + Rectangle.isFull());
    System.out.println();
  }
}
