# [Validate Subsequence](./ValidateSubsequence.java)

Given two non-empty arrays of integers, write a function that determines
whether the second array is a subsequence of the first one.

A subsequence of an array is a set of numbers that aren't necessarily adjacent
in the array but that are in the same order as they appear in the array. For
instance, the numbers [1, 3, 4] form a subsequence of the array
[1, 2, 3, 4], and so do the numbers. Note
that a single number in an array and the array itself are both valid
subsequences of the array.

## Sample Input

array = [5, 1, 22, 25, 6, -1, 8, 10]
sequence = [1, 6, -1, 10]

## Sample Output

true

## Approach 1: Using two pointers

1. Initialise two pointers at the start of the array and the sequence.
2. Iterate through the array and check if the current element is equal to the current element in the sequence. If it is, increment the sequence pointer and array pointer.
3. If the current element is not equal to current sequence element, increment the array pointer.
4. If the sequence pointer reaches the end of the sequence, return true.

## Approach 2: Using one pointer

1. Initialise a pointer at the start of the sequence.
2. Iterate through the array until sequence pointer reaches the end of the sequence and check if the current element is equal to the current element in the sequence. If it is, increment the sequence pointer.
3. If the sequence pointer reaches the end of the sequence, return true.
