public class Room {
  private String no, type;
  private int capacity, population;

  public Room() {
    this.no = "E302";
    this.type = "lab";
    this.capacity = 24;
    this.population = 10;
  }

  public Room(String no, String type, int capacity, int population) {
    this.no = no;
    this.type = type;
    this.capacity = capacity;
    this.population = population;
  }

  public Room(String no) {
    this.no = no;
    this.type = "lab";
    this.capacity = 24;
    this.population = 10;
  }

  public String getNo() {
    return no;
  }

  public void setPopulation(int newPopulation) {
    if (newPopulation > 0)
      this.population = newPopulation;
  }

  public void display() {
    System.out.println("Room No: " + getNo());
    System.out.println("Type: " + type);
    System.out.println("Capacity: " + capacity);
    System.out.println("Population: " + population);
  }

  public boolean isEmpty() {
    return population == 0;
  }

  public boolean isFull() {
    return population >= capacity;
  }
}
