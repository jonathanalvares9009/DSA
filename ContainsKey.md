# Contains Key

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

    Input: nums = [1,2,3,1]
    Output: true

Example 2:

    Input: nums = [1,2,3,4]
    Output: false

Example 3:

    Input: nums = [1,1,1,3,3,4,3,2,4,2]
    Output: true

Solutions:

Naive: Loop through the elements twice

    1. Run a for loop with i and j and check if the elements are equal.
    2. Return true if they are equal.

    `O(n^2) time | O(1) space`

Better: Sort the array and check if the elements are equal.

    1. Sort the array.
    2. Run a for loop with i and j and check if the elements are equal.
    3. Return true if they are equal.

    `O(nlogn) time | O(1) space`

Efficient: Use a HashSet

    1. Initialise a HashSet and store the element.
    2. Iteratively do:
        1. Check if the element exists in the map.
            1. If it does exist return true.
            2. If it doesn't exist, add the element to the set.
        2. Return false if the map is empty or the loop has been completed.

    `O(n) time | O(n) space`
