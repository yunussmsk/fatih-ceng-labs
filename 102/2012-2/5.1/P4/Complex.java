public class Complex {
  public double r, i;

  public Complex(double r, double i) {
    this.r = r;
    this.i = i;
  }

  public Complex(double r) {
    this(r, 0);
  }

  public Complex() {
    this(0, 0);
  }

  public String toString() {
    return String.format("%.2f + %.2fi", r, i);
  }

  public Complex add(Complex other) {
    return new Complex(this.r + other.r, this.i + other.i);
  }

  public Complex add(double num) {
    return new Complex(this.r + num, this.i);
  }

  public Complex subtract(Complex other) {
    return new Complex(this.r - other.r, this.i - other.i);
  }

  public Complex subtract(double num) {
    return new Complex(this.r - num, this.i);
  }

  public Complex multiply(Complex other) {
    double r = this.r * other.r - this.i * other.i;
    double i = this.r * other.i + this.i * other.r;
    return new Complex(r, i);
  }

  public Complex multiply(double num) {
    return new Complex(num * this.r, num * this.i);
  }

  public Complex divide(Complex other) {
    Complex numerator = this.multiply(other.conjugate());
    Complex denominator = other.multiply(other.conjugate());
    return numerator.divide(denominator.r);
  }

  public Complex divide(double num) {
    return new Complex(this.r / num, this.i / num);
  }

  public Complex conjugate() {
    return new Complex(r, -i);
  }

  public static Complex random() {
    return new Complex(Math.random(), Math.random());
  }
}
