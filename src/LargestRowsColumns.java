import java.util.ArrayList;
import java.util.Random;

public class LargestRowsColumns {
    public static void main(String[] args) {
        int n = 5; // Change this to the desired size of the matrix

        int[][] matrix = new int[n][n];
        Random rand = new Random();

        // Fill the matrix with random 0s and 1s
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(2); // Generates either 0 or 1
            }
        }

        // Print the matrix
        System.out.println("Randomly Generated Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Find rows and columns with the most 1s
        ArrayList<Integer> maxRows = new ArrayList<>();
        ArrayList<Integer> maxCols = new ArrayList<>();
        int maxRowCount = 0;
        int maxColCount = 0;

        for (int i = 0; i < n; i++) {
            int rowCount = 0;
            int colCount = 0;

            for (int j = 0; j < n; j++) {
                rowCount += matrix[i][j];
                colCount += matrix[j][i];
            }

            if (rowCount > maxRowCount) {
                maxRowCount = rowCount;
                maxRows.clear();
                maxRows.add(i);
            } else if (rowCount == maxRowCount) {
                maxRows.add(i);
            }

            if (colCount > maxColCount) {
                maxColCount = colCount;
                maxCols.clear();
                maxCols.add(i);
            } else if (colCount == maxColCount) {
                maxCols.add(i);
            }
        }

        // Print rows with the most 1s
        System.out.println("Row(s) with the most 1s:");
        for (int row : maxRows) {
            System.out.println("Row " + row);
        }

        // Print columns with the most 1s
        System.out.println("Column(s) with the most 1s:");
        for (int col : maxCols) {
            System.out.println("Column " + col);
        }
    }
}
