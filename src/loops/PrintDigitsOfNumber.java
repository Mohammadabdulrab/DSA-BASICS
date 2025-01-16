package loops;

import java.util.Scanner;
public class PrintDigitsOfNumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //..............Question................

//        Print Digits
//        Given the number n, print its digits starting from most significant digit
//        to least significant digit.

        int n=sc.nextInt();
        int rn=0;
        int countZeros=0;
        boolean trailing=false;
        while(n>0){
            int rem=n%10;
            if(rem!=0){
               trailing=true;
            }
            if(rem==0 && trailing ==false){
                countZeros++;
            }
            rn=rn*10+rem;
            n=n/10;
        }

        while(rn>0){
            int rem=rn%10;
            System.out.println(rem);
            rn=rn/10;
        }
        while(countZeros>0){
            System.out.println(0);
            countZeros--;
        }
    }
}
