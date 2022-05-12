# [Min Stack Implementation](./MinStack.java)

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

    MinStack() initializes the stack object.
    void push(int val) pushes the element val onto the stack.
    void pop() removes the element on the top of the stack.
    int top() gets the top element of the stack.
    int getMin() retrieves the minimum element in the stack.

Example 1:

Input

    ["MinStack","push","push","push","getMin","pop","top","getMin"]
    [[],[-2],[0],[-3],[],[],[],[]]

Output

    [null,null,null,null,-3,null,0,-2]

Explanation

    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    minStack.getMin(); // return -3
    minStack.pop();
    minStack.top(); // return 0
    minStack.getMin(); // return -2

Solution:

    1. Initialise a dynamic array and a variable min.
    2. In push just add the element to the array and update the min variable.
    3. In pop just remove the last element from the array, and find the new min.
    4. In top just return the last element of the array.
    5. In getMin just return the min variable.
