package conditionals;

import java.util.Scanner;


class Solution {
    public void solve(int n) {
        // write your code here
        if(n==1){
            System.out.println("Monday");
        }
        else if(n==2){
            System.out.println("Tuesday");
        }
        else if(n==3){
            System.out.println("Wednesday");
        }
        else if(n==4){
            System.out.println("Thursday");
        }
        else if(n==5){
            System.out.println("Friday");
        }
        else if(n==6){
            System.out.println("Saturday");
        }
        else {
            System.out.println("Sunday");
        }
    }
}
public class Weekday {


//    Displays the weekday between 1 and 7
//    Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
//
//            Input Format
//    An integer value
//
//    Output Format
//    Return the name of the weekday.
//
//    Example 1
//    Input
//
//1
//    Output
//
//            Monday
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Solution solution = new Solution();
        solution.solve(n);
    }
}
