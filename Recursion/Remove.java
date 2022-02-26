import java.util.Scanner;

class Remove {

    // Remove x from the string
    public static String removeX(String input) {
		// Write your code here
        if(input.length() == 1 && input.charAt(0) == 'x') return "";
        if((input.length() == 0 || input.length() == 1)) return input;
        String result = removeX(input.substring(1, input.length()));
        String temp = String.valueOf(input.charAt(0));
        if(input.charAt(0) == 'x') {
            temp = "";
        } else {
            temp = String.valueOf(input.charAt(0));
        }
        if(result.length() > 0 && result.charAt(0) == 'x') {
            return  temp + result.substring(1, result.length());
        } 
        return temp + result;
	}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(removeX(str));
        s.close();
    }    
}
