# Two Number Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

    Input: nums = [2,7,11,15], target = 9

    Output: [0,1]

    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

<br>

Example 2:

    Input: nums = [3,2,4], target = 6
    Output: [1,2]

Example 3:

    Input: nums = [3,3], target = 6
    Output: [0,1]

Solutions:

Naive: Loop through the elements twice

1.  Run a for loop with i and j and add both the elements and check if it matches.
2.  Return the idx if it matches

`O(n^2) time | O(1) space`

Efficient: Use a HashMap

1. Initialise a HashMap and store the element as key and idx as value.
2. Iteratively do:
   1. potentialMatch = target - currentNum
   2. Check if potential match exists in the map, if it does exist return {currentNum, potentialMatch}

`O(n) time | O(n) space`
