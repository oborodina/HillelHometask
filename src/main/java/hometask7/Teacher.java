package hometask7;

public class Teacher {
   private String name;
   private String surname;
   private int age;

    Teacher(){
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setSurname (String surname) {
        this.surname = surname;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getName () {
        return name;
    }

    public String getSurname () {
        return surname;
    }

    public int getAge () {
        return age;
    }
    public void display(){
        System.out.println("This is a teacher: " + name +" "+ surname+", his age is "+ age);
    }

}

