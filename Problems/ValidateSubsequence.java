package Problems;

import java.util.List;

class ValidateSubsequence {

    // O(n) time | O(1) space
    public static boolean isValidSubsequenceTwoPointers(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int arrayIdx = 0, sequenceIdx = 0;
        while(arrayIdx < array.size() && sequenceIdx < sequence.size()) {
            if(array.get(arrayIdx) == sequence.get(sequenceIdx)) {
                arrayIdx++;
                sequenceIdx++;
            } else {
                arrayIdx++;
            }
        }
        if(sequenceIdx == sequence.size()) return true;
        return false;
    }

    // O(n) time | O(1) space
    public static boolean isValidSubsequenceOnePointer(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int sequenceIdx = 0;
        for(int value: array) {
            if(sequenceIdx == sequence.size()) break;
            if(sequence.get(sequenceIdx).equals(value)) sequenceIdx++;
        }
        return sequenceIdx == sequence.size();
    }
}
