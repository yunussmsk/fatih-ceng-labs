import java.util.Scanner;

public class P5 {
  private static final Scanner s = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Enter a sentence: ");
    String sentence = s.nextLine();
    System.out.print("Enter a position: ");
    int position = s.nextInt();
    s.nextLine(); // After reading the integer, skip the rest of that line
    String word = choose(sentence, position - 1);
    System.out.println("The word at position " + position + " is: " + word);
    System.out.print("Enter a word to replace it with: ");
    String replacement = s.nextLine();
    System.out.println(replace(sentence, position - 1, replacement));
  }

  private static String choose(String sentence, int index) {
    String[] words = sentence.split(" ");
    if (index < 0 || index >= words.length)
      return null;
    return words[index];
  }

  private static String replace(String sentence, int index, String word) {
    String[] words = sentence.split(" ");
    if (index < 0 || index >= words.length)
      return sentence;
    words[index] = word;
    return join(words);
  }

  private static String join(String[] words) {
    String joined = "";
    for (int i = 0; i < words.length; i++)
      joined += words[i] + " ";
    return joined.trim();
  }
}
