package nestedLoop;

import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //................Question................

//        Armstrong Number
//        Write a program to print out all Armstrong numbers between 1 and N.
//
//        A number is called an Armstrong number if the sum of cubes of each digit
//        of the number is equal to the number itself.
//
//        For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )


        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            int k=i;
            int sum=0;
            while(k>0){
                int rem=k%10;
                sum=sum+rem*rem*rem;
                k=k/10;
            }
            if(sum==i){
                System.out.println(sum);
            }
        }
    }
}
