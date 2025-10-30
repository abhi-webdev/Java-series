import java.util.Scanner;

public class RemoveOccerance {
    static String removeA(String s, int idx){
        // base case
        if (idx == s.length()) return "";

        // recursive work 
        String smallans = removeA(s, idx+1);
        char currChar = s.charAt(idx);

        // self work
        if (currChar != 'a') {
            return currChar + smallans;
        } else {
            return smallans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeA(s, 0));
    }
}
