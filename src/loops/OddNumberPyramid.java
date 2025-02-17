package loops;

import java.util.Scanner;

// Odd Number Pyramid
// Take input of N from the user and write a program to print the Full Pyramid Number pattern as follows (N=4) :

//    1
//   333
//  55555
// 7777777

public class OddNumberPyramid {
    public static void main(String[] args) throws Throwable {

        Scanner cs = new Scanner(System.in);
        // System.out.println("Enter the row size:");

        int row_size = cs.nextInt();
        cs.close();
        printPattern(row_size);
    }

    public static void printPattern(int row_size) {
        // your code here
        for(int i=1;i<=row_size;i++){
            for(int k=1;k<=row_size-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(2*i-1);
            }
            System.out.println();
        }
    }
}
