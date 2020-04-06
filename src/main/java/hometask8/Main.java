package hometask8;

public class Main {
    public static void main (String[] args) {

        Human infant1 = new Infant("Bobby", "he", 0.5, 1);

        Human adult1 = new Adult("John", "he", 25, 32, "Doctor");
        infant1.breath();
        infant1.speak();
        infant1.eat();
        infant1.move();
        infant1.doSomething();

        System.out.println("\n");

        adult1.breath();
        adult1.speak();
        adult1.eat();
        adult1.move();
        adult1.doSomething();

    }

}
