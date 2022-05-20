# [Maximum Depth Of Binary Tree](./MaximumDepthOfBinaryTree.java)

Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Example 1:

<img src="https://assets.leetcode.com/uploads/2020/11/26/tmp-tree.jpg">

    Input: root = [3,9,20,null,null,15,7]
    Output: 3

Example 2:

    Input: root = [1,null,2]
    Output: 2

Solution:

Method 1: Recursive DFS

    1. If the node is null, return 0.
    2. If the node is not null, then we need to find the maximum depth of the left and right subtrees.
    3. Return 1 + max(left, right).

    `O(n)` time and `O(n)` space.

Method 2: Iterative BFS

    1. If the node is null, return 0.
    2. Create a queue and enqueue the root node.
    3. While the queue is not empty:
        a. Find the size, and iterate till less than size.
        b. Dequeue the node and find the maximum depth of the left and right subtrees.
        c. level = level + 1.
    6. Return level.

    `O(n)` time and `O(n)` space.

Method 3: Iterative DFS

    1. If the node is null, return 0.
    2. Create a stack to hold the nodes and one to hold the level.
    3. Push the root node and level 1 to the stack.
    4. While the stack is not empty:
        a. Pop the node and level from the stack.
        b. finalDepth = max(finalDepth, level).
        c. If node.left is not null, push node.left and level + 1 to the stack.
        d. If node.right is not null, push node.right and level + 1 to the stack.
    5. Return finalDepth.

    `O(n)` time and `O(n)` space.
