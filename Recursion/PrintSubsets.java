import java.util.Scanner;

class PrintSubsets {

    private static void printSubsets(int input[], int startIdx, int outputArr[]) {
        if(startIdx == input.length) {
            for(int i: outputArr) {
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }
        printSubsets(input, startIdx+1, outputArr);
        int newOutputArr[] = new int[outputArr.length+1];
        int j=0;
        for( ;j<outputArr.length;j++) {
            newOutputArr[j] = outputArr[j];
        }
        newOutputArr[j] = input[startIdx];
        printSubsets(input, startIdx+1, newOutputArr);
    }

    public static void printSubsets(int input[]) {
		// Write your code here
        printSubsets(input, 0, new int[0]);
	}
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = s.nextInt();
        printSubsets(arr);
        s.close();
    }
}
