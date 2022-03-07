# [Two Number Sum](./TwoNumberSum.java)

Write a function that takes in a non-empty array of distinct integers and an
integer representing a target sum. If any two numbers in the input array sum
up to the target sum, the function should return them in an array, in any
order. If no two numbers sum up to the target sum, the function should return
an empty array.

Note that the target sum has to be obtained by summing two different integers
in the array; you can't add a single integer to itself in order to obtain the
target sum.

You can assume that there will be at most one pair of numbers summing up to
the target sum.

## Sample Input

`array = [3, 5, -4, 8, 11, 1, -1, 6]`
<br >
`targetSum = 10`

## Sample Output

`[-1, 11]`

# Approach 1: Looping through the array twice and finding a match

1. Loop through the array once, keeping track of the current element A.
2. Loop through the array again, keeping track of the current element B.
3. If A + B = targetSum, return [A, B].

`O(n^2)` time and `O(1)` space.

# Approach 2: Using a hash set

1. Loop through the array once, and add each element to the hash set if it is not there already.
2. If the targetSum is in the hash set, return [targetSum, targetSum - currentElement].

`O(n)` time and `O(n)` space.

# Approach 3: Sorting the array

1. Sort the array.
2. Initialize two pointers, one at the beginning and one at the end of the array.
3. While the two pointers are not equal, check if the sum of the two elements at the pointers is equal to the targetSum. If it is, return the two elements.
4. If the sum if less than targetSum, move the left pointer to the next element.
5. If the sum is greater than targetSum, move the right pointer to the previous element.

`O(n log n)` time and `O(1)` space.
