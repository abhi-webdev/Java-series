import java.util.*;
public class StringBuider {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello ");
        // Append()
        str.append("World");
        // System.out.println(str);  // Hello world

        // setCharAt(idx, ch) =>  hello -> mello
        str.setCharAt(0, 'M');
        // System.out.println(str); // mello world

        // insert(idx, ch)
        str.insert(2,'y');
        System.out.println(str);  // meyllo world

        // deleteCharAt(ch)
        str.deleteCharAt(2);
        System.out.println(str); // mello world

        
    }
}
