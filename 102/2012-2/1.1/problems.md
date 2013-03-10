CEng 102 - Lab 1.1
==================

1. Generate a random number in range 1-10,
   and draw a square and a right triangle of that size.
   Write a method to draw each of the shapes, and call them in the main method.

2. Write a program which prints all the factorials from 1 to 10.
   The factorial should be calculated in a method.

3. Generate a random number in range 10-20.
   Write a program which prints all the Fibonacci numbers up to that number.
   The Fibonacci should be calculated in a method.

4. Write a program that reads integers, finds the largest of them,
   and counts their occurrences. Assume that the input ends with number 0.
   Suppose that you entered 3 5 2 5 5 5 0;
   the program finds that the largest is 5 and the occurrence count for 5 is 4.

   Hint: Maintain two variables, max and count.
   max stores the current max number, and count stores its occurrences.
   Initially, assign the first number to max and 1 to count.
   Compare each subsequent number with max. If the number is greater than max,
   assign it to max and reset count to 1. If the number is equal to max,
   increment count by 1.

   Here are sample runs of the program:

   Sample 1:

        Enter numbers: 3 5 2 5 5 5 0
        Largest number is 5
        Repeat count of 5 is 4

   Sample 2:

        Enter numbers: 3 6 5 4 2 4 5 4 5 5 0
        Largest number is 6
        Repeat count of 6 is 1
