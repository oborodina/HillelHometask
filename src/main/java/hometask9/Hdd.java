package hometask9;

public class Hdd {
    private String model;
    private byte volume;

    public Hdd(String model, byte volume) {
        this.model = model;
        this.volume = volume;
    }

    public void on() {
        System.out.println("Hdd initializing...");
    }

    public void off() {
        System.out.println("Hdd off");
    }

    public void saveData() {
        System.out.println("Hdd saving data...");
    }

    public byte getVolume() {
        return volume;
    }

    public String getModel() {
        return model;
    }

    public void describeHdd() {
        System.out.println("Hdd description -  " + "model: " + model + ", Volume: " + volume);
    }
}

