package hometask6;

public class StringReverseOrder3 {
    public static void main (String[] args) {

        String str = "hillel";
        char[] arr = str.toCharArray();
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i]);
        }

    }
}