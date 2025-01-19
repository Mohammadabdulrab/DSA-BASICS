package function;

import java.util.Scanner;

public class CountFrequencyNumber {
//    CountFrequencyNumber
//    Given a number N and a digit D. Write a program to find how many times the
//    digit D appears in the number N.
//    Example 1
//    Input
//    1111221 1
//    Output -> 5

    public static int countFreqDigit(int n,int d){
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==d){
                count++;
            }
            n=n/10;
        }
        return count;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int d= sc.nextInt();
    System.out.println(countFreqDigit(n,d));
}
}
