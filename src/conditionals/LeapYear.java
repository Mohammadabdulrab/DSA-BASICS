package conditionals;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //     ..................Question 5...............


//     Leap Year

//    Given a year, find if it is a leap year.
//
//   A Leap year is a year that is multiple of 4. However, multiples of 100 except for the multiples of 400 are not leap years.
//
//   Your task is to print 1 or 0 depending upon if the year is a leap year or not.

        int year=sc.nextInt();
        if(year%4==0 && year%100!=0){
            System.out.println("1");
        }
        else if(year%100==0 && year%400==0){
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}
