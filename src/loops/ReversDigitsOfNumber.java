package loops;

import java.util.Scanner;
public class ReversDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //...............Question...................
//        Reverse digits of a Number

//        Write a program that prompts the user to input an integer and then outputs
//        the number with the digits reversed.
//
//        For example, if the input is 12345, the output should be 54321.
//
//        Note: Input number will not have any trailing zeros.

        int n=sc.nextInt();
        int rn=0;
        while(n>0){
            int rem=n%10;
             rn=rn*10+rem;
            n=n/10;
        }
        System.out.println(rn);
    }
}
