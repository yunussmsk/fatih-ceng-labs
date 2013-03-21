public class TriangleTest {

  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      Triangle t = randomTriangle();
      System.out.println("Triangle: " + t);
      System.out.printf("Perimeter: %.2f\n", t.getPerimeter());
      System.out.printf("Area: %.2f\n\n", t.getArea());
    }
  }

  private static Triangle randomTriangle() {
    return new Triangle(randomPoint(), randomPoint(), randomPoint());
  }

  private static Point randomPoint() {
    return new Point(randomInt(), randomInt());
  }

  private static int randomInt() {
    return (int) (Math.random() * 20) - 10;
  }
}
