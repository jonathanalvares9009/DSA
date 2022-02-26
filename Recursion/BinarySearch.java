import java.util.Scanner;

class BinarySearch {

    // Divide the array into two parts and find the element from a sorted array
    private static int binarySearch(int input[], int element, int startIdx, int endIdx) {
		// Write your code here
        if(startIdx >= endIdx && input[startIdx] == element) return startIdx;
        else if(startIdx >= endIdx) return -1;
        int mid = (startIdx + endIdx) / 2;
        if(input[mid] == element) return mid;
        else if(input[mid] < element) return binarySearch(input, element, mid+1, endIdx);
        return binarySearch(input, element, startIdx, mid-1);
	}

    public static int binarySearch(int input[], int element) {
		// Write your code here
        return binarySearch(input, element, 0, input.length-1);
	}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = s.nextInt();
        int ele = s.nextInt();
        System.out.println(binarySearch(arr, ele));
        s.close();
    }
}
