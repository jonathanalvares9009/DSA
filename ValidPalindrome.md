# [Valid Palidrome](./ValidPalindrome.java)

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

    Input: s = "A man, a plan, a canal: Panama"
    Output: true
    Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:

    Input: s = "race a car"
    Output: false
    Explanation: "raceacar" is not a palindrome.

Example 3:

    Input: s = " "
    Output: true
    Explanation: s is an empty string "" after removing non-alphanumeric characters.
    Since an empty string reads the same forward and backward, it is a palindrome.

Solutions:

    NOTE: Why is StringBuilder faster than String?
    Strings in Java are immutable. This means that methods that operate on strings cannot ever change the value of a string. String concatenation using += works by allocating memory for an entirely new string that is the concatenation of the two previous ones, and replacing the reference with this new string. Each new concatenation requires the construction of an entirely new String object.
    In contrast, the StringBuilder and StringBuffer classes are implemented as a mutable sequence of characters. This means that as you append new Strings or characters onto a StringBuilder, it simply updates its internal array to reflect the changes you've made. This means that new memory is only allocated when the string grows past the buffer already existing in a StringBuilder.

Method 1: Check if reverse of the string is same as the original string.

    1. Create a StringBuilder object and append the original string to it, if the charater is alphanumeric, append it to the StringBuilder.
    2. Create a StringBuilder object and append the reverse of the original string to it, if the charater is alphanumeric, append it to the StringBuilder.
    3. Check if the two StringBuilder objects are equal.

    `O(n)` time and `O(n)` space.

Method 2: Using two pointers.

    1. Create a StringBuilder object and append the original string to it, if the charater is alphanumeric, append it to the StringBuilder.
    2. Create two pointers, one at the beginning (low) and one at the end (high) of the string.
    3. If string is empty, return true.
    4. While the low pointer is less than or equal to the high pointer, check if the characters are not equal, if not return false.
    5. Return true.

    `O(n)` time and `O(n)` space.
