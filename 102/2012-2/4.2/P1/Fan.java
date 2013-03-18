public class Fan {
  public static final int SLOW = 1, MEDIUM = 2, FAST = 3;
  private int speed;
  private boolean on;
  private double radius;
  private String color;

  public Fan() {
    this.speed = SLOW;
    this.on = false;
    this.radius = 5.0;
    this.color = "blue";
  }

  public String toString() {
    if (this.on)
      return "Speed: " + speed + ". Color: " + color + ". Radius: " + radius;
    else
      return "Fan is off. Color: " + color + ". Radius: " + radius;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void turnOn() {
    this.on = true;
  }

  public void turnOff() {
    this.on = false;
  }
}
