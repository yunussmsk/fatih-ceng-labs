public class DogTest {

  public static void main(String[] args) {
    Dog dexter = new Dog("Dexter", "woof");
    Dog luna = new Dog("Luna", "yip");
    Dog thor = new Dog("Thor", "arf");

    dexter.sayName();
    dexter.isHappy();
    luna.sayName();
    luna.bark();
    luna.sleep();
    thor.sayName();
    thor.isAngry();
  }
}
