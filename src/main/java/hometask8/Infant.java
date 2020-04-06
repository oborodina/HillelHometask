package hometask8;

public class Infant extends Human {
    public int teeth;

    public Infant (String name, String gender, double age, int teeth) {
        super(name, gender, age);
        this.teeth = teeth;
    }

    public void crawl (int speed) {
        System.out.println(name + " is infant and " +gender+ " can crawl with a speed " + speed);

    }

    @Override
    public void move () {
        crawl(1);
        System.out.println(name + " is infant and can crawl, " +gender+" cannot walk or run yet");
    }

    @Override
    public void doSomething () {
        super.doSomething();
        System.out.println(name + " is infant and " +gender+ " can only play");
    }
}

