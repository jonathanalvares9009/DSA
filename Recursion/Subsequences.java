import java.util.Scanner;

class Subsequences {

    // Returns subsequences
    private static String[] findSubsequences(String str) {
        if(str.length() == 0) {
            String resultArr[] = {""};
            return resultArr;
        }
        String resultArr[] = findSubsequences(str.substring(1));
        String finalResultArr[] = new String[2*resultArr.length];
        int counter = 0;
        for(int i=0;i<resultArr.length;i++) {
            finalResultArr[i+counter] = resultArr[i];
            counter++;
            finalResultArr[i+counter] = str.charAt(0) + resultArr[i];
        }
        return finalResultArr;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String subsequences[] = findSubsequences(str);
        for(int i=0;i<subsequences.length;i++)
            System.out.println(subsequences[i]);
        s.close();
    }
}