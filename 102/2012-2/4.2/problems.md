Lab 4.2 - Classes and Objects
=============================

1. Design a class named `Fan` to represent a fan. The class contains:
    * Three constants named `SLOW`, `MEDIUM`, and `FAST`
      with values `1`, `2`, and `3` to denote the fan speed.
    * A `private int` data field named `speed`
      that specifies the speed of the fan (default `SLOW`).
    * A `private boolean` data field named `on`
      that specifies whether the fan is on (default `false`).
    * A `private double` data field named `radius`
      that specifies the radius of the fan (default `5`).
    * A `private String` data field named `color`
      that specifies the color of the fan (default `blue`).
    * The accessor and mutator methods for all four data fields.
    * A no-arg constructor that creates a default fan.
    * A method named `toString()` that returns a string description for the fan.
      If the fan is on, the method returns the fan speed, color, and radius in
      one combined string. If the fan is not on, the method returns fan color
      and radius along with the string `fan is off` in one combined string.
    * Draw the UML diagram for the class.
    * Implement the class.
    * Write a test program that creates two `Fan` objects.
    * Assign maximum speed, radius 10, color yellow, and turn it on
      for the first object.
    * Assign medium speed, radius 5, color blue, and turn it off
      for the second object.
    * Display the objects by invoking their `toString` method.

2. Design a class named `RegularPolygon` (in an n-sided regular polygon all
   sides have the same length and all angles have the same degree, i.e., the
   polygon is both equilateral and equiangular), that contains:
    * A `private int` data field named `n` that defines the number of sides in
      the polygon with default value `3`.
    * A `private double` data field named `side` that stores the length of the
      side with default value `1`.
    * A `private double` data field named `x` that defines the x-coordinate of
      the center of the polygon with default value `0`.
    * A `private double` data field named `y` that defines the y-coordinate of
      the center of the polygon with default value `0`.
    * A no-arg constructor that creates a regular polygon with default values.
    * A constructor that creates a regular polygon with the specified number of
      sides, and length of side, centered at `(0, 0)`.
    * A constructor that creates a regular polygon with the specified number of
      sides, length of side, and x-and y-coordinates.
    * The accessor and mutator methods for all data fields.
    * The method `getPerimeter()` that returns the perimeter of the polygon.
    * The method `getArea()` that returns the area of the polygon.
      The formula for computing the area of a regular polygon is:

            Area = (n * s * s) / (4 * tan(p/n))
    * Draw the UML diagram for the class.
    * Implement the class.
    * Write a test program that creates three `RegularPolygon` objects,
      with the no-arg constructor, `RegularPolygon(4, 6)`,
      and `RegularPolygon(10, 4, 5.6, 7.8)`.
    * For each object, display its perimeter and area.
