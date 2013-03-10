public class P2 {

  public static void main(String[] args) {
    char[] letters = randomLetters(100);
    int[] counts = letterCounts(letters);
    printLettersWithCounts(counts);
  }

  private static char[] randomLetters(int n) {
    char[] letters = new char[n];
    for (int i = 0; i < n; i++)
      letters[i] = randomLetter();
    return letters;
  }

  private static int[] letterCounts(char[] letters) {
    int[] counts = new int[26];
    for (int i = 0; i < letters.length; i++)
      ++counts[charToIndex(letters[i])];
    return counts;
  }

  private static void printLettersWithCounts(int[] counts) {
    for (int i = 0; i < 26; i++)
      System.out.println(indexToChar(i) + " : " + counts[i]);
  }

  private static char randomLetter() {
    return indexToChar((int) (Math.random() * 26));
  }

  private static char indexToChar(int i) {
    return (char) ('a' + i);
  }

  private static int charToIndex(char c) {
    return c - 'a';
  }
}
