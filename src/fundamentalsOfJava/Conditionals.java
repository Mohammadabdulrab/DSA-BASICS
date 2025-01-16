package fundamentalsOfJava;

import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //............Question 1..................


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
//       .............. Question 2.................
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

//
//        int marks=sc.nextInt();
//
//        if(marks>90){
//            System.out.println("Excellent");
//        }
//        else if(marks>80 && marks<=90){
//            System.out.println("Good");
//        }
//        else if(marks>70 && marks<=80){
//            System.out.println("Fair");
//        }
//        else if(marks>60 && marks<=70){
//            System.out.println("Meets Expectations");
//        }
//        else{
//            System.out.println("Below Expectations");
//        }


//      ............... Question 3..............


//        Which Case
//        You are required to take input of a character from the user. The task is to print the following
//
//        1, if the character is a uppercase alphabet(A to Z)
//
//        0, if the character is a lowercase alphabet(a to z)
//
//        -1, if the character is not an alphabet

//        char ch=sc.next().charAt(0);
//        if(ch>='A' && ch<='Z'){
//            System.out.println("1");
//        }
//        else if(ch>='a' && ch<='z'){
//            System.out.println("0");
//        }
//        else{
//            System.out.println("-1");
//        }
//
//
//        ...............Question 4..............
//
//
//
//        Number of Days
//        Given the number of the month, your task is to calculate the number of days present in the particular month.
//
//                Note:- Consider non-leap year.


//        int m=sc.nextInt();
//        if(m==1){
//            System.out.println("31");
//        }
//        else if(m==2){
//            System.out.println("28");
//        }
//        else if(m==3){
//            System.out.println("31");
//        }
//        else if(m==4){
//            System.out.println("30");
//        }
//        else if(m==5){
//            System.out.println("31");
//        }
//        else if(m==6){
//            System.out.println("30");
//        }
//        else if(m==7){
//            System.out.println("31");
//        }
//        else if(m==8){
//            System.out.println("31");
//        }
//        else if(m==9){
//            System.out.println("30");
//        }
//        else if(m==10){
//            System.out.println("31");
//        }
//        else if(m==11){
//            System.out.println("30");
//        }
//        else{
//            System.out.println("31");
//        }

//     ..................Question 5...............


//        Leap Year
//        Given a year, find if it is a leap year.
//
//                A Leap year is a year that is multiple of 4. However, multiples of 100 except for the multiples of 400 are not leap years.
//
//        Your task is to print 1 or 0 depending upon if the year is a leap year or not.

//        int year=sc.nextInt();
//        if(year%4==0 && year%100!=0){
//            System.out.println("1");
//        }
//        else if(year%100==0 && year%400==0){
//            System.out.println("1");
//        }
//        else {
//            System.out.println("0");
//        }

//   .................Question 6.....................


//        Which angled triangle
//
//        Given the 3 sides of a triangle, find out whether it is acute-angled,
//        right-angled, or obtuse-angled.
//
//        You need to output 1 for acute, 2 for right-angled,
//        and 3 for an obtuse-angled triangle.You can assume that the input values
//        always form a triangle and are valid integers.
//
//        Note
//
//        A triangle is acute-angled, if twice the square of the largest side is
//        less than the sum of squares of all the sides.
//
//        A triangle is obtuse-angled, if twice the square of its largest side is
//        greater than the sum of squares of all the sides.
//
//        A triangle is right-angled, if twice the square of its largest side is
//        exactly equal to the sum of squares of all the sides.

//        int s1=sc.nextInt();
//        int s2=sc.nextInt();
//        int s3=sc.nextInt();
//
//        int ls=Math.max(Math.max(s1, s2),s3);
//        if(2*ls*ls<s1*s1+s2*s2+s3*s3){
//            System.out.println("1");
//        }
//        else if(2*ls*ls>s1*s1+s2*s2+s3*s3){
//            System.out.println("3");
//        }
//        else{
//            System.out.println("2");
//        }
//
//
//        .................Question 7.................
//
//
//        Sum of Natural Numbers

//        You are given an integer N. Your task is to output the sum of all natural
//        numbers till N.
//        Natural numbers are a part of the number system, including all the
//        positive numbers from 1 to infinity.

//        int n =sc.nextInt();
//        int sum=0;
//        int i=1;
//        while(i<=n){
//            sum=sum+i;
//            i++;
//        }
//        System.out.println("Sum of first "+n+" positive natural number is :"+sum);



        //................Question 8...................

        // find the largest number

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>=b && a>=c){
            System.out.println(a+" is largest number");
        }
        else if(b>=a && b>=c){
            System.out.println(b+" is largest number");
        }
        else{
            System.out.println(c+" is largest number");
        }
    }

}
