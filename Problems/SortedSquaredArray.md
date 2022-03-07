# [Sorted Squared Array](./SortedSquaredArray.java)

Write a function that takes in a non-empty array of integers that are sorted
in ascending order and returns a new array of the same length with the squares
of the original integers also sorted in ascending order.

## Sample Input

array = [1, 2, 3, 4, 5, 6, 7, 8, 9]

## Sample Output

[1, 4, 9, 16, 25, 36, 49, 64, 81]

## Approach 1: Looping through the array, squaring and then sorting the array

1. Initialize a new array.
2. Loop through the array, squaring each element and adding it to the new array.
3. Sort the new array.

`O(nlog(n))` time and `O(n)` space.

## Approach 2: Using pointers

1. Initialize two pointers, one at the beginning (smallerValueIdx) and one at the end of the array (largerValueIdx).
2. Run a for loop from the end to the beggining.
3. Check if smallerValue is greater than the largerValue. If it is, square it put it in the index from the for loop and increase the smallerValueIdx.
4. If smallerValue is less than the largerValue, square the largerValue and put it in the index from the for loop and decrease the largerValueIdx.

`O(n)` time and `O(n)` space.
