public class RectangleTest {

  public static void main(String[] args) {
    Rectangle r1 = new Rectangle(3, 4);
    Rectangle r2 = new Rectangle(5, 6);

    int sumOfAreas = r1.getArea() + r2.getArea();
    System.out.println("Sum of areas is " + sumOfAreas);

    System.out.println("r1's area: " + r1.getArea());
    System.out.println("r1's perimeter: " + r1.getPerimeter());
    System.out.println("r1's area is"
        + ((r1.hasAreaGreaterThanPerimeter()) ? " " : " not ")
        + "greater than its perimeter.");

    System.out.println("r2's area: " + r2.getArea());
    System.out.println("r2's perimeter: " + r2.getPerimeter());
    System.out.println("r2's area is"
        + ((r2.hasAreaGreaterThanPerimeter()) ? " " : " not ")
        + "greater than its perimeter.");
  }
}
