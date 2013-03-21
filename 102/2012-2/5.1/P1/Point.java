public class Point {
  private int x, y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "(" + x + ", " + y + ")";
  }

  double distanceTo(Point other) {
    int x = this.x - other.x;
    int y = this.y - other.y;
    return Math.sqrt(x * x + y * y);
  }
}
