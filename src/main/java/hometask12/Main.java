package hometask12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human adult1 = new Adult("John", "male", 25, 32, "Doctor");
        Human adult2 = new Adult("Bob", "male", 21, 32, "Teacher");
        Human adult3 = new Adult("Tara", "female", 35, 32, "Engineer");

        List<Object> listAdults = new ArrayList<>();
        listAdults.add(adult1);
        listAdults.add(adult2);
        listAdults.add(adult3);
        System.out.println("Size of Adults list: " + listAdults.size());

        for (Object adl : listAdults) {
            System.out.println(adl.toString());
            //  System.out.println(listAdults.indexOf(adult1) +1);
        }
        Human infant1 = new Infant("Bobby", "male", 0.5, 1);
        Human infant2 = new Infant("Tina", "female", 1.2, 4);
        Human infant3 = new Infant("Joan", "female", 0.8, 2);

        List<Object> listInfants = new ArrayList<>();
        listInfants.add(infant1);
        listInfants.add(infant2);
        listInfants.add(infant3);
        System.out.println("Size of Infants list: " + listInfants.size());

        Iterator<Object> iterator = listInfants.listIterator();

        while (iterator.hasNext()) {
            Object ob = iterator.next();
            System.out.println(ob);
        }
        /*infant1.breath();
        infant1.speak();
        infant1.eat();
        infant1.move();
        infant1.doSomething();

        System.out.println("\n");

        adult1.breath();
        adult1.speak();
        adult1.eat();
        adult1.move();
        adult1.doSomething();*/
    }
}