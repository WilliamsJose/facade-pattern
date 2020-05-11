package model;
public class HardDrive {
  private String hd;

  public HardDrive(){};

  public HardDrive(String hd) {
    this.hd = hd;
  }

  public void read() {
    System.out.println("HardDrive Read Data");
  }

  public void write(String data) {
    System.out.println("HardDrive Write Data: " + data);
  }
}
