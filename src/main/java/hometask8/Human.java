package hometask8;

public class Human {
    public String name;
    public String gender;
    public double age;


    public Human (String name, String gender, double age) {
        this.name = name;
        this.gender = gender;
        this.age = age;

    }

    public void breath () {
        if (age > 120) {
            System.out.println("This human cannot breath");
        } else {
            System.out.println("This human can breath");
        }
    }

    public void speak () {
        if (age < 1) {
            System.out.println("This human is Infant and cannot speak well");
        } else {
            System.out.println("This human is adult and can speak well");
        }
    }

    public void eat () {
        System.out.print("All humans need to eat \n");

    }

    public void move () {
        System.out.print("All humans can move");

    }

    public void doSomething () {
        System.out.print("Humans need to perform some activities \n");
    }
}

