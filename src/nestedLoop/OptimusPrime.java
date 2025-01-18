package nestedLoop;

import java.util.Scanner;
public class OptimusPrime {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);


        //................Question.................

//    Optimus Prime
//    Given an integer n, print all prime numbers between 1 and n (both inclusive).
//
//    Example:
//
//    If n = 8, your program should output all prime numbers between 1 and 8.
//    Thus, it should output:
//
//        2
//        3
//        5
//        7

        int n=sc.nextInt();

        for (int i=2;i<=n;i++){
            int count=0;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                System.out.println(i);
            }
        }

    }
}
