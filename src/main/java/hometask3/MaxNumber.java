package hometask3;

public class MaxNumber {

    public static void main (String[] args) {


        int a = 9;
        int b = 10;
        int c = 2;
        int d = 10;

        if (a >= b && a >= b && a >= d) {
            System.out.println(a);
        } else if (b >= c && b >= d) {
            System.out.println(b);
        } else if (c >= d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }
    }
}



