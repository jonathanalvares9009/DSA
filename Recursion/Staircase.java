import java.util.Scanner;

class Staircase {

    // A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time. 
    // Implement a method to count how many possible ways the child can run up to the stairs.
    // You need to return number of possible ways W.
    public static int staircase(int n) {
        if(n <= 0) return 0;
        else if(n == 1) return 1;
        else if(n == 2) return 2;
        else if(n == 3) return 4;
        int x = staircase(n-1);
        int y = staircase(n-2);
        int z = staircase(n-3);
        return x + y + z;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(staircase(n));
        s.close();
    }    
}
