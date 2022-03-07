# [Binary Search](./BinarySearch.java)

Write a function that takes in a sorted array of integers as well as a target
integer. The function should use the Binary Search algorithm to determine if
the target integer is contained in the array and should return its index if it
is, otherwise -1.

If you're unfamiliar with Binary Search, we recommend watching the Conceptual
Overview section of this question's video explanation before starting to code.

## Sample Input

`array = [1, 3, 5, 6]`
<br>
`target = 5`

## Sample Output

`2`

## Sample Input

`array = [1, 3, 5, 6]`
<br>
`target = 7`

## Sample Output

`-1`

## Approach 1: Iterative

1. Initialise low and high pointers to the start and end of the array.
2. While low is less than high:
   - Calculate the midpoint of low and high.
   - If the midpoint is equal to the target, return the midpoint.
   - If the midpoint is less than the target, set low to the midpoint + 1.
   - If the midpoint is greater than the target, set high to the midpoint - 1.
3. If low is greater than high, return -1.

## Approach 2: Recursive

1. If the low pointer is greater than the high pointer, return -1.
2. Calculate the midpoint of low and high.
3. If the midpoint is equal to the target, return the midpoint.
4. If the midpoint is less than the target, recursively call the function with
   low = midpoint + 1 and high = high.
5. If the midpoint is greater than the target, recursively call the function with
   low = low and high = midpoint - 1.
