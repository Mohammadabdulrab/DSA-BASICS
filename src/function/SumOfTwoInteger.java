package function;

import java.util.Scanner;
public class SumOfTwoInteger {

    //...........Question...........

//    Function Problem 2

//  Write a program in which user will enter two positive integers and
//  those two integers will be passed to another function fun.
//
//  The fun function will perform the addition of the two and will print the output.
//
//    Note that, output will be printed inside fun function.

    public static void fun(int a, int b){
        int c=a+b;
        System.out.println(c);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        fun(a, b);
    }
}
