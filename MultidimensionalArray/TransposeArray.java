package MultidimensionalArray;

import java.util.Scanner;

public class TransposeArray {
    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] findTranspose(int[][] matrix , int r, int c){
        int[][] ans = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and Col: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElement = r*c;
        System.out.println("Enter " + totalElement + " value: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix: ");
        printMatrix(matrix);

        System.out.println("Output Matric: ");
        int[][] ans = findTranspose(matrix, r, c);

        printMatrix(ans);

    }
    
}
