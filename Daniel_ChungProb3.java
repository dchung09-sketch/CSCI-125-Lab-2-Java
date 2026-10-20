/*
Name: Daniel Chung
Student ID: 1331774
Course: CSCI 125- Programming 1
Section: M01
 */

// Problem 3: Casting Differ
/*
Name: Daniel Chung
Course: CSCI 125 programming 1
ID: 1331774
Section: M01
Problem 3
 */
import java.util.Scanner;// This is the starting base for various objects/blueprints
        public class Daniel_ChungProb3{// This class is the starting design for creating various code
        public static void main(String[] args) { // This is the JavaScript entry level code to create strings as arguments
                Scanner input = new Scanner(System.in); // This is a new scanner object that is able to read inputs
                System.out.println("Enter and type any byte value of your choice being: ");// The output of the code would be,""Enter and type any byte value of your choice being: "
                byte byteuserpersonalValue = input.nextByte();// This is a byte value that is being inputed by a scanner which is stored by the variable, "byteuserpersonalValue"
                System.out.println("Enter any type of short value of your choice being:"); // The outcome of the code is, "Enter any type of short value of your choice being:"
                short shortuserpersonalValue = input.nextShort();// This is a short value that is being inputed by a scanner which is stored by the variable, "shortuserpersonalValue"
                System.out.println("Enter and type in any double value of your choice being:");// The output is, "Enter and type in any double value of your choice being:"
                double userpersonaldoubleValue = input.nextDouble();// This is a double value that is being inputed by a scanner which is stored by the variable, "userpersonaldoubleValue"

                int numberchosenByte  = (int) byteuserpersonalValue;// The code allows the byte value to an integer and assigned to the variable "numberchosenByte"
                int numberchosenShort = (int) shortuserpersonalValue;// The code allows the short value to an integer and assigned to the variable "numberchosenShort"
                int numberchosenDouble = (int) userpersonaldoubleValue;// The code allows the byte value to an integer and assigned to the variable "numberchosenByte"

                int sum = numberchosenByte + numberchosenShort + numberchosenDouble;// The code allows to add of the integers values from the variables, "numberchosenByte + numberchosenShort + numberchosenDouble"
                System.out.println("The Total Sum of the Inputs from the Byte, Short, and Double Integers is:" + sum);// The code allows the output in green with the sum of the total


        }// This is the end block of code for the "public static void main(String[] args)" statement
}// This is the end block of code for the "public class Main" blueprint code that was created
