import java.util.Scanner;

class PrintKeypad {

    private static String[] correspondingComb(int n) {
        if(n == 0 || n == 1) {
            String combinations[] = {""};
            return combinations;
        } else if(n == 2) {
            String combinations[] = {"a", "b", "c"};
            return combinations;
        } else if(n == 3) {
            String combinations[] = {"d", "e", "f"};
            return combinations;
        } else if(n == 4) {
            String combinations[] = {"g", "h", "i"};
            return combinations;
        } else if(n == 5) {
            String combinations[] = {"j", "k", "l"};
            return combinations;
        } else if(n == 6) {
            String combinations[] = {"m", "n", "o"};
            return combinations;
        } else if(n == 7) {
            String combinations[] = {"p", "q", "r", "s"};
            return combinations;
        } else if(n == 8) {
            String combinations[] = {"t", "u", "v"};
            return combinations;
        } else {
            String combinations[] = {"w", "x", "y", "z"};
            return combinations;
        }
    }

    private static void printKeypad(int n, String outputString){
		// Write your code here
        if(n == 0) {
            System.out.println(outputString);
            return;
        }
        String result[] = correspondingComb(n%10);
        for(int i=0;i<result.length;i++) {
            printKeypad(n/10, outputString+result[i]);
        }
	}

    // Print keypad combinations
    public static void keypad(int n) {
        int reversed = 0;
        while(n > 0) {
            int remainder = n%10;
            reversed = reversed * 10 + remainder;
            n /= 10;
        }
        printKeypad(reversed, "");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        keypad(n);
        s.close();
    }
}
