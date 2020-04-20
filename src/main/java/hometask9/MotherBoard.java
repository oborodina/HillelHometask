package hometask9;

public class MotherBoard {
    private String model;

    public MotherBoard(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void describeMotherBoard() {
        System.out.println("MotherBoard -  " + "model: " + model);
    }
}
