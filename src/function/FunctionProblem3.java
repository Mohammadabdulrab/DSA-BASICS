package function;

import java.util.Scanner;

public class FunctionProblem3 {
    //............Question.............
//    Function Problem 3
//    Lily wants to enter a positive integer and increase
//    its value by 5 using for loop.
//
//    She wants to increase the value in fun function & print the
//    result in the caller function.
//
//    Help Lily by writing a program for the same.

    public static void fun(int n){
        int sum=n;
        for(int i=1;i<=5;i++){
            sum=sum+1;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fun(n);

    }
}
