package _485;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

class Wczytaj {

    public static void main(String[] args) {
        try {
            File myFile = new File("D:\\Dropbox\\Java\\File.txt");
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);
            while (reader.readLine() != null) {
                System.out.println(reader.readLine());
            }
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }
}
