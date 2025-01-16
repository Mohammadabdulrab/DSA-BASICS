package conditionals;


import java.util.Scanner;
public class WhichAngledTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //   .................Question 6.....................


//        Which angled triangle
//
//        Given the 3 sides of a triangle, find out whether it is acute-angled,
//        right-angled, or obtuse-angled.
//
//        You need to output 1 for acute, 2 for right-angled,
//        and 3 for an obtuse-angled triangle.You can assume that the input values
//        always form a triangle and are valid integers.
//
//        Note
//
//        A triangle is acute-angled, if twice the square of the largest side is
//        less than the sum of squares of all the sides.
//
//        A triangle is obtuse-angled, if twice the square of its largest side is
//        greater than the sum of squares of all the sides.
//
//        A triangle is right-angled, if twice the square of its largest side is
//        exactly equal to the sum of squares of all the sides.

        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();

        int ls=Math.max(Math.max(s1, s2),s3);
        if(2*ls*ls<s1*s1+s2*s2+s3*s3){
            System.out.println("1");
        }
        else if(2*ls*ls>s1*s1+s2*s2+s3*s3){
            System.out.println("3");
        }
        else{
            System.out.println("2");
        }
    }
}
