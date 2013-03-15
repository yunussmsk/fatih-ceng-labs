public class Dog {
  private String name, barksound;

  public Dog(String n, String bs) {
    name = n;
    barksound = bs;
  }

  public void sayName() {
    System.out.println("My name is " + name + ".");
  }

  public void bark() {
    System.out.println(barksound);
  }

  public void sleep() {
    System.out.println("Zzzz");
  }

  public void isHappy() {
    for (int i = 0; i < 3; i++) {
      System.out.println(barksound);
    }
  }

  public void isAngry() {
    for (int i = 0; i < 9; i++) {
      System.out.print(barksound + " ");
    }
  }
}
