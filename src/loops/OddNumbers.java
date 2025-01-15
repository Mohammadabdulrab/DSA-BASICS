package loops;

import java.util.Scanner;
public class OddNumbers {
    public static void main(String[] args) {

//        ............Question.............
//
//        Odd Numbers

//        You have to keep taking integers as input until you get an odd number
//        as input. Your output will be N, which represents the number of numbers
//        you had to take as input uptill encountering an odd number.

        Scanner sc=new Scanner(System.in);
        int count=0;
        for(; ;){
            int n=sc.nextInt();
            count++;
            if(n%2!=0){
                break;
            }
        }
        System.out.println(count);
    }
}
