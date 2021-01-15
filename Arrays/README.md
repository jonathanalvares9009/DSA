# Arrays and ArrayLists

An **array** is a collection of items stored at contiguous memory locations. The idea is to store multiple items of the same type together. This makes it easier to calculate the position of each element by simply adding an offset to a base value, i.e., the memory location of the first element of the array (generally denoted by the name of the array). The base value is index 0 and the difference between the two indexes is the offset.

For simplicity, we can think of an array as a fleet of stairs where on each step is placed a value (let’s say one of your friends). Here, you can identify the location of any of your friends by simply knowing the count of the step they are on.

        Remember: “Location of next index depends on the data type we use”.

<img src="https://media.geeksforgeeks.org/wp-content/uploads/array-2.png"
     alt="Markdown Monster icon"
      />

The above image can be looked at as a top-level view of a staircase where you are at the base of the staircase. Each element can be uniquely identified by its index in the array (in a similar way as you could identify your friends by the step on which they were on in the above example).

## Advantages of using arrays:

- Arrays allow random access to elements. This makes accessing elements by position faster.
- Arrays have better cache locality that can make a pretty big difference in performance.
- Arrays represent multiple data items of the same type using a single name.

## Disadvantages of using arrays:

- You can’t change the size i.e. once you have declared the array you can’t change its size because of static memory allocated to it. Here Insertion and deletion are difficult as the elements are stored in consecutive memory locations and the shifting operation is costly too.