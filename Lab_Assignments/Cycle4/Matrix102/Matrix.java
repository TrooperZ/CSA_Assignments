import java.util.Arrays;

public class Matrix {
    int[][] matrix;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix(int rows, int cols) {
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = i==0 ? j + 1 : arr[i - 1][arr[i].length - 1] + j + 1;
            }
        }
        matrix = arr;
    }

    public void flipHorizontal() {
        int[][] mod = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length-1; j > -1; j--) {
                mod[i][matrix.length-1-j] = matrix[i][j];
            }
        }

        matrix = mod;
    }

    public void flipVertical() {
        int[][] mod = new int[matrix.length][matrix[0].length];

        for (int i = matrix.length-1; i > -1; i--) {
            for (int j = 0; j < matrix[i].length; j++) {
                mod[matrix.length-1-i][j] = matrix[i][j];
            }
        }

        matrix = mod;
    }

    public void transpose() {
        int[][] mod = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    mod[i][j] = matrix[i][j];
                }
                else{
                    mod[i][j] = matrix[j][i];
                }

            }
        }
        matrix = mod;
    }

    public void reflectDiagonal() {
        int[][] mod = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i].length - 1 - i == j) {
                    mod[i][j] = matrix[i][j];
                }
                else{
                    mod[i][j] = matrix[matrix.length-1-i][matrix.length-1-j];
                }

            }
        }
        matrix = mod;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public String toString() {
        return Arrays.deepToString(matrix);
    }

    public String toMatrixString() {
        String str = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                str += j==matrix[i].length-1? matrix[i][j] : matrix[i][j] + " ";
            }
            str += "\n";
        }
        return str;
    }
}
