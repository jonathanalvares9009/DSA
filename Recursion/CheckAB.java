import java.util.Scanner;

class CheckAB {

    // Recursive function that checks if the string was generated using the following rules:
    // a. The string begins with an 'a'
    // b. Each 'a' is followed by nothing or an 'a' or "bb"
    // c. Each "bb" is followed by nothing or an 'a'
    private static boolean checkAB(String input, boolean firstTime) {
        if(input.length() == 0) return true;
        else if(input.length() == 1 && input.charAt(0) == 'a') return true;
        else if(input.length() == 1 && input.charAt(0) == 'b') return false;
        else if(input.charAt(0) == 'a') {
            if(input.charAt(1) == 'a') return checkAB(input.substring(2), false);
            else if(input.length() >=3 && input.charAt(1) == 'b' && input.charAt(2) == 'b') return checkAB(input.substring(3), false);
            return false;
        } else {
            if(firstTime) return false;
            else if(input.charAt(1) == 'b') {
                if(input.length() >=3 && input.charAt(2) == 'a') return checkAB(input.substring(3), false);
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean checkAB(String input) {
		// Write your code here
        return checkAB(input, true);
 	}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(checkAB(str));
        s.close();
    }
}
