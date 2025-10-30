import java.util.Scanner;

class StringRecurision {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        // print all the char of the string
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

        // print char of any particular index
        char ch = s.charAt(1);
        System.out.println("Char of 0 index: "+ch); 

        // SubString ->  this method print begining and last of the String

        String newString = s.substring(2, 5);
        System.out.println("New string is : " + newString);

        */









        // Remove all the occurance of 'a' from the string s = "abcax"

        // by ittration method
    
        String s = "abcax";
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a') {
                ans += s.charAt(i);
            }
        }

        // System.out.println(ans);


  
    }
    
}