import java.util.ArrayList;
import java.util.Scanner;

class MergeSort {

    public static void merge(int[] input, int startIdx, int endIdx) {
        int mid = (startIdx + endIdx)/ 2;
        int ptrA = startIdx, ptrB = mid+1;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(ptrA <= mid && ptrB <= endIdx) {
            if(input[ptrA] <= input[ptrB]) {
                arr.add(input[ptrA]);
                ptrA++;
            } else {
                arr.add(input[ptrB]);
                ptrB++;
            }
        }
        while(ptrA <= mid) {
            arr.add(input[ptrA]);
            ptrA++;
        }
        while(ptrB <= endIdx) {
            arr.add(input[ptrB]);
            ptrB++;
        }
        for(int i=0;i<arr.size();i++) {
            input[startIdx] = arr.get(i);
            startIdx++;
        }
    }

    // Divide the arrays into two parts and then merge it to sort the array
    public static void mergeSort(int[] input, int startIdx, int endIdx) {
        if(startIdx >= endIdx) return;
        int mid = (startIdx + endIdx)/ 2;
        mergeSort(input, startIdx, mid);
        mergeSort(input, mid+1, endIdx);
        merge(input, startIdx, endIdx);
    }

    public static void mergeSort(int[] arr) {
		mergeSort(arr, 0, arr.length-1);
	}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = s.nextInt();
        mergeSort(arr);
        for(int i=0;i<n;i++) System.out.print(arr[i] + " ");
        System.out.println();
        s.close();
    }
}
