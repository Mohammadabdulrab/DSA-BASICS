package conditionals;

import java.util.Scanner;
public class WhichCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


//      ............... Question 3..............


//        Which Case
//        You are required to take input of a character from the user. The task is to print the following
//
//        1, if the character is a uppercase alphabet(A to Z)
//
//        0, if the character is a lowercase alphabet(a to z)
//
//        -1, if the character is not an alphabet

        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("1");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println("0");
        }
        else{
            System.out.println("-1");
        }
    }
}
