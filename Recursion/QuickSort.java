import java.util.Scanner;

class QuickSort {

    private static int partition(int[] input, int startIdx, int endIdx) {
        // Initialise counter to calculate pos
        int counter = 0, pivotPos = 0;

        // calculate pivot pos and swap
        for(int i=startIdx+1;i<=endIdx;i++) {
            if(input[i] <= input[startIdx]) counter++;
        }
        pivotPos = startIdx+counter;
        int temp = input[startIdx];
        input[startIdx] = input[pivotPos];
        input[pivotPos] = temp;

        // Ensure all elements to left are >= pivotPos and right are > pivotPos
        int i = startIdx, j = endIdx;
        while(i<pivotPos && j>pivotPos) {
            if(input[i] <= input[pivotPos]) {
                i++;
            } else if(input[j] > input[pivotPos]) {
                j--;
            } else {
                temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
        }

        // Return pivot pos
        return pivotPos;
    }

    // Divide the arrays around a pivot element
    private static void quickSort(int[] input, int startIdx, int endIdx) {
        // Base case
		if(startIdx >= endIdx) return;
        int pivotPos = partition(input, startIdx, endIdx);
        // Sort the left half
        quickSort(input, startIdx, pivotPos-1);
        // Sort the right half
        quickSort(input, pivotPos+1, endIdx);
 	}

    public static void quickSort(int[] input) {
		quickSort(input, 0, input.length-1);
	}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) 
            arr[i] = s.nextInt();
        quickSort(arr);
        for(int i=0;i<n;i++) 
            System.out.print(arr[i] + " ");
        System.out.println();
        s.close();
    }
}