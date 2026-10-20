/*
Name: Daniel Chung
Student ID: 1331774
Course: CSCI 125- Programming 1
Section: M01
Lab 2 Problem 1
 */

//Problem 1: Basic Input and Output
import java.util.Scanner;//This is the starting base for various objects/blueprints

public class Daniel_ChungProb1 {// This class is the starting design for creating various code
    public static void main(String[] args) {// This is the JavaScript entry level code to create strings as arguments
        Scanner scanner = new Scanner(System.in);// This is a new scanner object that is able to read inputs
        System.out.println("Enter any Single Digit Integer Number:");// The output is "Enter any Single Digit Integer Number:"
        int singledigitInput = scanner.nextInt();// The integer value is stored between the label singledigitInput
        if (singledigitInput < 0 || singledigitInput > 9){ // The if statement should be between the numbers 0 and 9
            System.out.println("Error: The number is not in range.");// The output would be "Error: The number is not in range."
        }else {// This is anelse statement
            System.out.println("Enter any Double Decimal Digit Number of your choice:");// The output would be "Enter any Double Decimal Digit Number of your choice:"
            double decimaldoubleInput = scanner.nextDouble();// The double keyword hold a integer scanner at at variable decimaldoubleInput
            scanner.nextLine();// This promotes the code to the next line
            System.out.print("Enter any string words of your choice:");// The output is "Enter any string words of your choice:"
            String wordedText = scanner.nextLine();// The string is held as a memory at the variable wordedText
            System.out.println("The Numbers and Word you have Chosen will appear as it follows!:");// The output is "The Numbers and Word you have Chosen will appear as it follows!:"
            System.out.println("Integer Number Chosen: " + singledigitInput);// The output is the integer plus the singledigitInput
            System.out.println("The Double Decimal Digit Chosen: " + decimaldoubleInput);// The output is "The Double Decimal Digit Chosen: " + decimaldoubleInput
            System.out.println("The String Wording you have chosen will appear as: " + wordedText);// The output would be "The String Wording you have chosen will appear as: "+ the worded text
            scanner.close();// The scanner is prompted to close
        }//The closing of the else statements





    }// This is the end block of code for the "public static void main(String[] args)" statement
}// This is the end block of code for the "public class Main" blueprint code that was created
