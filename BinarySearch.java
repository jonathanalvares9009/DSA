class BinarySearch {
    private static int search(int nums[], int target, int low, int high) {
        if(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) return search(nums, target, low, mid-1);
            return search(nums, target, mid+1, high);
        }
        return -1;
    }

    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}
