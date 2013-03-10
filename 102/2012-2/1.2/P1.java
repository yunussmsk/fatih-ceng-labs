import java.util.Scanner;

public class P1 {

  public static void main(String[] args) {

    System.out.println("Enter a decimal number");

    int dec = new Scanner(System.in).nextInt();
    String hex = dec2hex(dec);

    System.out.println(dec + " is " + hex + " in hex.");
  }

  private static String dec2hex(int dec) {
    String hex = "";
    while (dec != 0) {
      hex = toHexChar(dec % 16) + hex;
      dec /= 16;
    }
    return hex;
  }

  private static char toHexChar(int d) {
    return "0123456789ABCDEF".charAt(d);
  }
}
