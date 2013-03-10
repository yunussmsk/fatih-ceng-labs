Lab 2.1 - Multidimensional Arrays
=================================

1. Write the following functions:

    A function to print the contents of a matrix

        void printMatrix(int[][] matrix)

    A function that returns a random integer in range [min, max]

        int random(int min, int max)

    A function that fills a matrix with random numbers in range [min, max]

        void fillMatrix(int[][] matrix, min, max)

    A function that returns a copy of a given matrix

        int[][] copyMatrix(int[][] matrix)

    A function that returns reversed version of a given matrix

        void reverseMatrix(int[][] matrix)

   Then, using these functions, do the following:

    1. Create a matrix of 2 rows and 3 columns.
       Get two integers from user as min and max.
       Fill the matrix with random integers in range [min, max].
       Show the contents of this matrix.

    2. Create a copy of this matrix.
       Show the contents of the new matrix.

    3. Reverse the order of numbers in this matrix.
       Show the reversed matrix.

    Sample run:

        Enter min and max: 0 9
        Random matrix:
        2 3 1
        4 9 0
        Copied matrix:
        2 3 1
        4 9 0
        Reversed matrix:
        0 9 4
        1 3 2

2. Do the following exercies by writing appropriate functions:
    1. Create a matrix of 4 rows and 5 columns,
       and fill it with random numbers in the range [10,99].
       Show the contents of the matrix.
    2. Show the elements of the second column.
    3. Show the elements of the first row.
    4. Display the product of the sum of the numbers in the second column
       with the sum of the numbers in the first row.
    5. Display the last element of the last row of the matrix.
    6. Find the smallest element of the matrix and display its indices.
    7. Display the product of elements in each column with even index.
    8. Display the average of all elements in the matrix.
    9. Multiply each element with its row and column index.
       Display the resulting matrix, and average of its elements.

    Sample run:

        The matrix:
         88  80  89  51  79
         61  95  48  98  65
         93  29  91  38  36
         73  36  52  97  12
        Second column:
         80  95  29  36
        First row:
         88  80  89  51  79
        Product of sums: 92880
        Last element: 12
        Smallest = matrix[3][4] = 12
        Product of nums in column 0 is 36443352
        Product of nums in column 2 is 20215104
        Product of nums in column 4 is 2218320
        Average: 65.55
        Multiplied each element with its indices:
          0   0   0   0   0
          0  95  96 294 260
          0  58 364 228 288
          0 108 312 873 144
        New average: 156.0
