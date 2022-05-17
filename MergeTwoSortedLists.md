# [Merge Two Sorted Lists](./MergeTwoSortedLists.java)

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Example 1:

    Input: list1 = [1,2,4], list2 = [1,3,4]
    Output: [1,1,2,3,4,4]

Example 2:

    Input: list1 = [], list2 = []
    Output: []

Example 3:

    Input: list1 = [], list2 = [0]
    Output: [0]

Solution:

Method 1: Four pointers

    1. Initialise ptr1 and ptr2 to the heads of the two lists.
    2. Initialise mergedListHeadPtr to null and mergedListTailPtr to null.
    3. While ptr1 and ptr2 are not null,
        a. If ptr1.val < ptr2.val,
            a. mergedListHeadPtr = ptr1; (Only if mergedListHeadPtr is null)
            b. mergedListTailPtr = ptr1;
            c. ptr1 = ptr1.next;
        b. Else,
            a. mergedListHeadPtr = ptr2; (Only if mergedListHeadPtr is null)
            b. mergedListTailPtr = ptr2;
            c. ptr2 = ptr2.next;
    4. If ptr1 is not null,
        a. mergedListHeadPtr = ptr1; (Only if mergedListHeadPtr is null)
        b. mergedListTailPtr.next = ptr1;
    5. If ptr2 is not null,
        a. mergedListHeadPtr = ptr2; (Only if mergedListHeadPtr is null)
        b. mergedListTailPtr.next = ptr2;
    6. Return mergedListHeadPtr.

Method 2: Recursive

    1. If list1 is null, return list2.
    2. If list2 is null, return list1.
    3. If list1.val < list2.val,
        a. mergedList = list1;
        b. mergedList.next = mergeLists(list1.next, list2);
    4. Else,
        a. mergedList = list2;
        c. mergedList.next = mergeLists(list1, list2.next);
    5. Return mergedList.
