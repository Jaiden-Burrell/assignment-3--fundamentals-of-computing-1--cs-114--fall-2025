// Name: Jaiden Burrell
// Date: November 17, 2025
// Course: CS-114 — Fundamentals of Computing I
// Assignment: Matrix Runner

import java.util.Scanner;

public class RunMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a matrix size: ");
        int size = scan.nextInt();

        Matrix m = new Matrix(size);

        System.out.println("\nPrinting matrix with different values:");
        m.printMatrix();

        System.out.println("Populating matrix... matrix populated");
        System.out.println("Printing matrix:");
        m.populateMatrix();
        m.printMatrix();

        System.out.println("Flipping matrix... matrix flipped");
        System.out.println();
        m.flipMatrix();
        System.out.println("Printed flipped matrix:");
        m.printMatrix();

        scan.close();
    }
}
