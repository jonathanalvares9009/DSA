import java.util.Scanner;

class Duplicates {
    
    // Remove consecutive duplicates
    public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
        if(s.length() == 0) return s;
        String partA = "";
        partA += s.charAt(0);
        String partB = removeConsecutiveDuplicates(s.substring(1));
        if(partB.length() > 0 && (partA.charAt(0) == partB.charAt(0))) {
            return partA + partB.substring(1);
        }
        return partA + partB;
	}

    // aabccba

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(removeConsecutiveDuplicates(str));
        s.close();
    }
}
