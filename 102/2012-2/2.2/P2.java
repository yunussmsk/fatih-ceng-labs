public class P2 {

  public static void main(String[] args) {
    int[][] matrix = randomMatrix(8, 7, 1, 9);
    printEmployeeTable(matrix);
    int[] sums = sumRows(matrix);
    printSorted(sums);
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

  private static void printEmployeeTable(int[][] matrix) {
    System.out.println("            Sun Mon Tue Wed Thu Fri Sat");
    for (int i = 0; i < matrix.length; i++) {
      System.out.print("Employee-" + (i + 1));
      for (int j = 0; j < matrix[i].length; j++)
        System.out.printf("%4d", matrix[i][j]);
      System.out.println();
    }
  }

  private static int[] sumRows(int[][] matrix) {
    int[] sums = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++)
      for (int j = 0; j < matrix[i].length; j++)
        sums[i] += matrix[i][j];
    return sums;
  }

  private static void printSorted(int[] sums) {
    for (int i = 0; i < sums.length; i++) {
      int m = 0;
      for (int j = 1; j < sums.length; j++)
        if (sums[j] > sums[m])
          m = j;

      System.out.println("Employee-" + (m + 1) + "  " + sums[m]);

      sums[m] = -1; // Remove printed value to avoid re-printing
    }
  }
}
