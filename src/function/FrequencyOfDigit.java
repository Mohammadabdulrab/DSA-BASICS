package function;
import java.util.Scanner;
public class FrequencyOfDigit {

//    Frequency of digit
//    You are given a number n and a digit d.
//
//    You are required to calculate the frequency of the digit d in the number n.
//
//    Note:- Don't change the Function Definition in the solution Class just
//    return the frequency to the main function and the main function prints the
//    frequency.

//    Example 1
//        Input
//        986272
//        2
//    Output 2


    public static int FrequencyofDigits(long n, int d){
        int count=0;
        while(n>0){
            long rem=n%10;
            if(rem==d){
                count++;
            }
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int d = sc.nextInt();
        System.out.println(FrequencyofDigits(n, d));
    }
}
