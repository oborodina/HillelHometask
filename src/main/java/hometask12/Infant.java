package hometask12;

public class Infant extends Human {
    public int teeth;

    public Infant (String name, String gender, double age, int teeth) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.teeth = teeth;
    }
    @Override
    public void move () {
        crawl(1);
        System.out.println(name + " is infant and can crawl, " +gender+" cannot walk or run yet");
    }
    @Override
    public void doSomething () {
        System.out.println(name + " is infant and " +gender+ " can only play");
    }
    public void crawl (int speed) {
        System.out.println(name + " is infant and " +gender+ " can crawl with a speed " + speed);
    }
    @Override
    public String toString() {
        return "Infant description: " + "Name: "+ name + ", Gender: " + gender+ ", Age: " + age+ ", Number of teeth: " + teeth;
    }
}

