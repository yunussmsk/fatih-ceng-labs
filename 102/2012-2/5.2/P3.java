import java.util.Scanner;

public class P3 {
  private static Scanner s = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Enter your full name: ");
    String input = s.nextLine();

    System.out.println("Initials: " + initialsOf(input));
    System.out.println("Letters : " + letterCount(input));
  }

  private static String initialsOf(String sentence) {
    String initials = "";
    String[] words = sentence.split(" ");
    for (int i = 0; i < words.length; i++)
      initials += Character.toUpperCase(words[i].charAt(0));
    return initials;
  }

  private static int letterCount(String sentence) {
    int count = 0;
    for (int i = 0; i < sentence.length(); i++)
      if (Character.isLetter(sentence.charAt(i)))
        count++;
    return count;
  }
}
