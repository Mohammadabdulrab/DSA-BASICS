package conditionals;

import java.util.Scanner;

public class ConditionalProblem5 {
    public static void main(String[] args) throws Throwable {
        // Your code here

//        Conditional Problem 5
//        Given a number n, If the number is divisible by 6 then print Divisible else Not divisible.
//
//        Input Format
//        First line contains an integer.
//
//                Output Format
//        If the number is divisible by 6 then Divisible will be printed. If the number is not divisible by 6 then Not divisible will be printed.
//
//        Example 1
//        Input
//
//        28
//        Output
//
//        Not divisible
//        Explanation
//
//        28 is not divisible by 6.

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%6==0){
            System.out.println("Divisible");
        }
        else {
            System.out.println("Not divisible");
        }
    }
}
