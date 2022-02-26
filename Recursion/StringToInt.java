
import java.util.Scanner;

class StringToInt {
    private static int convertStringToInt(String input, Double pos){
		if(input.length() == 0) return 0;
        if(input.length() == 1) return Integer.parseInt(input);
        int result = convertStringToInt(input.substring(1, input.length()), pos-1);
        return Character.getNumericValue(input.charAt(0)) * (int) Math.pow(10.0, pos-1) + result;
	}

    public static int convertStringToInt(String input){
		return convertStringToInt(input, Double.valueOf(input.length()));
	}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(convertStringToInt(str));
        s.close();
    }
}
