package loops;

import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) {

        // ................Question............

//        Check Prime

//        Write a program that inputs a positive integer N.
//        It should then output a message indicating whether the number is a
//        prime number or not.

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        // time complexity O(n)

        int count=0;
        int i=1;
        while(i<=n){
            if(n%i==0){
                count=count+1;
            }
            i++;
        }
        if(count==2){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }

        // time complexity O(n/2)

        // time complexity O(sqrt of n)

    }
}
