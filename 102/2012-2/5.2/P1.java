import java.util.Scanner;

public class P1 {
  private static final Scanner s = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Enter a sentence: ");
    String sentence = s.nextLine();
    for (int i = 0; i < 3; i++) {
      String[] words = sentence.split(" ");
      int index = (int) (Math.random() * words.length);
      words[index] = words[index].toUpperCase();
      System.out.println(join(words));
    }
  }

  private static String join(String[] words) {
    String joined = "";
    for (int i = 0; i < words.length; i++)
      joined += words[i] + " ";
    return joined.trim();
  }
}
