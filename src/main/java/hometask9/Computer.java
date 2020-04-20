package hometask9;

public class Computer {
    private Case computerCase;
    private Monitor monitor;
    private Hdd hdd;
    private Ram ram;
    private MotherBoard motherBoard;

    public Computer(Case computerCase, Monitor monitor, Hdd hdd, Ram ram, MotherBoard motherBoard) {
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.hdd = hdd;
        this.ram = ram;
        this.motherBoard = motherBoard;
    }

    public Computer() {
    }

    public void computerOn() {
        System.out.println("PC is turned on");
    }

    public void computerOff() {
        System.out.println("PC is turned off");
    }

    public void startWork() {
        hdd.on();
        ram.on();
        hdd.saveData();
        ram.saveData();
        monitor.on();
    }

    public void finishWork() {
        hdd.off();
        ram.off();
        monitor.off();
    }

    public void describeComputer() {
        computerCase.describeCase();
        hdd.describeHdd();
        ram.describeRam();
        monitor.describeMonitor();
        motherBoard.describeMotherBoard();
    }
}
