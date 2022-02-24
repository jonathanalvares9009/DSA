import java.util.ArrayList;

class DynamicArrays {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();

        // Add elements into the arrays
        list.add(1.9);
        list.add(2.9);
        list.add(3.4);
        list.add(3.5);
    
        // Print all the array elements
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
        
        // Summing all elements
        double total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        System.out.println("Total is " + total);
        
        // Finding the largest element
        double max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) max = list.get(i);
        }
        System.out.println("Max is " + max);  
    }
}
