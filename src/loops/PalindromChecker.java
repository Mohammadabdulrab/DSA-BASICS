package loops;

import java.util.Scanner;
public class PalindromChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


       // ..........Question.................

//        Palindrome Checker

//        Given a number N, you need to check whether the
//        given number is Palindrome or not. A number is said to be Palindrome when
//        it reads the same from backwards as forward.
//
//        Note: Input number will not have any trailing zeros.

        int n=sc.nextInt();
        int n1=n;
        int rn=0;
        while(n>0){
            int rem=n%10;
            rn=rn*10+rem;
            n=n/10;
        }
        if(rn==n1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
