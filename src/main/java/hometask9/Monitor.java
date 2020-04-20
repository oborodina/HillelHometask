package hometask9;

public class Monitor {
    private String model;
    private Resolution resolution;

    public Monitor(String model, Resolution resolution) {
        this.model = model;
        this.resolution = resolution;
    }

    public void displayResolution() {
        System.out.println("Monitor resolution -  " + resolution.getX() + "x" + resolution.getY());
    }

    public void on() {
        System.out.println("Monitor on();");
    }

    public void off() {
        System.out.println("Monitor off();");
    }

    public String getModel() {
        return model;
    }

    public void describeMonitor() {
        System.out.print("Monitor model - " + model + ", ");
        displayResolution();
    }
}
