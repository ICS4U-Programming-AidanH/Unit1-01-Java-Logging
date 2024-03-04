/***

 Insert document comments here.

* @author  Aidan

* @version 1.0

* @since   02-21-2024

*/
import java.util.Scanner;
//Imports the scanner into the program

public class Logging{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a size of log in meters(0.25, 0.5, 1):");
        //Asks the user to enter length of log being used
        float userInput = sc.nextFloat();
        //Allows the user to input the length
        if (userInput == 0.25) {
            System.out.println("The truck will be able to hold 220 logs with a length of 0.25m");
            //Displays the final result if the value is 0.25
        } else if (userInput == 0.5) {
            System.out.println("The truck will be able to hold 110 0.5m logs");
            //Displays the final result if the value is 0.5
        } else if (userInput == 1) {
            System.out.println("The truck will be able to hold 55 logs with a length of 1m");
            //Displays the final result if the value is 1
        }
        //The display for the correct positive integers
        if (userInput >= 0.25) {
            System.out.println("Please enter a valid positive integer: 0.25, 0.5, 1");
        } else if (userInput >= 0.5) {
            System.out.println("Please enter a valid positive integer: 0.25, 0.5, 1");
        } else if (userInput >= 1) {
            System.out.println("Please enter a valid positive integer: 0.25, 0.5, 1");
        }
        //The display for a positive integer other than the required values
    
        if (userInput < 0) {
            System.out.println("Negative integers cannot be used, please enter a valid positive integer.");
        }
        //The display for a negative integer
        
        sc.close();
    }
}
