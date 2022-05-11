# [Valid Parentheses](./ValidParentheses.java)

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

Example 1:

    Input: s = "()"
    Output: true

Example 2:

    Input: s = "()[]{}"
    Output: true

Example 3:

    Input: s = "(]"
    Output: false

Stack Solution:

    1. Create a stack.
    2. Loop through the string, and push if it is an opening bracket.
    3. If it is a closing bracket
        1. If the stack is emtpy, push the closing bracket.
        2. If the stack is not empty and top element is the corresponding opening bracket, pop it off the stack.
    4. If the stack is empty, return true.
