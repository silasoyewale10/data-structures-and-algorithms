
# AUTHOR: SILAS OYEWALE
## Table of contents
Reverse an array
Insert into middle index.

### data-structures-and-algorithms

### Reverse an A
<!-- Short summary or background information -->
An array is a collection of similar data type 
Write a function that takes in an arrayof integers and a nother integer ands inserst the integer into the middle number. 

### Challenge
<!-- Description of the challenge -->
Write a function called insertShiftArray which takes in an array and the value to be added. Without utilizing any of the built-in methods available to your language, return an array with the new value added at the middle index.

### Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
The approach I took is to loop through the old array and then create a new array. When the index is midpoint, the element of the new array is the given number. Increase ther index by one to avoid skipping an index and if the index is not equal to the mid point, add to new array. 
Finally rerturn the new array. 
The big 0 is linear. Just one for loop.

# Image for whiteboard
<img src="./code401challenges/insert-into-middle-whiteboard.JPG"
     alt="White Board Picture"
     style="width: 200px;" />
