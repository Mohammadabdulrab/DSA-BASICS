package loops;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {

//        .........Question........
//
//
//        Sum of Natural Numbers

//        You are given an integer N. Your task is to output the sum of all
//        natural numbers till N.
//        Natural numbers are a part of the number system, including all the
//        positive numbers from 1 to infinity.

        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();

        // time complexity O(n)
//        long sum=0;
//        long i=1;
//        while(i<=n){
//            sum=sum+i;
//            i++;
//        }
//        System.out.println(sum);


        // Time Complexity O(1)

        long sum=(n*(n+1))/2;
        System.out.println(sum);
    }
}
