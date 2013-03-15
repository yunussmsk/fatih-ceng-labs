import java.util.Scanner;

public class P5 {

  public static void main(String[] args) {

    int[][] temperatures = randomYearTemperatures();

    System.out.print("Enter month (1-12): ");
    int month = new Scanner(System.in).nextInt();
    System.out.print("Temperatures for month " + month + " are: ");
    print(temperatures[month]);

    System.out.println("Average temperatures for each month:");
    for (int i = 0; i < temperatures.length; i++)
      System.out.printf("%d:%.1f°C ", i + 1, avg(temperatures[i]));
    System.out.println();

    int[] md = findMin(temperatures);
    int m = md[0] + 1, d = md[1] + 1, min = temperatures[md[0]][md[1]];
    System.out.printf("Lowest temp %d°C is on day %d of month %d\n", min, d, m);

    System.out.printf("Annual average is %.1f °C\n", avg(temperatures));
  }

  private static int[][] randomYearTemperatures() {
    int[][] months = new int[12][];
    for (int m = 0; m < 12; m++) {
      months[m] = new int[daysInMonth(m)];
      for (int d = 0; d < months[m].length; d++)
        months[m][d] = randomInt(-10, 30);
    }
    return months;
  }

  private static int daysInMonth(int month) {
    switch (month) {
      case 2: return 28;
      case 4: case 6: case 9: case 11: return 30;
      default: return 31;
    }
  }

  private static int randomInt(int min, int max) {
    return (int) (Math.random() * (max - min + 1)) + min;
  }

  private static void print(int[] array) {
    for (int i = 0; i < array.length; i++)
      System.out.print(array[i] + " ");
    System.out.println();
  }

  private static float avg(int[] array) {
    return (float) sum(array) / array.length;
  }

  private static int sum(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++)
      sum += array[i];
    return sum;
  }

  private static float avg(int[][] matrix) {
    return (float) sum(matrix) / matrix.length / matrix[0].length;
  }

  private static int sum(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++)
      sum += sum(matrix[i]);
    return sum;
  }

  private static int[] findMin(int[][] matrix) {
    int min_i = 0, min_j = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] < matrix[min_i][min_j]) {
          min_i = i;
          min_j = j;
        }
      }
    }
    return new int[] { min_i, min_j };
  }
}
