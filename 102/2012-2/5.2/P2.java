import java.util.Arrays;
import java.util.Scanner;

public class P2 {
  private static Scanner s = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Enter some words: ");
    String input = s.nextLine();
    String[] words = input.split(" ");
    Arrays.sort(words);
    System.out.println(join(words, ", "));
  }

  private static String join(String[] pieces, String glue) {
    String joined = "";
    for (int i = 0; i < pieces.length; i++)
      joined += pieces[i] + glue;
    return joined.substring(0, joined.length() - glue.length());
  }
}
