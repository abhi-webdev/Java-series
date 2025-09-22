package Methods;

public class InputFunction {
    // print method 
    public static void UserInput(String name){
        System.out.println("Hii.. " + name );
    }

    // Addition method 
    public static int Add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        UserInput("Abhi");
        UserInput("Astha");
        UserInput("Amrit");

        System.out.println(Add(4,5));
    }
}
