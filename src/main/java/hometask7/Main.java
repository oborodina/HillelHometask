package hometask7;

public class Main {
    public static void main (String[] args) {

        Pupil pupil = new Pupil("John", "Doe", 15);

        Teacher teacher = new Teacher();
        teacher.setName("Cameron");
        teacher.getName();
        teacher.setSurname("Dark");
        teacher.getSurname();
        teacher.setAge(50);
        teacher.getAge();

        pupil.display();
        teacher.display();
    }
}
