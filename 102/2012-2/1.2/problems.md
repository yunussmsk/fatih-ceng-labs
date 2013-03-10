Lab 1.2 - Arrays
================

1. Write a program which reads a decimal number,
   and converts it to a hexadecimal number.

   Decimal digits are: 0123456789  
   Hexadecimal digits are: 0123456789ABCDEF

   You can get a hexadecimal value by continuously dividing by 16
   until you get 0 as a quotient.

        Enter a decimal number: 123
        123 is 7B in hex.

2. Define a 100 element array and fill it with random lowercase letters.
   Then display how many times each letter is repeated.

3. Write a program which reads your birth day, month, and year,
   and calculates how many days old you are,
   and on which day of week you were born.
   Each of the calculations should be done in a separate method,
   and their result should be returned to other methods,
   and finally to the main method.

        Enter your birth year, month, and day: 1982 12 16
        Enter today's year, month, and day: 2013 03 10
        You are 11042 days old.
        You were born on Thursday
        Today is Sunday

   You should use the following facts during the calculations:
   * January 1st of 2006 was Sunday.
   * A leap year happens when the year is divisible by 4 or 400, but not 100.
     (i.e. 2012, 2000 were leap years, while 1900, 1999 were not).
   * During a leap year February has 29 days and a year has 366 days,
     otherwise February has 28 days, thus a year has 365 days.
