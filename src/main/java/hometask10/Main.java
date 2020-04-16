package hometask10;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        SingletonExample singleton = SingletonExample.getInstance();
        SingletonExample singleton1 = SingletonExample.getInstance();
        SingletonExample singleton2 = SingletonExample.getInstance();

        System.out.println(singleton.toString());
        System.out.println(singleton1.toString());
        System.out.println(singleton2.toString());

        /* Difference between == and equals */

        String str1 = "abc";
        String str2 = "abc";
        if (str1.equals(str2)) {
            System.out.println("equals() gives True");
        } else {
            System.out.println("equals() gives False");
        }

        String str3 = "test";
        String str4 = str3;
        if (str3 == str4) {
            System.out.println("== gives True");
        } else {
            System.out.println("== gives False");
        }
        String str5 = "aaa";
        String str6 = "amkkm";
        if (str5==str6) {
            System.out.println("== gives True");
        } else {
            System.out.println("== gives False");
        }

        /*hashcode and equals method*/
        MyClass m1 = new MyClass(1L, "name1");
        MyClass m2 = new MyClass(1L, "name2");
        MyClass m3 = new MyClass(1L, "name3");
        /* if(m1.equals(m2)){
           System.out.println("OK");
           System.out.println(m1.hashCode());
           System.out.println(m2.hashCode());
        } */
        Set<MyClass> set = new HashSet<>();
        System.out.println("#1");
        set.add(m1);
        System.out.println("#2");
        set.add(m2);
        System.out.println("#3");
        set.add(m3);
        System.out.println("Size:"+ set.size());


    }
}
