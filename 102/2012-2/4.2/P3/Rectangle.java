public class Rectangle {
  private int x, y, width, height;
  private static int rectangleCount = 0;
  public static final int MAX_COUNT = 3;

  public Rectangle() {
    this(0, 0, 1, 1);
  }

  public Rectangle(int x, int y, int width, int height) {
    if (isFull())
      System.out.println("WARNING: Maximum number of rectangles exceeded.");

    this.x = x;
    this.y = y;
    setWidth(width);
    setHeight(height);
    rectangleCount++;
  }

  public static boolean isFull() {
    return rectangleCount >= MAX_COUNT;
  }

  public static int getCount() {
    return rectangleCount;
  }

  public int getArea() {
    return width * height;
  }

  public int getPerimeter() {
    return 2 * (width + height);
  }

  public boolean contains(int x, int y) {
    // Calculate coordinates of borders
    int left = this.x - this.width / 2;
    int right = this.x + this.width / 2;
    int bottom = this.y - this.height / 2;
    int top = this.y + this.height / 2;

    // Return true if given point (x,y) is inside these borders
    return left <= x && x <= right && bottom <= y && y <= top;
  }

  public String toString() {
    return "Rectangle: x:" + x + " y:" + y + " w:" + width + " h:" + height;
  }

  private void setWidth(int width) {
    this.width = width > 0 ? width : 1;
  }

  private void setHeight(int height) {
    this.height = height > 0 ? height : 1;
  }
}
