# Java Programming Fundamentals

**Author:** Daniel Chung  
**Course:** CSCI 125 – Programming I  
**Section:** M01  
**Institution:** New York Institute of Technology

## Overview

This collection contains four standalone Java console programs developed for introductory programming coursework. Each program explores a fundamental concept: reading user input, performing arithmetic, converting numeric data types, or applying a temperature conversion formula.

## Programs

| File | Topic | Description |
|------|-------|-------------|
| `Daniel_ChungProb1.java` | Input and Output | Reads an integer from 0–9, a decimal number, and a line of text, then displays the entered values. |
| `Daniel_ChungProb2.java` | Arithmetic Operations | Reads two integers and displays arithmetic results, with a check to prevent division by zero. |
| `Daniel_ChungProb3.java` | Numeric Type Casting | Reads byte, short, and double values, converts them to integers, and calculates their sum. |
| `Daniel_ChungProb4.java` | Temperature Conversion | Reads a Celsius temperature and converts it to Fahrenheit. |

## Concepts Practiced

- Console input using `java.util.Scanner`
- Primitive data types: `byte`, `short`, `int`, and `double`
- String input and output
- Arithmetic and comparison operators
- Conditional statements and the ternary operator
- Explicit numeric casting
- Basic range validation
- Mathematical formulas in Java

## Program Details

### 1. Input and Output

Accepts an integer between 0 and 9, inclusive. If the integer is valid, the program requests a decimal number and a line of text before displaying all three inputs.

An out-of-range integer produces an error message and ends the program. The decimal input is stored as a `double`; it is not restricted to two decimal places.

### 2. Arithmetic Operations

Accepts two integers and calculates a sum, product, and integer quotient. It also displays a result labeled as the difference.

**Known issue:** The difference calculation currently uses addition. Replace:

```java
int difference = firstnumericalnumber + secondnumericalnumber;
```

with:

```java
int difference = firstnumericalnumber - secondnumericalnumber;
```

Division uses integer arithmetic, so a result such as `7 / 2` is `3`. When the second number is zero, the program displays `Cannot divide by zero.`

### 3. Numeric Type Casting

Reads a `byte`, a `short`, and a `double`, casts each to `int`, and adds the converted values.

For ordinary values within the integer range, casting a `double` to `int` removes its fractional portion rather than rounding. For example, inputs of `10`, `200`, and `3.9` produce a sum of `213`.

### 4. Temperature Conversion

Converts Celsius to Fahrenheit using:

```text
Fahrenheit = (Celsius × 9 / 5) + 32
```

The program accepts decimal temperatures. For example, `25` degrees Celsius produces `77.0` degrees Fahrenheit.

## How to Run

### Requirements

Install a Java Development Kit (JDK) and ensure that `javac` and `java` are available in your terminal. No external libraries are required.

### Prepare the Files

Rename `Daniel_ChungProb1 (2).java` to `Daniel_ChungProb1.java` so the filename matches its public class name.

Place all four Java files in the same folder.

### Compile

Open a terminal in that folder and run:

```sh
javac Daniel_ChungProb1.java Daniel_ChungProb2.java Daniel_ChungProb3.java Daniel_ChungProb4.java
```

### Run a Program

Each file has its own `main()` method. Run the desired program individually:

```sh
java Daniel_ChungProb1
```

```sh
java Daniel_ChungProb2
```

```sh
java Daniel_ChungProb3
```

```sh
java Daniel_ChungProb4
```

Follow the console prompts to enter the required values.

## Current Limitations

- Invalid input types are not handled with exception handling.
- Programs do not prompt the user to retry invalid entries.
- Byte inputs must be between -128 and 127.
- Short inputs must be between -32768 and 32767.
- The arithmetic program requires the subtraction correction noted above.

## Learning Objective

Build familiarity with Java syntax, user input, numeric operations, and program flow through small, focused programming exercises.
