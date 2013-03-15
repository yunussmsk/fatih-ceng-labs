public class RoomTest {

  public static void main(String[] args) {
    Room room1 = new Room();
    Room room2 = new Room("E302", "lab", 24, 11);
    Room room3 = new Room("E302");

    room1.display();

    System.out.println(room1.getNo() + " is " + (room1.isEmpty() ? "" : "not ")
        + "empty.");

    System.out.println(room1.getNo() + " is " + (room1.isFull() ? "" : "not ")
        + "full.");

    room1.setPopulation(30);

    System.out.println(room1.getNo() + " is " + (room1.isFull() ? "" : "not ")
        + "full.");

    room2.display();

    room3.display();
  }
}
