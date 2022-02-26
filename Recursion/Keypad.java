import java.util.Scanner;

class Keypad {

    private static String[] correspondingComb(int n) {
        if(n == 0 || n == 1) {
            String combinations[] = {""};
            return combinations;
        } else if(n == 2) {
            String combinations[] = {"A", "B", "C"};
            return combinations;
        } else if(n == 3) {
            String combinations[] = {"D", "E", "F"};
            return combinations;
        } else if(n == 4) {
            String combinations[] = {"G", "H", "I"};
            return combinations;
        } else if(n == 5) {
            String combinations[] = {"J", "K", "L"};
            return combinations;
        } else if(n == 6) {
            String combinations[] = {"M", "N", "O"};
            return combinations;
        } else if(n == 7) {
            String combinations[] = {"P", "Q", "R", "S"};
            return combinations;
        } else if(n == 8) {
            String combinations[] = {"T", "U", "V"};
            return combinations;
        } else {
            String combinations[] = {"W", "X", "Y", "Z"};
            return combinations;
        }
    }


    // Returns keypad combinations
    public static String[] keypad(int n){
		// Write your code here
        if(n==0) {
            String result[] = {""};
            return result;
        }
        String resultArrB[] = keypad(n/10);
        String resultArrA[] = correspondingComb(n%10);
        String result[] = new String[resultArrA.length * resultArrB.length];
        int idx = 0;
        for(int i=0;i<resultArrB.length;i++) {
            for(int j=0;j<resultArrA.length;j++) {
                result[idx] = resultArrB[i] + resultArrA[j];
                idx++;
            }
        }
        return result;
	}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String result[] = keypad(n);
        for(int i=0;i<result.length;i++)
            System.out.print(result[i] + " ");
        System.out.println();
        s.close();
    }
}
