public class PairTest {

  public static void main(String[] args) {
    int[][] matrix = randomMatrix();

    System.out.printf("A %dx%d matrix:\n", matrix.length, matrix[0].length);
    printMatrix(matrix);

    Pair p = findMax(matrix);
    int i = p.first, j = p.second, max = matrix[i][j];
    System.out.printf("Its largest element: matrix[%d][%d] = %d\n", i, j, max);
  }

  private static int[][] randomMatrix() {
    int[][] matrix = new int[randomInt(2, 8)][randomInt(2, 8)];
    for (int i = 0; i < matrix.length; i++)
      for (int j = 0; j < matrix[i].length; j++)
        matrix[i][j] = randomInt(10, 99);
    return matrix;
  }

  private static int randomInt(int min, int max) {
    return (int) (Math.random() * (max - min + 1)) + min;
  }

  private static Pair findMax(int[][] matrix) {
    int row = 0, col = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] > matrix[row][col]) {
          row = i;
          col = j;
        }
      }
    }
    return new Pair(row, col);
  }

  private static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++)
        System.out.printf("%2d  ", matrix[i][j]);
      System.out.println();
    }
  }
}
