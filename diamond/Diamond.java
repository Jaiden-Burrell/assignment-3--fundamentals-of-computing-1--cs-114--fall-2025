// Name: Jaiden Burrell
// Date: November 17, 2025
// Course: CS-114 — Fundamentals of Computing I
// Assignment: Diamond Pattern Program

import java.util.ArrayList;
import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        // If n is odd, print solid diamond
        if (n % 2 != 0) {

            // Top half
            for (int i = 1; i <= n; i += 2) {
                for (int s = 0; s < (n - i) / 2; s++)
                    System.out.print(" ");
                for (int j = 0; j < i; j++)
                    System.out.print("*");
                System.out.println();
            }

            // Bottom half
            for (int i = n - 2; i >= 1; i -= 2) {
                for (int s = 0; s < (n - i) / 2; s++)
                    System.out.print(" ");
                for (int j = 0; j < i; j++)
                    System.out.print("*");
                System.out.println();
            }

        } else {

            // Even n
            ArrayList<Integer> levels = new ArrayList<>();

            // Build row sizes
            int i = 1;
            while (i <= n) {
                levels.add(i);
                i = (i == 1) ? 2 : i + 2;
            }

            // Top half
            for (int row : levels) {
                for (int s = 0; s < n - row; s++)
                    System.out.print(" ");
                for (int j = 0; j < row; j++)
                    System.out.print("* ");
                System.out.println();
            }

            // Bottom half
            for (int idx = levels.size() - 2; idx >= 0; idx--) {
                int row = levels.get(idx);
                for (int s = 0; s < n - row; s++)
                    System.out.print(" ");
                for (int j = 0; j < row; j++)
                    System.out.print("* ");
                System.out.println();
            }
        }
    }
}
