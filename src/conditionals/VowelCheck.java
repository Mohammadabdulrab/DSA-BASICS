package conditionals;

import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) throws Throwable {


//        Vowel Check
//        Write a Java program and check if the entered character is a vowel or a consonant
//
//        Input Format
//        The line contains a character.
//
//                Output Format
//        Print 1 if it is a vowel and -1 if it is not.
//
//                Example 1
//        Input
//
//                a
//        Output
//
//        1


        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);

        if(ch=='a' || ch=='u' || ch=='e' || ch=='i' || ch=='o' ){
            System.out.println(1);
        }
        else{
            System.out.println(-1);
        }

    }
}
