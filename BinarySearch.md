# [Binary Search](./BinarySearch.java)

Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

    Input: nums = [-1,0,3,5,9,12], target = 9
    Output: 4
    Explanation: 9 exists in nums and its index is 4

Example 2:

    Input: nums = [-1,0,3,5,9,12], target = 2
    Output: -1
    Explanation: 2 does not exist in nums so return -1

Solutions:

Method 1: Iterative

    1. Initialize left and right pointers to the start and end of the array respectively.
    2. While left < right:
        1. Find the midpoint of the array by calculating (left + right) / 2.
        2. If the midpoint is equal to the target, return the midpoint.
        3. If the midpoint is greater than the target, set right to midpoint - 1.
        4. If the midpoint is less than the target, set left to midpoint + 1.

    `O(log n)` time complexity and `O(1)` space complexity.

Method 2: Recursive

    1. If the target is greater than the midpoint, then search the right half of the array.
    2. If the target is less than the midpoint, then search the left half of the array.
    3. If the target is equal to the midpoint, then return the midpoint.

    `O(log n)` time complexity and `O(log n)` space complexity.
