public class P2 {

  public static void main(String[] args) {

    // 1. Create a 4x5 matrix, and fill with numbers in the range [10,99]
    int[][] matrix = randomMatrix(4, 5, 10, 99);
    System.out.println("The matrix:");
    printMatrix(matrix);

    // 2. Show second column
    int[] secondColumn = getColumn(matrix, 1);
    System.out.println("Second column:");
    printArray(secondColumn);

    // 3. Show first row
    int[] firstRow = matrix[0];
    System.out.println("First row:");
    printArray(firstRow);

    // 4. Find product of sums of second column and first row
    int colSum = arraySum(secondColumn);
    int rowSum = arraySum(firstRow);
    System.out.println("Product of sums: " + colSum * rowSum);

    // 5. Find element in last column of last row
    int lastRow = matrix.length - 1;
    int lastCol = matrix[lastRow].length - 1;
    System.out.println("Last element: " + matrix[lastRow][lastCol]);

    // 6. Find min value and its indices
    int[] min_i_j = findMin(matrix);
    int min = min_i_j[0], i = min_i_j[1], j = min_i_j[2];
    System.out.println("Smallest = matrix[" + i + "][" + j + "] = " + min);

    // 7. Display the product of elements in each column with even index
    for (j = 0; j < matrix[0].length; j += 2) {
      int[] column = getColumn(matrix, j);
      int product = arrayProduct(column);
      System.out.println("Product of nums in column " + j + " is " + product);
    }

    // 8. Find average of all elements in matrix
    System.out.println("Average: " + average(matrix));

    // 9. Multiply each element with its indices
    for (i = 0; i < matrix.length; i++)
      for (j = 0; j < matrix[i].length; j++)
        matrix[i][j] *= i * j;

    // 9. Display modified matrix and its average
    System.out.println("Multiplied each element with its indices:");
    printMatrix(matrix);
    System.out.println("New average: " + average(matrix));
  }

  private static int[][] randomMatrix(int m, int n, int min, int max) {
    int[][] matrix = new int[m][n];
    for (int i = 0; i < m; i++)
      for (int j = 0; j < n; j++)
        matrix[i][j] = random(min, max);
    return matrix;
  }

  private static int random(int min, int max) {
    return min + (int) (Math.random() * (max - min + 1));
  }

  private static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++)
      printArray(matrix[i]);
  }

  private static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++)
      System.out.printf("%3d ", array[i]);
    System.out.println();
  }

  private static int[] getColumn(int[][] matrix, int j) {
    int[] column = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++)
      column[i] = matrix[i][j];
    return column;
  }

  private static int matrixSum(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++)
      sum += arraySum(matrix[i]);
    return sum;
  }

  private static int arraySum(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++)
      sum += array[i];
    return sum;
  }

  private static float average(int[][] matrix) {
    return (float) matrixSum(matrix) / matrix.length / matrix[0].length;
  }

  private static int arrayProduct(int[] array) {
    int product = 1;
    for (int i = 0; i < array.length; i++)
      product *= array[i];
    return product;
  }

  private static int[] findMin(int[][] matrix) {
    int min_i = 0, min_j = 0, min = matrix[0][0];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] < min) {
          min_i = i;
          min_j = j;
          min = matrix[i][j];
        }
      }
    }

    return new int[] { min, min_i, min_j };
  }
}
