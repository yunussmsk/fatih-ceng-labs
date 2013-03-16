public class GradeBook {
  private String courseName;

  public GradeBook(String courseName) {
    this.courseName = courseName;
  }

  public void displayMessage() {
    System.out.println("Welcome to '" + courseName + "'!");
  }
}
