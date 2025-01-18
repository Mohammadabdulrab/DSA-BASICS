package nestedLoop;

import java.util.Scanner;
public class RightAngledTrianglrStarPattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //.................Question.................

//        Right Angle Triangle Stars
//        Given an integer n, print a right angled triangle full of stars with
//        height and base equal to n.

//        *
//        **
//        ***
//        ****
//        *****
//        ******
//        *******

        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
