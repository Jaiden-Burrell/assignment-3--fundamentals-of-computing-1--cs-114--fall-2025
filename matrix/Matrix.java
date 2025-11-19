// Name: Jaiden Burrell
// Date: November 17, 2025
// Course: CS-114 — Fundamentals of Computing I
// Assignment: Matrix

public class Matrix {

    private int size;
    private int[][] matrix;

    private static final String HIGHLIGHT = "\u001B[33m";
    private static final String NORMAL = "\u001B[0m";

    public Matrix(int dim) {
        size = dim;
        matrix = new int[size][size];
        System.out.println("Matrix created with dimensions: " + size + " by " + size);
    }

    // Performs a simple swap of two matrix elements
    private void swap(int r1, int c1, int r2, int c2) {
        int hold = matrix[r1][c1];
        matrix[r1][c1] = matrix[r2][c2];
        matrix[r2][c2] = hold;
    }

    // Fills matrix with sequential integers starting at 1
    public void populateMatrix() {
        int value = 1;

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                matrix[r][c] = value++;
            }
        }
    }

    // Displays the matrix with the secondary diagonal highlighted
    public void printMatrix() {
        System.out.println();

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {

                boolean secondaryDiagonal = (r + c == size - 1);

                if (secondaryDiagonal) {
                    System.out.print(HIGHLIGHT + matrix[r][c] + NORMAL + "\t");
                } else {
                    System.out.print(matrix[r][c] + "\t");
                }
            }
            System.out.println();
        }

        System.out.println();
    }

    // Flips the matrix across the secondary diagonal
    public void flipMatrix() {

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {

                // Skip diagonal values to avoid unnecessary swapping
                if (row + col == size - 1) {
                    continue;
                }

                // Only move values on one side of the diagonal
                if (row + col < size - 1) {

                    int mirrorRow = size - 1 - row;
                    int mirrorCol = size - 1 - col;

                    swap(row, col, mirrorRow, mirrorCol);
                }
            }
        }
    }
}
