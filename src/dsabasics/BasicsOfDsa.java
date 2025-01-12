package dsabasics;
import java.util.*;
import java.util.Scanner;

//Question 1

//Declare a variable named var and assign it a value of 10.
// Then print the string “My num is ” (without quotes)
// followed by the value stored in the variable.

public class BasicsOfDsa {
    public static void main(String[] args) {
//        int var=10;
//        System.out.println("My num is "+var);

// Question 2

//  Variable Practice Question 2
//  Declare a variable of type float named var and initialize its value to 10.45
//
//  After that re-initialize its value to 20.55 and print the variable var

//        float var=10.45f;
//        var=20.55f;
//        System.out.println(var);

        //Question 3
// Celsius to Fahrenheit 2
//  Given a temperature in Celsius, output the Fahrenheit equivalent of it.
//
//   Note
//
//   Print complete answer up to 6 decimal places.
//
//   To do so, you can use the System.out.printf() function in Java
//
//   For example,
//
//   float myFloat = 76.45678f;
//   System.out.printf("%.3f", myFloat);
//   %.3f is the format specifier used in System.out.printf. It indicates that the value of myFloat should be printed as a floating-point number with three decimal places. The output is rounded to three decimal places: 76.457.
//
//                Input Format
//        Input consists of 1 line of a decimal number.
//
//                Output Format
//        Output consists of a single line of temperature in Fahrenheit.
//
//        EXAMPLE 1
//        Input:
//
//        32
//        Output::
//
//        89.600000
//        EXPLANATION:
//
//        To convert temperatures in degrees Celsius to Fahrenheit, multiply it by 9/5 or 1.8 and add 32.
        //C=5/9(F-32)

        Scanner sc= new Scanner(System.in);
//        double cel=sc.nextDouble();
//        double far=(cel*9)/5+32;
//        System.out.printf("%.6f", far);

// Question 4
//        Celsius to Fahrenheit
//        Given the temperature of a city in Celsius (C) represented by the variable tempInCelsius, your task is to convert the temperature to Fahrenheit (F) and print it.
//
//        Formula : (C* (9/5)) + 32 = F

   //     Note: It is guaranteed that the temperature in Celsius, tempInCelsius, will be a multiple of 5
//        System.out.println("Enter the temperature in Celsius");
//        int cel =sc.nextInt();
//        int far=(cel*9)/5+32;
//        System.out.println(far);

        //Question 5

//        Circle Area-Perimeter
//        You are required to take the radius of a circle as input from the user, and finally, print the area and perimeter of the circle.
//
//        Note: Take pi as 3

//        System.out.println("Enter the value of radius");
//        double radius=sc.nextInt();
//        double AreaOfCircle=3*radius*radius;
//        double PerimeterOfCircle=2*3*radius;
//        System.out.println(AreaOfCircle);
//        System.out.println(PerimeterOfCircle);


        //Question 6

//        Mathematical Operations
//        You are given two positive integers.
//        You have to calculate the result by performing +,-,*,/,% operations on them.
//
//          int a=sc.nextInt();
//          int b=sc.nextInt();
//
//          System.out.println(a+b);
//          System.out.println(a-b);
//          System.out.println(a*b);
//          System.out.println(a/b);
//          System.out.println(a%b);


        //Question 7

//        You are required to take input a string agentName,
//        and finally print the line "Hi my name is Agent insert agentName".

//        String agentName=sc.nextLine();
//        System.out.println("Hi my name is "+agentName);
    }
}
