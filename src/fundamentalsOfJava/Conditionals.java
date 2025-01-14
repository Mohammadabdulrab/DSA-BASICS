package fundamentalsOfJava;

import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Question 1


//        Conditional Problem 6
//        You are given two integers a and b. You need to perform the following operations
//
//        If both integers are odd, print `we are odd`.
//        Else print `we are simple`.


//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        if(a%2!=0 && b%2!=0){
//            System.out.println("we are odd");
//        }
//        else{
//            System.out.println("we are simple");
//        }
//
//        Question 2
//
//
//        Grading System
//        You are given marks of a student as input. Display a correct message based on the following rules:
//
//        for marks above 90, print "Excellent".
//        for marks above 80 and less than equal to 90, print "Good"
//        for marks above 70 and less than equal to 80, print "Fair".
//        for marks above 60 and less than equal to 70, print "Meets Expectations".
//        for marks below and equal to 60, print "Below Expectations".


        int marks=sc.nextInt();

        if(marks>90){
            System.out.println("Excellent");
        }
        else if(marks>80 && marks<=90){
            System.out.println("Good");
        }
        else if(marks>70 && marks<=80){
            System.out.println("Fair");
        }
        else if(marks>60 && marks<=70){
            System.out.println("Meets Expectations");
        }
        else{
            System.out.println("Below Expectations");
        }

    }

}
