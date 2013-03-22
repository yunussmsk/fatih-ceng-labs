import java.util.Scanner;

public class P4 {
  private static Scanner s = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Enter a sentence: ");
    System.out.println(capitalizeSentence(s.nextLine()));

  }

  private static String capitalizeSentence(String sentence) {
    String[] words = sentence.split(" ");
    String result = "";
    for (int i = 0; i < words.length; i++)
      result += capitalizeWord(words[i]) + " ";
    return result.trim();
  }

  private static String capitalizeWord(String word) {
    return Character.toUpperCase(word.charAt(0)) + word.substring(1);
  }
}
