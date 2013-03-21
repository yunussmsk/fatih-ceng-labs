public class PointTest {

  public static void main(String[] args) {
    Point p1 = new Point(5, 2);
    Point p2 = new Point(2, 6);
    Point p3 = new Point(5, 6);

    System.out.println("Distance:");
    System.out.println("from " + p1 + " to " + p2 + " is " + p1.distanceTo(p2));
    System.out.println("from " + p2 + " to " + p3 + " is " + p2.distanceTo(p3));
    System.out.println("from " + p3 + " to " + p1 + " is " + p3.distanceTo(p1));
  }
}
