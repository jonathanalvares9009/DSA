package Problems;

import java.util.Arrays;

class NonConstructibleChange {
    public int nonConstructibleChange(int[] coins) {
        // Write your code here.
        if(coins.length == 0) return 1;
        int currentChangeCreated = 0;
        Arrays.sort(coins);
        for(int i=0;i<coins.length;i++) {
            if(coins[i] <= currentChangeCreated + 1) currentChangeCreated += coins[i];
            else break;
        }
        return currentChangeCreated + 1;
    }
}
