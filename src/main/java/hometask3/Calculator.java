package hometask3;

public class Calculator {
    public static void main (String[] args) {
        int a = 10;
        int b = 4;

        Calculator.add(a, b);
        System.out.println("Sum is " + Calculator.add(a, b));
        Calculator.subtract(a, b);
        System.out.println("Difference is " + Calculator.subtract(a, b));
    }

    static int add (int a, int b) {
        return a + b;
    }

    static int subtract (int a, int b) {
        return a - b;
    }
}
