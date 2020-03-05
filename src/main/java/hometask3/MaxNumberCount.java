package hometask3;

public class MaxNumberCount {
    public static void main(String[] args){
        int a = 4, b = 100, c = 100, d = 100;

        int max = a >= b && a >= b && a >= d?
                a:b >= c && b >= d?
                c:c >= d?
                d:d;
        int count1= (a==max)?1:0;
        int count2 = (b==max)?1:0;
        int count3 = (c==max)?1:0;
        int count4 = (d==max)?1:0;

        int count = count1+count2+count3+count4;

        System.out.println("Max number is "+ max);
        System.out.println("There are " + count + " equal max numbers");
    }
}