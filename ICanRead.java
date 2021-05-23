import java.util.Scanner;
import java.io.*;

public class ICanRead {
    public static void main(String[] args) {
        // Program that reads data from txt files and print it into the console
        System.out.println("==============================");
        System.out.println("          I can read");
        System.out.println("==============================\n");

        try {
            File myFile = new File("test0.txt");
            Scanner read = new Scanner(myFile);
            if(!myFile.exists()) {
                System.out.println("File exists!");
            }
            while(read.hasNextLine()) {
                System.out.println(read.nextLine());
            }

            read.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}