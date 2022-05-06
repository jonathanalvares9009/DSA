import java.util.HashMap;

class TwoSum {
    public static int[] twoSumNaive(int arr[], int target) {
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] + arr[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }

    public static int[] twoSumEfficient(int arr[], int target) {
        HashMap<Integer, Integer> num = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            num.put(arr[i], i);
        }
        for(int i=0;i<arr.length;i++) {
            int potentialMatch = target - arr[i];
            if(num.containsKey(potentialMatch) && i != num.get(potentialMatch)) {
                return new int[] {i, num.get(potentialMatch)};
            }
        }
        return new int[] {-1, -1};
    }
}