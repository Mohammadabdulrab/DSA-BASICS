package nestedLoop;

import java.util.Scanner;
public class PrintNumberPattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //................Question...............

//        Print Number Pattern 2
//        Given an integer n, print a pattern of n lines, where the ith line has
//        the numbers i to 1 printed in descending order. Check the sample cases
//        for a better understanding.

//        1
//        21
//        321
//        4321
//        54321

        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
