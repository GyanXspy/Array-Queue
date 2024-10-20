# Array-Queue

The implementation of a Queue using an Array is based on managing a fixed-size array where elements are inserted (enqueue) at the rear and removed (dequeue) from the front in a First-In-First-Out (FIFO) order. An array-based queue is simple and efficient but has some limitations, such as the need for careful handling of the array's finite size.

Key Components:
Array: A fixed-size array that stores the elements of the queue.

Front & Rear: Two indices are used to track:

Front: The position of the element at the front of the queue (the element to be dequeued next).
Rear: The position where the next element will be inserted.
Size: A variable to keep track of the current number of elements in the queue.

Operations:
Enqueue (Add Element):

Adds an element to the rear of the queue.
If the queue is full (i.e., the number of elements equals the array’s capacity), an "overflow" condition is triggered, and enqueue fails.
After adding an element, the rear index is updated, typically wrapping around to the start if the queue has reached the end of the array (circular array).
Dequeue (Remove Element):

Removes the element at the front of the queue.
If the queue is empty (i.e., no elements are present), an "underflow" condition is triggered, and dequeue fails.
After removal, the front index is updated, also wrapping around if necessary.
Peek (Access Front Element without Removal):

Returns the element at the front without removing it from the queue.
Useful for checking the first element in the queue without modifying it.
IsEmpty (Check if Queue is Empty):

Returns true if the size of the queue is zero, and false otherwise.
IsFull (Check if Queue is Full):

Returns true if the number of elements in the queue equals the capacity of the array.
