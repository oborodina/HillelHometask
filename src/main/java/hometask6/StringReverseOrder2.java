package hometask6;

public class StringReverseOrder2 {
    public static void main (String[] args) {

        String [] str = {"h", "i", "l", "l", "e", "l"};
        for (int i = 5; i < str.length; i--) {
            if (i >= 0) {
                System.out.print(str[i]);
            } else {
                break;
            }
        }
    }
}
