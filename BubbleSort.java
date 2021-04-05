import java.util.Scanner;

class BubbleSort {
    public static void main(String[] args) {
        // Bubble Sort by Gazela
        System.out.println("==============================");
        System.out.println("         Bubble Sort");
        System.out.println("==============================\n");

        Scanner input = new Scanner(System.in);
        
        // Input numbers to sort
        System.out.print("Enter the string of numbers to sort (use , as separator): ");
        String numbersString = input.nextLine();

        input.close();

        // Convert array of strings to array of ints
        String numbersSplit[] = numbersString.split(",");
        int numbersArray[] = new int[numbersSplit.length];
        for(int i=0; i<numbersSplit.length; i++) {
            // Delete spaces
            String number = numbersSplit[i].trim();
            // Convert string to int
            numbersArray[i] = Integer.parseInt(number);
        }

        // Sorting
        int arrayLength = numbersArray.length;
        int temp;
        // Chceck if array is sorted
        while(arrayLength > 1) {
            for(int i=0; i<arrayLength-1; i++) {
                // Chceck if next number is greater than previous
                if(numbersArray[i] > numbersArray[i+1]) {
                    // Swap numbers
                    temp = numbersArray[i];
                    numbersArray[i] = numbersArray[i+1];
                    numbersArray[i+1] = temp;
                }
            }
            arrayLength--;
        }
        
        // Print result in the console
        System.out.print("Sorted numbers: ");
        for(int i=0; i<numbersArray.length; i++) {
            if(i == numbersArray.length-1) {
                System.out.print(numbersArray[i]);
            } else {
                System.out.print(numbersArray[i] + ", ");
            }
        }

        // I thinked about that, this piece of code is not uselsess at all :/
    }
}