class BinarySearch {
    
    // O(log(n)) time | O(1) space
    public static int binarySearchIterative(int[] array, int target) {
        // Write your code here.
        int low = 0, high = array.length - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            int potentialMatch = array[mid];
            if(potentialMatch == target) return mid;
            else if(potentialMatch < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    private static int binarySearch(int[] array, int low, int high, int target) {
        // Write your code here.
        if(low <= high) {
            int mid = (low + high) / 2;
            int potentialMatch = array[mid];
            if(target == potentialMatch) return mid;
            else if(potentialMatch < target) return binarySearch(array, mid+1, high, target);
            else return binarySearch(array, low, mid - 1, target);
        }
        return -1;
    }
        
    public static int binarySearch(int[] array, int target) {
    // Write your code here.
    return binarySearch(array, 0, array.length - 1, target);
    }
}
