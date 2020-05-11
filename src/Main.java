
import model.HardDrive;
import model.Cpu;
import model.ComputerFacade;
import model.Memory;

public class Main {

  public static void main(String[] args) {
    HardDrive hd = new HardDrive("Seagate lixo");
    Memory memo = new Memory("Kingston");
    Cpu cpu = new Cpu("Intel core i9");
    ComputerFacade pcf = new ComputerFacade(cpu, memo, hd);
    pcf.startPC();
  }

}
