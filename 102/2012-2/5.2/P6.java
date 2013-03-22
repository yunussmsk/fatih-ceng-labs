import java.util.Scanner;

public class P6 {
  private static final Scanner s = new Scanner(System.in);

  public static void main(String[] args) {
    while (true) {
      System.out.print("Enter a sentence: ");
      String sentence = s.nextLine();
      System.out.print("Enter a word of that sentence: ");
      String word = s.nextLine().trim();
      System.out.println(replace(sentence, word, word.toUpperCase()));

      System.out.print("Do you want to continue [yes/no]? ");
      if (s.nextLine().trim().equalsIgnoreCase("no"))
        break;
    }
  }

  private static String replace(String sentence, String word, String replacer) {
    String[] words = sentence.split(" ");
    for (int i = 0; i < words.length; i++)
      if (words[i].equalsIgnoreCase(word))
        words[i] = replacer;
    return join(words);
  }

  private static String join(String[] words) {
    String joined = "";
    for (int i = 0; i < words.length; i++)
      joined += words[i] + " ";
    return joined.trim();
  }
}
