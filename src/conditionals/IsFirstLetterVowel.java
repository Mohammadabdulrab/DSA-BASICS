package conditionals;

import java.util.Scanner;

public class IsFirstLetterVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


//        Is First vowel??
//                Write a program to input a name and check if the first letter of the name is a vowel or not. Note check for both upper case and lower case.
//
//        Input format
//        The First line contains a name
//        Output format
//        print 1 if the first letter is a vowel and 0 if it is a consonant.
//        Example 1
//        Input
//
//                Adarsh
//        Output
//
//        1

        String str=sc.nextLine();
        if(str.charAt(0)=='a' || str.charAt(0)=='e' || str.charAt(0)=='i'|| str.charAt(0)=='o'|| str.charAt(0)=='u'|| str.charAt(0)=='A'|| str.charAt(0)=='E'|| str.charAt(0)=='I'|| str.charAt(0)=='O'|| str.charAt(0)=='U' ){
            System.out.println(1);

        }
        else{
            System.out.println(0);
        }
    }
}
