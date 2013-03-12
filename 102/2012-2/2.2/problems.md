Lab 2.2 - Multidimensional Arrays
=================================

1. Write a method that sums all integers in major diagonal of a square matrix

        public static int sumMajorDiagonal(int[][] matrix)

   Read 16 numbers for a `4x4` matrix, and display its major diagonal sum

        Enter a 4-by-4 matrix row by row:
         1   2   3   4
         5   6   7   8
         9  10  11  12
        13  14  15  16
        Sum of the elements in the major diagonal is 34

2. Build a `8x7` integer matrix of random numbers in range `1-9`.
   Print the matrix as follows:

                    Sun Mon Tue Wed Thu Fri Sat
        Employee-1   2   4   3   4   5   8   8
        Employee-2   7   3   4   3   3   4   4
        Employee-3   3   3   4   3   3   2   2
        Employee-4   9   3   4   7   3   4   1
        Employee-5   3   5   4   3   6   3   8
        Employee-6   3   4   4   6   3   4   4
        Employee-7   3   7   4   8   3   8   4
        Employee-8   6   3   5   9   2   7   9

   Compute and print the weekly hours for each employee
   in decreasing order of total hours.

        Employee-8  41
        Employee-7  37
        Employee-1  34
        Employee-5  32
        Employee-4  31
        Employee-2  28
        Employee-6  28
        Employee-3  20

3. Write a method to multiply two matrices.

        public static double[][] multiply(double[][] A, double[][] B)

   If the column size of matrix `A` is `n`, and `A x B = C`,
   then, `Cij = Ai1*B1j + Ai2*B2j + ... + Ain*Bnj`.

   Example:

        A11 A12 A13       B11 B12 B13       C11 C12 C13
        A21 A22 A23   x   B21 B22 B23   =   C21 C22 C23
        A31 A32 A33       B31 B32 B33       C31 C32 C33

   where `Cij = Ai1 * B1j + Ai2 * B2j + Ai3 * B3j`

   Write a test program that prompts the user to enter two `3x3` matrices,
   and displays their product. Here is a sample run:

        Enter 9 numbers for matrix A: 1 2 3 4 5 6 7 8 9
        Enter 9 numbers for matrix B: 0 2 4 1 4.5 2.2 1.1 4.3 5.2

        A x B =
          5.30  23.90  24.00
         11.60  56.30  58.20
         17.90  88.70  92.40