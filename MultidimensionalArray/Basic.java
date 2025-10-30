package MultidimensionalArray;

public class Basic {

    static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // int[][] arr = new int[2][3];

        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };

        print(arr);

    }
}
