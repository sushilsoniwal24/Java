import java.util.Scanner;

public class T_11_Matrix {

    // Todo:- 2D Array Declaration & Initialization In Java.
    public static void met1() {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of rows in your matrix:- ");
        int row_size = in.nextInt();

        System.out.print("Enter number of columns in your matrix:- ");
        int col_size = in.nextInt();

        int[][] mat = new int[row_size][col_size];

        // * Input The Matrix.
        System.out.println("Enter elements of your matrix:- ");
        for (int row = 0; row < row_size; row++) {
            for (int col = 0; col < col_size; col++) {
                mat[row][col] = in.nextInt();
            }
        }

        // * Output The Matrix.
        System.out.print("Your matrix is:- ");
        for (int row = 0; row < row_size; row++) {
            for (int col = 0; col < col_size; col++) {
                System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }

        in.close();
    }

    public static void main(String[] args) {
        met1();
    }
}
