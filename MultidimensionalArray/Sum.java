package MultidimensionalArray;

public class Sum {

    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] a = {
            {1,2},
            {3,4}
        };
        int[][] b = {
            {5,6},
            {7,8}
        };
        int[][] sum = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                 sum[i][j] = a[i][j] + b[i][j];
            }
        }

        print(sum);
    }
}
