Lab 3.2 - Classes and Objects
=============================

1. Write a `Rectangle` class with
   `width` and `height` properties and `getArea()` and `getPerimeter()` methods.
    * Construct two rectangle objects and calculate sum of their areas.
    * Add a method to the Rectangle class that returns `true`
      if its area is greater than its perimeter.

2. Write `Dog` class with properties `name` and `barksound`.
   Write a constructor to be used as follows:

        Dog dexter = new Dog("Dexter", "woof");

   Add these behaviors:
    * `sayName()`: Displays `My name is Dexter`.
    * `bark()`: Displays dog's barksound: `woof`.
      (woof, ruff, arf, au au, yip, bow-wow are some barksounds.)
    * `sleep()`: Displays `Zzzz`.
    * `isHappy()`: Bark three distinct times (each displayed in a new line).
    * `isAngry()`: Bark nine consecutive times in a line.

   Test these methods in your `main` method on multiple `Dog` objects.

3. Write a Room class with the following properties:
    * `roomNo`: E302, B324, A112, ...
    * `roomCapacity`:  24, 60, 100, ...
    * `roomType`: lab, lesson, amphi, ...

   Also add the following behaviors:
    * `isEmpty()`, showing a message that the room is empty.
    * `isFull()`, showing a message that the room is full.
    * A no-args constructor
    * An all-args constructor
    * A constructor that takes only the room number as parameter.

   Write a test program that initializes three Room objects,
   and uses all the features mentioned above.

        Room room1 = new Room("E302", 24, "lab", 20);
        Room room2 = new Room();
        Room room3 = new Room("E302");
        . . .
