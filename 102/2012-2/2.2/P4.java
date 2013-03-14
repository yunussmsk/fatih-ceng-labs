import java.util.Scanner;

public class P4 {
  private static char[][] grid = new char[3][3];
  private static int row, col, emptyCells = 9;
  private static boolean isDraw = false;
  private static char player = 'O';

  public static void main(String[] args) {
    initGrid();
    while (!gameover()) {
      switchPlayer();
      drawGrid();
      getInput();
      play();
    }

    endGame();
  }

  private static void initGrid() {
    for (int i = 0; i < 3; i++)
      for (int j = 0; j < 3; j++)
        grid[i][j] = ' ';
  }

  private static boolean gameover() {
    // 3 row sum + 3 column sum + 2 diagonal sum
    int[] sums = new int[8];

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        sums[i] += grid[i][j];
        sums[i + 3] += grid[j][i];
      }
      sums[6] += grid[i][i];
      sums[7] += grid[i][2 - i];
    }

    // Somebody wins if "XXX" or "OOO" is found
    for (int i = 0; i < 8; i++)
      if (sums[i] == 3 * 'X' || sums[i] == 3 * 'O')
        return true;

    // Nobody wins and no empty cells
    if (emptyCells == 0) {
      isDraw = true;
      return true;
    }

    return false;
  }

  private static void switchPlayer() {
    player = player == 'X' ? 'O' : 'X';
  }

  private static void drawGrid() {
    System.out.println("—————————————");
    System.out.printf("| %c | %c | %c |\n", grid[0][0], grid[0][1], grid[0][2]);
    System.out.println("—————————————");
    System.out.printf("| %c | %c | %c |\n", grid[1][0], grid[1][1], grid[1][2]);
    System.out.println("—————————————");
    System.out.printf("| %c | %c | %c |\n", grid[2][0], grid[2][1], grid[2][2]);
    System.out.println("—————————————");
  }

  private static void getInput() {
    Scanner s = new Scanner(System.in);

    do {
      System.out.println("Enter row and column values (0, 1, or 2)");
      System.out.print(player + ": ");
      row = s.nextInt();
      col = s.nextInt();
    } while (!valid());
  }

  private static boolean valid() {
    return 0 <= row && row < 3 && 0 <= col && col < 3 && grid[row][col] == ' ';
  }

  private static void play() {
    grid[row][col] = player;
    emptyCells--;
  }

  private static void endGame() {
    drawGrid();
    System.out.println(isDraw ? "It's a draw!" : "Player " + player + " wins!");
  }
}
