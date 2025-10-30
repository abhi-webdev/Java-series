package MultidimensionalArray;

import java.util.Scanner;

public class UserInput {

    static void printArr(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + " ");
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int r = sc.nextInt();
        System.out.print("Enter the column: ");
        int c = sc.nextInt();

        int[][] arr = new int[3][4];
        System.out.println("Enter " + r*c + " Elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printArr(arr);
    }
}
