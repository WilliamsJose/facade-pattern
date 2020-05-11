package model;
public class Cpu {
  private String cpu;

  public Cpu(){};

  public Cpu(String cpu) {
    this.cpu = cpu;
  } 

  public void start() {
    System.out.println("CPU Start");
  }

  public void execute() {
    System.out.println("Execute Script Inicialization");
  }

  public void load() {
    System.out.println("CPU Load");
  }

  public void free() {
    System.out.println("CPU Free");
  }
}
