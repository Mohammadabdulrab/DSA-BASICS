package function;

import java.util.Scanner;

public class PlaceValueChecker {

//    Place Value Checker
//    Given a positive integer N. The task is to Create a function and return
//    true or false according to the condition that whether zero is present at
//    the second last place value or not.
//
//    You have to print the output in the calling function itself based on the
//    boolean value you get in return from the function.
//
//    The output should be Yes or No.
//    example input 100
//            output yes
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean res = determineSecondLastDigit(n);
        if (res)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean determineSecondLastDigit(int n){
        int rem=0;
        for(int i=1;i<=2;i++){
            rem=n%10;
            n=n/10;
        }
        if(rem==0){
            return true;
        }
        else{
            return false;
        }
    }
}
