package hometask8;

public class Adult extends Infant {

    public String occupation;

    public Adult (String name, String gender, double age, int teeth, String occupation) {
        super(name, gender, age, teeth);
        this.occupation = occupation;
    }

    public void walk (int speed) {
        System.out.println(name + " is adult and " +gender+ " can walk with a speed " + speed);

    }


    public void run (int speed) {
        System.out.println(name + " is adult and " +gender+ " can run with a speed " + speed);

    }

    @Override
    public void move () {

        walk(2);
        run(3);

    }

    @Override
    public void doSomething () {
        System.out.println(name + " is adult and " +gender+ " works as " + occupation);
    }
}
