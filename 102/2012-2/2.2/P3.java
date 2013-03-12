import java.util.Scanner;

public class P3 {

  public static void main(String[] args) {
    System.out.print("Enter 9 numbers for matrix A: ");
    double[][] A = readMatrix(3, 3);

    System.out.print("Enter 9 numbers for matrix B: ");
    double[][] B = readMatrix(3, 3);

    System.out.println("A =");
    printMatrix(A);

    System.out.println("B =");
    printMatrix(B);

    System.out.println("A x B =");
    printMatrix(multiply(A, B));
  }

  private static double[][] readMatrix(int m, int n) {
    double[][] matrix = new double[m][n];
    Scanner s = new Scanner(System.in);
    for (int i = 0; i < m; i++)
      for (int j = 0; j < n; j++)
        matrix[i][j] = s.nextDouble();
    return matrix;
  }

  // A[m][n] x B[n][p] = C[m][p]
  private static double[][] multiply(double[][] A, double[][] B) {
    int m = A.length, n = B.length, p = B[0].length;

    double[][] C = new double[m][p];

    for (int i = 0; i < m; i++)
      for (int j = 0; j < p; j++)
        for (int k = 0; k < n; k++)
          C[i][j] += A[i][k] * B[k][j];

    return C;
  }

  private static void printMatrix(double[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++)
        System.out.printf("%6.2f ", matrix[i][j]);
      System.out.println();
    }
  }
}
