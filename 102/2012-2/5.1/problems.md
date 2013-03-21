Lab 5.1 - Objects as Arguments
==============================

1. Write a class `Point` such that:
    * Its coordinates are `x` and `y` decimal numbers.
    * It has a method to calculate its distance to another point.
    `double distanceTo(Point p)` using the formula
    `d = √( (x₁-x₂)² + (y₁-y₂)² )`
    * Using this `Point` class, define three points.
    * Calculate and print the distance of these points to each other.

2. Write a class `Triangle` such that:
    * It has three points which are private fields of type `Point`.
    * It has a `getPerimeter()` method.
    * It has a `getArea()` method.
    * Use this formula to calculate the area of a triangle:
      `A = √( s·(s-a)·(s-b)·(s-c) )`
      where `s = (a+b+c)/2` is the semiperimeter.
    * Define three triangles, and display their perimeters and areas.

3. Assume that we want to find the indices of the maximum value in a
   two-dimensional matrix, and we attempt to write a method that takes a matrix
   as its parameter and returns the row and column indices of the maximum value.

        findMax(int[][] matrix) {
          int row = 0, col = 0;
          for (.. i ..)
            for (.. j ..)
              if (matrix[i][j] > matrix[row][col])
                row = i; col = j;
          return row, col;  // ERROR: Cannot return two values
        }

   To solve this problem, we *pack* these two values into a single `Pair` object:

          return new Pair(row, col);

   Write the `Pair` class and the `findMax` method.

   `findMax` should be in your `Main` class.

        public static Pair findMax(int[][] matrix) { ... }

   Build a random matrix, find its max value, and print it with its indices.

   Sample run:

        A matrix:
        20  75  22  23
        95  38  66  71
        56  91  59  80
        93  93  78  51
        61  47  14  27

        Its largest element: matrix[1][0] = 95

4. Write a class for `Complex` numbers.
    * Define methods for simple operations like addition and multiplication.
    * Define some `Complex` numbers, do operations on them, and print results.
