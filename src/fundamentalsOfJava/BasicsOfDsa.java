package fundamentalsOfJava;
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

        //Question 8

//   Verify Cube
//   Take two positive integers from the user.
//   Verify if (a+b)^3 = a^3 + b^3 + 3a^2b + 3ab^2.
//
//   Calculate the Left hand side (LHS) and the right hand side (RHS) of the equation.
//   Print the (LHS) and the (RHS).
//
//   Print VERIFIED in uppercase if they are equal, otherwise print NOT VERIFIED.

//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int lhs=(a+b)*(a+b)*(a+b);
//        int rhs=a*a*a+b*b*b+3*a*b*(a+b);
//        System.out.println(lhs);
//        System.out.println(rhs);
//        if(lhs==rhs){
//            System.out.println("VERIFIED");
//        }
//        else{
//            System.out.println(" NOT VERIFIED");
//        }


        //Question 9


//        Input / Output in Programming
//        In this challenge, you will learn to read input for the first time. The most popular way to read input in java is by using Scanner.
//
//          For example:
//
//        Scanner scanner = new Scanner(System.in);
//        int myInt = scanner.nextInt();
//        For printing it
//
//        System.out.println( myInt);
//        The code above creates a Scanner object named scanner and uses it to read an integer. It prints output using System.out.println(MyInt). So, if our input is:
//
//        5
//        Our code will print:
//
//        5
//        In this challenge, you must read 3 integers and then print them. Each integer must be printed on a new line.

//       int a=sc.nextInt();
//       System.out.println(a);
//       String name=sc.nextLine();
//       System.out.println(name);
//       char ch=sc.next().charAt(0);
//       System.out.println(ch);

        // Question 10

//        Variable Practice Question 4
//        Declare two variables as a and b.
//        Initialize the values to those variables as 1042 and 7 respectively.
//
//        Declare another two variables quo and rem that will store the quotient
//        and remainder of these numbers taking a as dividend and b as divisor.
//
//        Print quo and rem in a line separated by a space.

        int a=1042;
        int b=7;
        int quo=a/b;
        int rem=a%b;
        System.out.print(quo);
        System.out.println(" "+rem);




    }
}
