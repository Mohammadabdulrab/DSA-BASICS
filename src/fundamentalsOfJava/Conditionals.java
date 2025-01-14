package fundamentalsOfJava;

import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Question 1
//        Conditional Problem 6
//        You are given two integers a and b. You need to perform the following operations
//
//        If both integers are odd, print `we are odd`.
//        Else print `we are simple`.
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a%2!=0 && b%2!=0){
            System.out.println("we are odd");
        }
        else{
            System.out.println("we are simple");
        }

    }

}
