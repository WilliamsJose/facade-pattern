package model;
public class Memory {
  private String memory;

  public Memory(){};

  public Memory(String memo) {
    this.memory = memo;
  }

  public void load() {
    System.out.println("Memory Load");
  }
  
  public void free() {
    System.out.println("Memory Free");
  }
}
