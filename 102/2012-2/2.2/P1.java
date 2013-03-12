import java.util.Scanner;

public class P1 {

  public static void main(String[] args) {
    int[][] matrix = readInputMatrix();
    int sum = sumMajorDiagonal(matrix);
    System.out.println("Sum of the elements in the major diagonal is " + sum);
  }

  public static int[][] readInputMatrix() {
    int[][] matrix = new int[4][4];
    Scanner s = new Scanner(System.in);

    System.out.println("Enter a 4-by-4 matrix row by row:");

    for (int i = 0; i < 4; i++)
      for (int j = 0; j < 4; j++)
        matrix[i][j] = s.nextInt();

    return matrix;
  }

  public static int sumMajorDiagonal(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++)
      sum += matrix[i][i];
    return sum;
  }
}
