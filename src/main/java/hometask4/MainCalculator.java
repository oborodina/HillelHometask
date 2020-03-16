package hometask4;

public class MainCalculator {
    public static void main (String[] args) {
        int a = 10;
        int b = 4;

        MainCalculator.add(a, b);
        System.out.println("Sum is " + MainCalculator.add(a, b));
        MainCalculator.subtract(a, b);
        System.out.println("Difference is " + MainCalculator.subtract(a, b));
        multiply(a, b);
        System.out.println("Result of multiplication is " + multiply(a, b));
        divide(a, b);
        System.out.println("Result of division is " + divide(a, b));

        Calculator obj1 = new Calculator();
        obj1.add(5, 5, 5);
        System.out.println("Sum1: " + obj1.add(5, 5, 5));
        obj1.add(5, 5, 5, 5);
        System.out.println("Sum2: " + obj1.add(5, 5, 5, 5));

    }

    public static int add (int a, int b) {
        return a + b;
    }

    public static int subtract (int a, int b) {
        return a - b;
    }

    public static int multiply (int a, int b) {
        return a * b;
    }

    public static int divide (int a, int b) {
        return a / b;
    }
}
