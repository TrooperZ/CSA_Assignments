public class Main {
    public static void main(String[] args) {

        Matrix matrix = new Matrix(5, 5);

        System.out.println(matrix);
        System.out.println(matrix.toMatrixString());

        matrix.flipHorizontal();

        System.out.println(matrix);
        System.out.println(matrix.toMatrixString());

        matrix.flipVertical();

        System.out.println(matrix);
        System.out.println(matrix.toMatrixString());

        matrix.transpose();

        System.out.println(matrix);
        System.out.println(matrix.toMatrixString());

        matrix.reflectDiagonal();

        System.out.println(matrix);
        System.out.println(matrix.toMatrixString());

    }
}