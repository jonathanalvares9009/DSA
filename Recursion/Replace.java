import java.util.Scanner;

public class Replace {

    // Replace recurrences of pi with 3.14
    public static String replace(String input) {
        // return replace(input, 0);
        if(input.length() == 0 || input.length() == 1) return input;
        String result = replace(input.substring(1, input.length()));
        if(input.charAt(0) == 'p' && result.charAt(0) == 'i') {
            return "3.14" + result.substring(1, result.length());
        } else {
            return String.valueOf(input.charAt(0)) + result;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(replace(str));
        s.close();
    }
}
