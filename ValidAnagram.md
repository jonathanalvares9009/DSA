# Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

    Input: s = "anagram", t = "nagaram"
    Output: true

Example 2:

    Input: s = "rat", t = "car"
    Output: false

Solutions:

Method 1: Use a HashMap

    1. Initialize a HashMap with the size of the alphabet.
    2. Loop through the first string and add the characters to the HashMap.
    3. Loop through the second string and check if the character is in the HashMap.
    4. If the character is in the HashMap, reduce the value by 1 from the HashMap.
    5. If the character is not in the HashMap or it is already 0, return false.

    `O(n)` time and `O(n)` space.

Method 2: Sort the array and compare the two strings

    1. Convert string to array.
    2. Sort the array.
    3. Compare the two strings, return true if they are equal.

    `O(n log n)` time and `O(1)` space.
