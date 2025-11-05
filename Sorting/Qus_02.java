package Sorting;

public class Qus_02 {
    static void sortFruit(String[] fruits){
        for (int i = 0; i < fruits.length-1; i++) {
            int min_index = i;
            for (int j = i+1; j < fruits.length; j++) {
                if (fruits[j].compareTo(fruits[min_index]) < 0) {
                    min_index = j;
                }
            }

            // swaping 
            String temp = fruits[i];
            fruits[i] = fruits[min_index];
            fruits[min_index] = temp;
        }
    }
    public static void main(String[] args) {
        String[] fruits = {"papaya", "lime", "watermelon", "apple", "mango", "Kiwi"};
        sortFruit(fruits);
        for (String val : fruits) {
            System.out.print(val + " ");
        }        
    }
}
