package loops;

import java.util.Scanner;
public class FactorialWithLoop {
    public static void main(String[] args) {

       // ..............Question...........


//        Factorial with loop

//    Factorial of any given number n is represented as n! = n * n-1 * n-2 .....* 1.
//    Write a program to calculate the factorial of a given number.
//
//    Note: Factorial of 0 is 1.


        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=n;
        long factorial=1;
        if(i==0){
            System.out.println(1);
        }
        else{
            while(i>=1){
                factorial=factorial*i;
                i--;
            }
        }

        System.out.println(factorial);

    }
}
