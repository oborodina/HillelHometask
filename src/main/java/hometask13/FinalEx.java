package hometask13;

import java.io.FileInputStream;
import java.io.IOException;

public class FinalEx {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream( "test");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            fileInputStream.close();
        }
    }
}
