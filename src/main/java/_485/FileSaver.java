package _485;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileSaver {

    public static void main(String[] args) {

        File dir = new File("D:\\Dropbox\\Java\\File.txt");
        File dir2 = new File("D:\\Dropbox");
        try {
            BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(dir));

            if (dir2.isDirectory()) {
                String[] dirContents = dir2.list();
                for (int i = 0; i < dirContents.length; i++) {
                    writer.write(dirContents[i] + "\n");
                    System.out.println(dirContents[i]);
                }
                writer.flush();
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
