package _480;

import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Foo.txt");
            writer.write("hello foo �꼳�� !");
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
