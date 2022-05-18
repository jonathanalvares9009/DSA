# [Linked List Cycle](./LinkedListCycle.java)

Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

Example 1:

    Input: head = [3,2,0,-4], pos = 1
    Output: true
    Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

Example 2:

    Input: head = [1,2], pos = 0
    Output: true
    Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

Example 3:

    Input: head = [1], pos = -1
    Output: false
    Explanation: There is no cycle in the linked list.

Solution:

Method 1: Using a hashset

    1. Create a hashset, that will hold the nodes that we have visited.
    2. Create a pointer, that will point to the head of the linked list.
    3. Create a while loop, that will iterate through the linked list.
    4. If the node we are at is in the hashset, then we have a cycle.
    5. Otherwise, add the node to the hashset.
    6. Move the pointer to the next node.

Method 2: Using a slow and fast pointer(Floyd's Tortoise and Hare)

    1. Create a slow and fast pointer, that will point to the head of the linked list.
    2. While the fast pointer is not null and slow is not equal to the fast pointer
        2.1. Move the slow pointer, slow = slow.next
        2.2. Move the fast pointer, fast = fast.next.next
    3. If the fast pointer is null, then there is no cycle.
    4. Otherwise, there is a cycle.
