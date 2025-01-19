package function;

import java.util.Scanner;

public class BinaryToDecimal {
//    Note : You just need to complete binaryToBinary To Decimal
    //   Given binary representation of a number , convert it to decimal
//   representation.
    //
    //   Decimal function.
    //
    //
    //EXAMPLE 1
    //Input:
    //
    //111
    //
    // Output::
    //
    // 7
    public static long binaryToDecimal(long binaryNumber) {
       long sum=0;
       long p=0;
       long rem;
       while(binaryNumber>0){
            rem=binaryNumber%10;
           sum+=rem*Math.pow(2, p);
           binaryNumber=binaryNumber/10;
           p++;
       }
       return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long binaryNumber = scanner.nextInt();
        System.out.println(binaryToDecimal(binaryNumber));
        scanner.close();
    }
}
