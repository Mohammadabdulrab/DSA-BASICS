package nestedLoop;

import java.util.Scanner;
public class StairCasePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //...............Question.............

//   Staircase
//   In this question, you need to write a program that prints a staircase of size N.
//
//  This is a staircase of size n=4:
//
//              #
//             ##
//            ###
//           ####

        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
