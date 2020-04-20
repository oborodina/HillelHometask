package hometask9;

public class Ram {
    private String model;
    private byte volume;

    public Ram(String model, byte volume) {
        this.model = model;
        this.volume = volume;
    }

    public void on() {
        System.out.println("Ram initializing...");
    }

    public void off() {
        System.out.println("Ram off");
    }

    public void saveData() {
        System.out.println("Ram saving data...");
    }

    public String getModel() {
        return model;
    }

    public byte getVolume() {
        return volume;
    }

    public void describeRam() {
        System.out.println("Ram description -  " + "model: " + model + ", Volume: " + volume);
    }
}
