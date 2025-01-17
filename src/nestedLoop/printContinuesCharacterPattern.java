package nestedLoop;

import java.util.Scanner;
public class printContinuesCharacterPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //............Question..............

//        Print Continuous Character Pattern
//        Given an integer n that denotes the number of rows to be printed,
//        print the pattern in which each row starts with its corresponding
//        alphabet and has a length equal to the row number.
//        (See the examples for a better understanding).
//
//        Note: You can take the alphabet to be cyclic. On reaching Z,
//        you will cycle back to A, then B, and so on.
//        A
//        BC
//        CDE
//        DEFG
//        EFGHI
//        FGHIJK

        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int k=i;
            for(int j=1;j<=i;j++){
                if(k>26){
                    k=1;
                }
                System.out.print((char)(k+64));
                k++;
            }
System.out.println();
        }
    }
}
