package hometask11;

public class Human extends Creature implements HumanBehaviour {
    public Human() {
    }
    @Override
    public void breath() {
        if (age > 120) {
            System.out.println("This human cannot breath");
        } else {
            System.out.println("This human can breath");
        }
    }
    @Override
    public void speak() {
        if (age < 1) {
            System.out.println("This human is Infant and cannot speak well");
        } else {
            System.out.println("This human is adult and can speak well");
        }
    }
    @Override
    public void eat() {
        System.out.print("All humans need to eat \n");
    }

    @Override
    public void move() {
        System.out.print("All humans can move");
    }
    @Override
    public void doSomething() {
        System.out.print("Humans need to perform some activities \n");
    }
}



