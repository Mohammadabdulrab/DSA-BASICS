package function;

import java.util.Scanner;

public class Calculate_nCr {


    //.............Question..............
//    Calculate nCr
//    Given n and r, your task is to calculate nCr.
//
//    Here nCr is the total number of ways for selecting r elements out
//    of n options are nCr = (n!) / (r! * (n-r)!)  where n! = 1 * 2 * . . . * n.


    public static long calculate_nCr(int n,int r){
        long fact_n=1;
        long fact_r=1;
        for(int i=1;i<=n;i++){
            fact_n=fact_n*i;
        }
        for(int i=1;i<=r;i++){
            fact_r=fact_r*i;
        }
        int t=n-r;
        long fact_n_r=1;
        for(int i=1;i<=t;i++){
            fact_n_r=fact_n_r*i;
        }
        return fact_n/(fact_r*fact_n_r);

    }






   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int r=sc.nextInt();
       long nCr=calculate_nCr(n,r);
       System.out.println(nCr);

    }
}
