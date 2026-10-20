/*
Name: Daniel Chung
Student ID: 1331774
Course: CSCI 125- Programming 1
Section: M01
 */

//Problem 4: Temperature Conversion

import java.util.Scanner; //"Main" is the starting base for various objects/blueprints
        public class Daniel_ChungProb4{ // This class is the starting design for creating various code
        public static void main(String[] args) { // This is the JavaScript entry level code to create strings as arguments
                Scanner input = new Scanner(System.in); // This is a new scanner object that is able to read inputs
                System.out.println("Enter any type of numerical integer for temperature in Celsius:");// The output presented code would be "Enter any type of numerical integer for temperature in Celsius:"
                double celsiusvalueprovided = input.nextDouble();// This line declares the variable as a type double and allows the user's input to read it as a decimal
                double fahrenheitformulaprovided = (celsiusvalueprovided * 9/5) + 32;// This variable is allowing the provided integer number to be converted from Celsius to farhenheit
                System.out.println("The temperature provided in celsius converted to fahrenheit degrees is: " + fahrenheitformulaprovided);// The output would present the heading in green with the converted integer number calculated in farhenheit



        }// This is the end block of code for the "public static void main(String[] args)" statement


}// This is the end block of code for the "public class Main" blueprint code that was created