public class RegularPolygonTest {
  public static void main(String[] args) {
    RegularPolygon p1 = new RegularPolygon();
    RegularPolygon p2 = new RegularPolygon(4, 6);
    RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);

    System.out.println("P1:");
    System.out.println("Perimeter: " + p1.getPerimeter());
    System.out.println("Area: " + p1.getArea());

    System.out.println("P2:");
    System.out.println("Perimeter: " + p2.getPerimeter());
    System.out.println("Area: " + p2.getArea());

    System.out.println("P3:");
    System.out.println("Perimeter: " + p3.getPerimeter());
    System.out.println("Area: " + p3.getArea());
  }
}
