package loops;

import java.util.Scanner;
public class PrintEvenNumber {
    public static void main(String[] args) {

//        ..............Question............
//        Print Even Numbers

//        You are given an integer N. Your task to print all the even numbers
//        from 0 to N.

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //time compelexity O(n)

//       int i=0;
//        while(i<=n){
//            if(i%2==0){
//                System.out.print(i+" ");
//            }
//            i++;
//        }


        //time compelexity O(n/2)

        int i=2;
        while(i<=n){
            System.out.println(i);
            i=i+2;
        }









    }
}
