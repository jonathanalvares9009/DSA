import java.util.Scanner;

class AddStar {

    // Add a star in between if two consecutive characters have the same value.
    public static String addStars(String s) {
		// Write your code here
        if(s.length() == 0 || s.length() == 1) return s;
        String result = addStars(s.substring(1, s.length()));
        if(result.length() > 0 && s.charAt(0) == result.charAt(0)) {
            return String.valueOf(s.charAt(0)) + "*" + result;
        }
        return String.valueOf(s.charAt(0)) + result;
	}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(addStars(str));
        s.close();
    }
}
