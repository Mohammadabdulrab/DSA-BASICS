package conditionals;

import java.util.Scanner;
public class NumberOfDays {
    public static void main(String[] args) {

//                ...............Question 4..............
//
//
//
//        Number of Days
//        Given the number of the month, your task is to calculate the number of days present in the particular month.
//
//                Note:- Consider non-leap year.

         Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        if(m==1){
            System.out.println("31");
        }
        else if(m==2){
            System.out.println("28");
        }
        else if(m==3){
            System.out.println("31");
        }
        else if(m==4){
            System.out.println("30");
        }
        else if(m==5){
            System.out.println("31");
        }
        else if(m==6){
            System.out.println("30");
        }
        else if(m==7){
            System.out.println("31");
        }
        else if(m==8){
            System.out.println("31");
        }
        else if(m==9){
            System.out.println("30");
        }
        else if(m==10){
            System.out.println("31");
        }
        else if(m==11){
            System.out.println("30");
        }
        else{
            System.out.println("31");
        }
    }
}
