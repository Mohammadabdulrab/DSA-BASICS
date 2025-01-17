package nestedLoop;

import java.util.Scanner;
public class PrintFibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //...............Question...........
//        Print Fibonacci Numbers
//        You've to print first n Fibonacci numbers. Take as input n,
//        the count of Fibonacci numbers to print.
//
//        The Fibonacci Series is a series of numbers in which each number
//        ( Fibonacci number ) is the sum of the two preceding numbers.
//        The simplest is the series 0, 1, 1, 2, 3, 5, 8, etc.
//
//       Print first n Fibonacci numbers.
        int n=sc.nextInt();
//        int i=1;
//        int sum=0;
//        int a=0;
//        int b=1;
//
//        while(i<=n){
//            if(i==1){
//                System.out.println(0);
//            }
//            if(i==2){
//                System.out.println(1);
//            }
//            if(i>2){
//                sum=a+b;
//                System.out.println(sum);
//                a=b;
//                b=sum;
//            }
//            i++;
//        }

        int i=1;
        int a=0;
        int b=1;
        while(i<=n){
            System.out.println(a);
            int sum=a+b;
            a=b;
            b=sum;
            i++;
        }






    }
}
