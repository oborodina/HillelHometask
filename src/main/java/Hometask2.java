public class Hometask2 {
    public static void main (String[] args) {

        byte b = -5;
        short s = 25;
        int i = 3, j = 3;
        long l = 100L;
        double d = 32.50;
        float f = 49.3f;
        char c = 'c';
        boolean logic = false;
        ++i;
        --j;
        int x = 1;
        int y = 5;
        int z = x-- + (++y);

        System.out.println("Char: " + c);
        System.out.println("Boolean: " + logic);
        System.out.println("Addition: " + (b + s));
        System.out.println("Subtraction: " + (l - s));
        System.out.println("Multiplication: " + f * b);
        System.out.println("Division: " + s / d);
        System.out.println("Reminder of division: " + s % i);
        System.out.println("Increment of i: " + i);
        System.out.println("Decrement of j: " + j);
        System.out.println("Test of post, -pre increment/decrement z: " + z);
        System.out.println("Test of post, -pre increment/decrement y: " + y);
        System.out.println("Test of post, -pre increment/decrement x: " + x);
    }


}
