package hometask6;

public class StringReverseOrder {
    public static void main (String[] args) {
        String str = "hillel";
        StringBuffer sBuf = new StringBuffer(str);
        System.out.println("\nOriginal String: " + str);
        System.out.println("String in reverse order: " +  sBuf.reverse().toString());
    }
}

