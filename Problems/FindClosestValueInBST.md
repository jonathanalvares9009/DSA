# [Find Closest Value in BST](./FindClosestValueInBST.java)

Write a function that takes in a Binary Search Tree (BST) and a target integer
value and returns the closest value to that target value contained in the BST.
You can assume that there will only be one closest value.

Each BST node has an integer value, a left child node, and a right child node. A node is
said to be a valid BST node if and only if it satisfies the BST
property: its value is strictly greater than the values of every
node to its left; its value is less than or equal to the values
of every node to its right; and its children nodes are either valid
BST nodes themselves or None/ null.

## Sample Input

<pre><span class="CodeEditor-promptParameter">tree</span> =   10
       /     \
      5      15
    /   \   /   \
   2     5 13   22
 /           \
1            14
<span class="CodeEditor-promptParameter">target</span> = 12
</pre>

## Sample Output

<pre>13</pre>

## Approach 1: Iterative

1. Initialise a variable currentNode to the root of the BST.
2. Initialise a variable closestValue to the root of the BST.
3. Initialise a variable currentValue to the root of the BST.
4. While currentNode is not None:
   - If the currentNode value is less than the closestValue value then set closestValue to the currentNode value.
   - If the currentNode value is less than the target value then set currentNode to the right child of currentNode.
   - If the currentNode value is greater than the target value then set currentNode to the left child of currentNode.
   - If the currentNode value is equal to the target value then return the currentNode value.
5. Return the closestValue value.

Average: O(log(n)) time | O(1) space
Worst: O(n) time | O(1) space

## Approach 2: Recursive

1. Check if absolute of currentValue - target is less than absolute of closestValue - target. If it is then set closestValue to currentValue.
2. If the currentValue is less than the target value then set currentValue to the right child of currentValue.
3. If the currentValue is greater than the target value then set currentValue to the left child of currentValue.
4. If the currentValue is equal to the target value then return the currentValue value.

Average: O(log(n)) time | O(1) space
Worst: O(n) time | O(1) space
