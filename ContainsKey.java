import java.util.Arrays;
import java.util.HashSet;

class ContainsKey {
    public static boolean naiveSolution(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<nums.length;j++) {
                if(i!=j && nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hashSetSolution(int[] nums) {
        HashSet<Integer> num = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            if(num.contains(nums[i])) return true;
            num.add(nums[i]);
        }
        return false;
    }

    public boolean sortSolution(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++) {
            if(nums[i] == nums[i-1]) {
                return true;
            }
        }
        return false;
    }
}