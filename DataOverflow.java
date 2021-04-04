import java.util.Scanner;
import java.util.Random;
import java.io.*;

class DataOverflow {
    public static void main(String[] args) throws IOException {
        // Random numbers saved to file generator by Gazela
        System.out.println("==============================");
        System.out.println("        Data Overflow");
        System.out.println("==============================\n");
    
        Scanner input = new Scanner(System.in);

        // Amount of numbers to generate
        System.out.print("Enter amount of numbers to generate: ");
        int numbersAmount = input.nextInt();

        // Separator for generated numbers
        input.nextLine();

        System.out.print("Enter separator for numbers: ");
        String numbersSeparator = input.nextLine();

        // Name for a file storing generated numbers
        System.out.print("Enter file name: ");
        String fileName = input.nextLine();

        input.close();

        // Generating numbers to array
        Random random = new Random();
        int numbersArray[] = new int[numbersAmount];

        for(int i=0; i<numbersAmount; i++) {
            numbersArray[i] = random.nextInt(101);
        }

        // Save results to the txt file
        FileWriter write = new FileWriter(fileName + ".txt");
        String text = "";
        
        for(int i=0; i<numbersArray.length; i++) {
            if(i==numbersArray.length-1) {
                text += Integer.toString(numbersArray[i]);
            } else {
                text += Integer.toString(numbersArray[i]) + numbersSeparator;
            }      
        }
        write.write(text);

        write.flush();
        write.close();

        System.out.println("\nNumbers generated to the " + fileName + ".txt file.");
    }   
}