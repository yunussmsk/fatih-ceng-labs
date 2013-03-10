import java.util.Scanner;

public class P1 {

  public static void main(String[] args) {
    int[][] matrix = new int[2][3];

    System.out.println("Enter min and max: ");
    Scanner s = new Scanner(System.in);
    int min = s.nextInt(), max = s.nextInt();

    fillMatrix(matrix, min, max);
    System.out.println("Random matrix:");
    printMatrix(matrix);

    int[][] copy = copyMatrix(matrix);
    System.out.println("Copied matrix:");
    printMatrix(copy);

    int[][] reversed = reverseMatrix(matrix);
    System.out.println("Reversed matrix:");
    printMatrix(reversed);
  }

  private static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++)
        System.out.print(matrix[i][j] + " ");
      System.out.println();
    }
  }

  private static int random(int min, int max) {
    return min + (int) (Math.random() * (max - min + 1));
  }

  private static void fillMatrix(int[][] matrix, int min, int max) {
    for (int i = 0; i < matrix.length; i++)
      for (int j = 0; j < matrix[i].length; j++)
        matrix[i][j] = random(min, max);
  }

  private static int[][] copyMatrix(int[][] matrix) {
    int rows = matrix.length, cols = matrix[0].length;
    int[][] copy = new int[rows][cols];

    for (int i = 0; i < rows; i++)
      for (int j = 0; j < cols; j++)
        copy[i][j] = matrix[i][j];

    return copy;
  }

  private static int[][] reverseMatrix(int[][] matrix) {
    int rows = matrix.length, cols = matrix[0].length;
    int[][] reversed = new int[rows][cols];

    for (int i = 0; i < rows; i++)
      for (int j = 0; j < cols; j++)
        reversed[rows - i - 1][cols - j - 1] = matrix[i][j];

    return reversed;
  }
}
