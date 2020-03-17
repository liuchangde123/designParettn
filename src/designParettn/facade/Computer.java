package designParettn.facade;

public class Computer {
    private CPU cpu;
    private Memory memory;

    public Computer(CPU cpu, Memory memory) {
        this.cpu = cpu;
        this.memory = memory;
    }

    public void start(){
        this.cpu.start();
        this.memory.start();
    }

    public void shutDown(){
        this.memory.shutDown();
        this.cpu.shutDown();
    }
}
