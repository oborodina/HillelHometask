package hometask7;

public class Pupil {
    String name;
    String surname;
    int age;

    Pupil (String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;

    }
    public void display(){
        System.out.println("This is a pupil: " + name +" " + surname +", his age is " + age);
    }

}
