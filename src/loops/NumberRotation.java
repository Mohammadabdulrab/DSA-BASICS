package loops;

import java.util.Scanner;
public class NumberRotation {

//    Number Rotation
//    Given two numbers n and k, you need to rotate n, k times to the right. If k is negative, rotate n, k times to the left.
//
//            Note:
//
//    Rotating right means removing rightmost digit from n and adding it to the start.
//
//    Rotating left means removing leftmost digit from n and adding it to the end.
//
//    Assume that the number of rotations will not result in leading 0's, i.e. n=1203, k =2 such that 0312 is the answer, such test cases will not be given.
//
//    k can be bigger than n
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int p=n;

    int ct=0;
    while(n>0){
        int d=n%10;
        ct=ct+1;
        n=n/10;
    }

    k=k%ct;

    if(k<0){
        k=k+ct;
    }



    int pow=(int)Math.pow(10, k);
    int val1=p%pow;
    int val2=p/pow;

    int ct2=ct-k;
    int val=val1*(int)Math.pow(10,ct2)+val2;
System.out.println(val);
}

}
