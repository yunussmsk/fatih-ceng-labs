public class Rectangle {
  private int width, height;

  public Rectangle(int w, int h) {
    width = w;
    height = h;
  }

  public int getArea() {
    return width * height;
  }

  public int getPerimeter() {
    return 2 * (width + height);
  }

  public boolean hasAreaGreaterThanPerimeter() {
    return getArea() > getPerimeter();
  }
}
