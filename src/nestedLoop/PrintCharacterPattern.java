package nestedLoop;

import java.util.Scanner;
public class PrintCharacterPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //.............Question...............

//        Print Character Pattern
//        You are given a number N. Print a pattern consisting of N rows,
//        where the first row has 1 A, the second row has 2 Bs, and so on for N letters
//        . Check the examples for a better understanding.
//        A
//        BB
//        CCC
//        DDDD
//        EEEEE

        int n=sc.nextInt();
        if(n>0 && n<27) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print((char) (i + 64));
                }
                System.out.println();
            }
        }
    }
}
