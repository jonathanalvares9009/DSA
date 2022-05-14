# [Implement a Hash Set](./HashSet.java)

Design a HashSet without using any built-in hash table libraries.

Implement MyHashSet class:

    void add(key) Inserts the value key into the HashSet.
    bool contains(key) Returns whether the value key exists in the HashSet or not.
    void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.

Example 1:

    Input
    ["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
    [[], [1], [2], [1], [3], [2], [2], [2], [2]]
    Output
    [null, null, null, true, false, null, true, null, false]

    Explanation
    MyHashSet myHashSet = new MyHashSet();
    myHashSet.add(1);      // set = [1]
    myHashSet.add(2);      // set = [1, 2]
    myHashSet.contains(1); // return True
    myHashSet.contains(3); // return False, (not found)
    myHashSet.add(2);      // set = [1, 2]
    myHashSet.contains(2); // return True
    myHashSet.remove(2);   // set = [1]
    myHashSet.contains(2); // return False, (already removed)

Solution:

Method 1: Brute Force

    1. Create an array of size provided.
    2. In add operation, use they key as the index and store 1.
    3. In contains operation, use the key as the index and check if the value is 1.
    4. In remove operation, use the key as the index and set the value to 0.

    'O(n)' time and 'O(n)' space.

Method 2: Using Hashing

    1. Create an array of Doubly Linked List nodes.
    2. Create a hashing function to convert the key to an index.
    3. Create a function to get index from the key.
    4. In add operation
        1. Get the index from the key.
        2. If the index is not -1, then add the key to the linked list at the index.
    5. In contains operation
        1. Get the index from the key.
        2. If the index is not -1, then check if the linked list at the index contains the key.
    6. In remove operation
        1. Get the index from the key.
        2. If the index is not -1, then remove the key from the linked list at the index.
