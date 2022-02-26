import java.util.Scanner;

class Subset {

    // Returns subsets
    private static int[][] subsets(int input[], int startIdx)  {
        if(startIdx >= input.length) {
            // Return array of size 1 with empty array
            return new int[1][0];
        }
        int[][] recursiveWork = subsets(input, startIdx+1);
        int[][] work = new int[recursiveWork.length*2][];
        // Initiate index adder for the second half of the array
        int k=0;
        // Compute the first half of the array
        for(int i=0;i<recursiveWork.length;i++) {
            work[i] = new int[recursiveWork[i].length];
            for(int j=0;j<recursiveWork[i].length;j++){
                work[i][j] = recursiveWork[i][j];
            }
            k++;
        }
        for(int i=0;i<recursiveWork.length;i++) {
            work[k+i] = new int[recursiveWork[i].length+1];
            work[k+i][0] = input[startIdx];
            for(int j=1;j<=recursiveWork[i].length;j++) {
                work[i+k][j] = recursiveWork[i][j-1];
            } 
        }
        return work;
    }

    public static int[][] subsets(int input[]) {
		// Write your code here
        return subsets(input, 0);
	}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = s.nextInt();
        int output[][] = subsets(arr);
        for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
        s.close();
    }
}
