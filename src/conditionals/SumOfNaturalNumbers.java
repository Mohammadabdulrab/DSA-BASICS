package conditionals;

import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        //        .................Question 7.................
//
//
//        Sum of Natural Numbers

//        You are given an integer N. Your task is to output the sum of all natural
//        numbers till N.
//        Natural numbers are a part of the number system, including all the
//        positive numbers from 1 to infinity.

        int n =sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
//
    }
}
