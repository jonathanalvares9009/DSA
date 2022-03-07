package Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class TwoNumberSum {
    // O(n^2) time | O(1) space
    public static int[] twoNumberSumLoop(int arr[], int targetSum) {
        for(int i=0;i<arr.length-1;i++) {
            int firstNum = arr[i];
            for(int j=i+1;j<arr.length;j++) {
                int secondNum = arr[j];
                if(firstNum + secondNum == targetSum) {
                    return new int[] {firstNum, secondNum};
                }
            }
        }
        return new int[0];
    }

    // O(n) time | O(n) space
    public static int[] twoNumberSumHashSet(int array[], int targetSum) {
        HashSet<Integer> nums = new HashSet<>();
		for(int i=0;i<array.length;i++) {
			int potentialNum = targetSum - array[i];
			if(potentialNum != array[i] && nums.contains(potentialNum)) {
				return new int[] {array[i], potentialNum};
			} else {
				nums.add(array[i]);
			}
		}
        return new int[0];
    }

    // O(nlog(n)) time | O(1) space
    public static int[] twoNumberSumSort(int array[], int targetSum) {
        Arrays.sort(array);
        int left = 0, right = array.length - 1;
        while(left <= right) {
            int sum = array[left] + array[right];
            if(sum == targetSum) {
                return new int[] {array[left], array[right]};
            } else if(sum < targetSum) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }
}