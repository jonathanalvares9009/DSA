# [Invert Binary Tree](./InvertBinaryTree.java)

Given the root of a binary tree, invert the tree, and return its root.

Example 1:

<img src="https://assets.leetcode.com/uploads/2021/03/14/invert1-tree.jpg">

    Input: root = [4,2,7,1,3,6,9]
    Output: [4,7,2,9,6,3,1]

Example 2:

<img src="https://assets.leetcode.com/uploads/2021/03/14/invert2-tree.jpg">

    Input: root = [2,1,3]
    Output: [2,3,1]

Example 3:

    Input: root = []
    Output: []

Solutions:

Method 1: Recursive

    1. If the node is null, return null.
    2. If the node is not null, then we need to invert the left and right subtrees.
    3. Store the left and right subtrees in a variable.
    4. root.left = invertTree(root.right)
    5. root.right = invertTree(root.left)
    6. Return root.

    `O(n)` time and `O(n)` space.

Method 2: Iterative

    1. If the node is null, return null.
    2. If the node is not null, then we need to invert the left and right subtrees.
    3. Create a queue and enqueue the root node.
    4. While the queue is not empty, dequeue the node and invert the left and right subtrees.
    5. Enqueue the left and right subtrees.
    6. Return root.

    `O(n)` time and `O(n)` space.
