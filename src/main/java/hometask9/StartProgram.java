package hometask9;

public class StartProgram {
    public static void main(String[] args) {
        Case case1 = new Case("Big", "Plastic", "Black");
        Hdd hdd1 = new Hdd("HddModel", (byte) 120);
        Ram ram1 = new Ram("RamModel", (byte) 516);
        Resolution resolution1 = new Resolution(800, 600);
        Monitor monitor1 = new Monitor("Samsung", resolution1);
        MotherBoard motherBoard1 = new MotherBoard("MB model");
        Computer computer1 = new Computer(case1, monitor1, hdd1, ram1, motherBoard1);
        computer1.describeComputer();
        computer1.computerOn();
        computer1.startWork();
        computer1.computerOff();
        computer1.finishWork();
    }
}
