package hometask9;

public class Case {
    private String size;
    private String material;
    private String color;

    public Case(String size, String material, String color) {
        this.color = color;
        this.material = material;
        this.size = size;
    }

    public void describeCase() {
        System.out.println("Computer case -  " + size + ", " + material + ", " + color);
    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }
}
