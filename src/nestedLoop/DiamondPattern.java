package nestedLoop;

import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int p = 1; p <= t; p++) {
            int n = sc.nextInt();
            int f = n / 2 + 1;
            for (int i = 1; i <= f; i++) {
                for (int j = 1; j <= f - i; j++) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            int s = n / 2;
            for (int i = 1; i <= s; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= 2 * s - 2 * i + 1; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
