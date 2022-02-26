# DSA

This contains all you need to know about Data Structures and Algorithms.

# Contents

## Data Structures

- [Arrays](/Arrays)
  A linear collection of data values that are accessible at numbered indices, starting at index 0.

The following are an array's standard operations and their corresponding time complexities:

- Accessing a value at a given index: O(1)
- Updating a value at a given index: 0(1)
- Inserting a value at the beginning: O(n)
- Inserting a value in the middle: O(n)
- Inserting a value at the end:
  - amortized O(1) when dealing with a dynamic array
  - O(n) when dealing with a static array
- Removing a value at the beginning: O(n)
- Removing a value in the middle: O(n)
- Removing a value at the end: 0(1)
- Copying the array: O(n)

A static array is an implementation of an array that allocates a fixed amount of memory to be used for storing the array's values. Appending values to the array therefore involves copying the entire array and allocating new memory for it, accounting for the extra space needed for the newly appended value. This is a linear-time operation.

A dynamic array is an implementation of an array that preemptively allocates double the amount of memory needed to store the
array's values. Appending values to the array is a constant-time operation until the allocated memory is filled up, at which point the array is copied and double the memory is once again allocated for it. This implementation leads to an amortized constant-time insertion at end operation.

- [Recursion](/Recursion)
  In computer science, recursion is a method of solving a computational problem where the solution depends on solutions to smaller instances of the same problem. Such problems can generally be solved by iteration, but this needs to identify and index the smaller instances at programming time.
