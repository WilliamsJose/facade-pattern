package model;
public class ComputerFacade {
    private Cpu cpu;
    private Memory memory;
    private HardDrive HD;

    public ComputerFacade(){};
 
    public ComputerFacade(Cpu cpu,Memory memory,HardDrive HD) {
        this.cpu = cpu;
        this.memory = memory;
        this.HD = HD;
    }
 
    public void startPC() {
        cpu.start();
        HD.read();
        memory.load();
	cpu.load();
        cpu.execute();
	cpu.free();
        memory.free();
	HD.write("troca por um SSD troxa");
    }
}
