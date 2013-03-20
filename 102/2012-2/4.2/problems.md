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
    * For the first object: Assign `speed` to maximum, `radius` to `10`,
      `color` to `yellow`, and turn it on.
    * For the second object: Assign `speed` to medium, `radius` to `5`,
      `color` to `blue`, and turn it off.
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

            Area = n·s² / 4·tan(π/n)
    * Draw the UML diagram for the class.
    * Implement the class.
    * Write a test program that creates three `RegularPolygon` objects,
      with the no-arg constructor, `RegularPolygon(4, 6)`,
      and `RegularPolygon(10, 4, 5.6, 7.8)`.
    * For each object, display its perimeter and area.

3. Define the Rectangle class that contains:
    * Two `int` data fields `x` and `y` as rectangle center coordinates
    * Two `int` data fields `width` and `height` with get and set methods
    * A static `rectangleCount` variable that keeps the count of the
      rectangles created, initially `0`
    * `MAX_COUNT`, a constant with value `3`
    * A no-arg constructor that creates a default rectangle with `(0, 0)`
      for `(x, y)`, and `1` for both `width` and `height`,
    * A constructor that creates a rectangle with the specified
      `x`, `y`, `width`, and `height`.
    * Both constructors above increment the value of `rectangleCount` by one.
    * Static method `isFull()` returns true if `rectangleCount >= MAX_COUNT`.
    * Write get and set methods if necessary.
    * A method `getArea()` that returns the area of the rectangle.
    * A method `getPerimeter()` that returns the perimeter of the rectangle.
    * A method `contains(int x, int y)` that returns `true`
      if the specified point `(x, y)` is inside this rectangle.
    * Test the class above, and create several rectangles.
    * After each change, display values of `rectangleCount`, `MAX_COUNT`,
      and `isFull()`, and whether a point is inside a rectangle.
