package ScannTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTest01 {
    public static void main(String[] args) throws FileNotFoundException {
        File f= new File("sleep.txt");
        try {
            Scanner src = new Scanner(f);
            while ((src.hasNext())){
                String line = src.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(f+"not found");
        }
    }
}
