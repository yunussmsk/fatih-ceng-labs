Lab 4.1 - Classes and Objects
=============================

1. Write a `GradeBook` class that has
    * a private `String` field `courseName`,
    * a constructor to initialize this field,
    * and a `displayMessage()` method welcoming to a certain course.

   Define and use this class.

2. Class `Account` has an instance variable `balance` as a decimal number.
    * An object of this class is defined by specifying the initial balance.
    * `deposit()` method takes an `amount` parameter as a decimal number
      and adds this amount to the balance.
    * `withdraw()` is similar but decreases the balance by the specified amount.

   Write a program that lets the user to choose what to do with an account.
   Display relevant menu and messages after each transaction.

3. Write a Date class that includes three integers as instance variables:
   a `month`, a `day`, and a `year`.
    * Your class should have a constructor that initializes these
      three instance variables by calling their set methods.
    * Provide a set and a get method for each instance variable.
    * Set methods set the value to 1 if it is invalid.
    * Provide a method `toString` that
      returns the `year`, `month`, and `day` separated by forward slashes `/`.
    * Write a test application named `DateTest` that demonstrates `Date` class.
    * Get `year`, `month`, and `day` from user, and display the entered date.
    * Read another date, and find out which of them is more recent.
    * To achieve this, add following method to `Date` class:

                boolean isNewerThan(Date d)
    * Calculate and display year difference between these two dates.
