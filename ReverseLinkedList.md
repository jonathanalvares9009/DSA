# [Reverse Linked List](./ReverseLinkedList.java)

Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:

<img src="https://assets.leetcode.com/uploads/2021/02/19/rev1ex1.jpg">

    Input: head = [1,2,3,4,5]
    Output: [5,4,3,2,1]

Example 2:

    Input: head = [1,2]
    Output: [2,1]

Example 3:

    Input: head = []
    Output: []

Solutions:

Method 1: Iterative

    1. Create 3 pointers - prev, curr, next
    2. Set prev to null
    3. Set curr to head
    4. Set next to curr.next
    5. While curr.next is not null
        5.1 Set curr.next to prev
        5.2 Set prev to curr
        5.3 Set curr to next
        5.4 Set next to curr.next
    6. Set curr.next to prev
    7. Return curr

    `O(n)` time and `O(1)` space

Method 2: Recursive

    1. If head is null or head.next is null, return null
    2. Store the next node in a variable
    3. Set head.next to null
    4. Reverse the rest of the list and store it in result
    5. Set next.next to head
    6. Return result

    `O(n)` time and `O(n)` space
