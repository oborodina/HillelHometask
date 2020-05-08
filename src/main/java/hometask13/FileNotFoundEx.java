package hometask13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundEx {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("fdksfh");
        try {
            Scanner scanner = new Scanner(file);
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File is not found");
        }

        readFile();
    }
    private static void readFile() throws FileNotFoundException {
        File file1 = new File("xls");
        Scanner scanner = new Scanner(file1);
    }
}
