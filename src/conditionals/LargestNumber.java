package conditionals;

import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        //................Question 8...................

        // find the largest number

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>=b && a>=c){
            System.out.println(a+" is largest number");
        }
        else if(b>=a && b>=c){
            System.out.println(b+" is largest number");
        }
        else{
            System.out.println(c+" is largest number");
        }
    }
}
