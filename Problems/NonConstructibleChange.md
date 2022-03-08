# [Non-Constructible Change](./NonConstructibleChange.java)

Given an array of positive integers representing the values of coins in your
possession, write a function that returns the minimum amount of change (the
minimum sum of money) that you cannot create. The given coins can have
any positive integer value and aren't necessarily unique (i.e., you can have
multiple coins of the same value).

For example, if you're given coins = [1, 2, 5], the minimum
amount of change that you can't create is . If you're given no
coins, the minimum amount of change that you can't create is 1.

## Sample Input

coins = [5, 7, 1, 1, 2, 3, 22]

## Sample Output

20

## Approach: Sort the array and then iterate through the array.

1. Check if array is empty. If it is then return 1.
2. Initialise currentChangeCreated to 0.
3. Sort the array.
4. Iterate through the array.
5. If the current element is lesser than or equal to the currentChangeCreated + 1 then add the current element to currentChangeCreated.
6. If the current element is greater than the currentChangeCreated then return currentChangeCreated + 1.

O(nlog(n)) time | O(1) space
