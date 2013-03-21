public class ComplexTest {

  public static void main(String[] args) {
    Complex c1 = new Complex(3, 5);
    Complex c2 = Complex.random();
    Complex c3 = new Complex(2);
    Complex c4 = new Complex();
    
    System.out.println("C1: " + c1);
    System.out.println("C2: " + c2);
    System.out.println("C3: " + c3);
    System.out.println("C4: " + c4);
    
    System.out.println("C1 + 12 = " + c1.add(11));
    System.out.println("C2 * 33 = " + c2.multiply(33));
    System.out.println("C1 - C2 = " + c1.subtract(c2));
    System.out.println("C1 / C2 = " + c1.divide(c2));
  }
}
