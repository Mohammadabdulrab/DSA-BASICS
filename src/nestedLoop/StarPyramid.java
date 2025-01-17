package nestedLoop;

import java.util.Scanner;
public class StarPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //.................Question................

//        Star Pyramid
//        Given an integer n, print a pyramid full of stars with height equal to n.
//            *
//           * *
//          * * *
//         * * * *
//        * * * * *

        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
