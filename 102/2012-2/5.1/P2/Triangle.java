public class Triangle {
  private Point p1, p2, p3;

  public Triangle(Point p1, Point p2, Point p3) {
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
  }

  public double getPerimeter() {
    return p1.distanceTo(p2) + p2.distanceTo(p3) + p3.distanceTo(p1);
  }

  public double getArea() {
    double a = p1.distanceTo(p2);
    double b = p2.distanceTo(p3);
    double c = p3.distanceTo(p1);
    double s = (a + b + c) / 2;
    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
  }

  public String toString() {
    return "(" + p1 + ", " + p2 + ", " + p3 + ")";
  }
}
