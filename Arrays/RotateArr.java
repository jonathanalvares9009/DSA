import java.util.Scanner;

class RotateArr {

    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int temp[] = new int[arr.length];
        for(int i=d;i<arr.length;i++) {
            temp[i-d] = arr[i];
        }
        int idx = 0;
        for(int i=arr.length-d;i<arr.length;i++) {
            temp[i] = arr[idx];
            idx++;
        }
        for(int i=0;i<temp.length;i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++) arr[i] = s.nextInt();
            int d = s.nextInt();
            rotate(arr, d);
        }
        s.close();
    }
}
