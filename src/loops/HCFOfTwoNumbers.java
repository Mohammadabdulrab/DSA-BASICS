package loops;

import java.util.Scanner;
public class HCFOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //..............Question...........
//        HCF of two Numbers
//        Given two number a and b, find their HCF.
//
//        What Is HCF?
//
//         HCF or Highest Common Factor is the greatest common divisor between
//         two numbers.


        int a=sc.nextInt();
        int b=sc.nextInt();

        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        System.out.println(a);
    }
}
