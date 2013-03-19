public class RegularPolygon {
  private int n;
  private double side, x, y;

  RegularPolygon() {
    this(3, 1, 0, 0);
  }

  RegularPolygon(int n, double side) {
    this(n, side, 0, 0);
  }

  RegularPolygon(int n, double side, double x, double y) {
    setN(n);
    setSide(side);
    this.x = x;
    this.y = y;
  }

  public double getPerimeter() {
    return n * side;
  }

  public double getArea() {
    return n * side * side / 4 / Math.tan(Math.PI / n);
  }

  private void setN(int n) {
    this.n = n > 2 ? n : 3;
  }

  private void setSide(double side) {
    this.side = side > 0 ? side : 1;
  }  
}
