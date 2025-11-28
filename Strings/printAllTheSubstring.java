public class printAllTheSubstring {
    public static void main(String[] args) {
        // print all the substring given in s
        String str = "abcd";
        for (int i = 0; i <= 3; i++) {
            for(int j=i+1; j<=4; j++){
                System.out.print(str.substring(i,j)+ " ");
            }
        }
    }
}
