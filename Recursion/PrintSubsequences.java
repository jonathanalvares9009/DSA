import java.util.Scanner;

class PrintSubsequences {
    // Print subsequences
    private static void findSubsequences(String str, String outputSoFar) {
        if(str.length() == 0) {
            System.out.println(outputSoFar);
            return;
        }
        findSubsequences(str.substring(1), outputSoFar);
        findSubsequences(str.substring(1), outputSoFar + str.charAt(0));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        findSubsequences(str, "");
        s.close();
    }
}
