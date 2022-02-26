import java.util.Scanner;

class ReplaceChar {

    // Replace character c1 from string input with c2
    public static String replaceCharacter(String input, char c1, char c2) {
		if(input.length() == 0) return input;
        String partA = "";
        if(input.charAt(0) == c1) {
            partA += c2;
        } else {
            partA += input.charAt(0);
        }
        String partB = replaceCharacter(input.substring(1), c1, c2);
        return partA + partB;
	}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char c1 = s.next().charAt(0);
        char c2 = s.next().charAt(0);
        System.out.println(replaceCharacter(str, c1, c2));
        s.close();
    }
}