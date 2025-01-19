package function;

import java.util.Scanner;

public class Calculate_nPr {

//    Calculate nPr
//    Given 2 numbers n and r. Your task is to calculate nPr n!/(n-r)!.

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }
    public static int getValueInBase(int n,int b){
        int fact_n=1;
        int fact_n_r=1;
        for(int i=1;i<=n;i++){
            fact_n=fact_n*i;
        }
        for(int i=1;i<=(n-b);i++){
            fact_n_r=fact_n_r*i;
        }

        return fact_n/fact_n_r;
    }
}
