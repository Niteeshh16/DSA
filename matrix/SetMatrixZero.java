package matrix;

public class SetMatrixZero {

    static void set(int[][] matrix) {

        int rows = matrix.length;
        int col = matrix[0].length;



        int[] zeroRows = new int[rows];
        int[] zeroCol = new int[col];

        // Find which rows and columns contain 0
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                // if the matrix is 0 then mark it as one using the zeroROws and ZeroCOls
                if (matrix[i][j] == 0) {
                    zeroRows[i] = 1;
                    zeroCol[j] = 1;
                }
            }
        }

        // Set entire row/column to 0
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (zeroRows[i] == 1 || zeroCol[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Print matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {5, 8, 12},
                {7, 0, 15},
                {20, 3, 9}
        };

        set(matrix);
    }
}