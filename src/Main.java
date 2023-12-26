public class Main {
    public static void main(String[] args) {

        int n = 5; // Переменная, задающая размер матрицы.
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            if (i == i) {
                matrix[i][i] = 2;
            }
            for (int j = 0; j < matrix.length; j++) {
                if (i < j) {
                    matrix[i][j] = 1;
                }
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}