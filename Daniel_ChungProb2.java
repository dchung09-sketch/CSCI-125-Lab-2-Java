/*
Name: Daniel Chung
Student ID: 1331774
Course: CSCI 125- Programming 1
Section: M01
Lab 2 Problem 2
*/

// Problem 2: Simple Arithmetic
import java.util.Scanner; // "Main" is the starting base for various objects/blueprints

public class Daniel_ChungProb2 {// This class is the starting design for creating various code
    public static void main(String[] args) {// this is the JavaScript entry level code to create strings as arguments
        Scanner scanner = new Scanner(System.in);// This is a new scanner object that is able to read inputs
        System.out.println("Enter the First Numerical Integer:");// The output for the code would print "Enter the First Numerical Integer:"
        int firstnumericalnumber = scanner.nextInt(); // This code is an integer from the scanner to the variable "firstnumericalnumber"
        System.out.println("Enter the second integer number of your choice:");// The output of the code would print "Enter the second integer number of your choice:"
        int secondnumericalnumber = scanner.nextInt();// This is an integer from the scanner to the variable "secondnumericalnumber"

        int sum = firstnumericalnumber + secondnumericalnumber;// This is adding the integer values from variables "firstnumericalnumber + secondnumericalnumber" together
        int difference = firstnumericalnumber + secondnumericalnumber;// This is difference from  the integer values from variables "firstnumericalnumber + secondnumericalnumber" together
        int product = firstnumericalnumber * secondnumericalnumber;// This is the product integer values from variables "firstnumericalnumber * secondnumericalnumber" together
        int quotient =  (secondnumericalnumber !=0) ? (firstnumericalnumber / secondnumericalnumber): 0;// This dividing the integer values from variables "firstnumericalnumber + secondnumericalnumber" together

        System.out.println("The Sum of the two numbers are : " + sum); // The output would be "The sum of the two numbers are:" with the added sum
        System.out.println("The Difference between the two numbers are: " + difference);// The output would be "The Difference between the two numbers are: " with the difference
        System.out.println("The product of the two numbers chosen are: " + product);// The output would be "The product of the two numbers chosen are: " with the product
        if (secondnumericalnumber != 0) {// This is the starting of the if statement
            System.out.println("The quotient is: " + quotient);// The output would be "The quotient is: " with the quotient product
        } else { // This is the start of the else statement
            System.out.println("Cannot divide by zero.");// The output would be "Cannot divide by zero."
        }
        scanner.close();// This is the code to close the scanner operation
    }// This is the end block of code for the "public static void main(String[] args)" statement
}// This is the end block of code for the "public class Main" blueprint code that was created