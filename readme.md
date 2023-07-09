# Painting Shape

This repository contains Java classes for creating and manipulating various shapes through painting. Each shape has methods to calculate its area and provide information about the shape through a `toString` method. The `Paint` class has an attribute called `coverage`, which represents the coverage of paint per unit area. It provides a method to calculate the amount of paint needed to cover a specific shape.

## Classes

The following classes are included in this repository:

1. `Cylinder.java`: Represents a cylinder shape. It extends the `Shape` class and provides methods to calculate the area and retrieve information about the cylinder.

2. `Paint.java`: Represents a paint object with a coverage attribute. It provides a method to calculate the amount of paint needed to cover a specific shape.

3. `PaintThings.java`: A sample program that demonstrates the usage of the `Paint` class and calculates the amount of paint needed for different shapes.

4. `Rectangle.java`: Represents a rectangle shape. It extends the `Shape` class and provides methods to calculate the area and retrieve information about the rectangle.

5. `Shape.java`: An abstract class that serves as the base for all shapes. It defines common methods like `getArea` and `toString`, which are implemented by the concrete shape classes.

6. `Sphere.java`: Represents a sphere shape. It extends the `Shape` class and provides methods to calculate the area and retrieve information about the sphere.

## Usage

To use these classes, you can clone the repository and import the necessary Java files into your project. Once imported, you can create instances of the different shape classes, calculate their areas, and obtain string representations of the shapes. You can also create a `Paint` object, set its coverage attribute, and use its `calculatePaintNeeded()` method to determine the amount of paint required to cover a specific shape.

For example, in the `PaintThings.java` class, you will find sample code that demonstrates the usage of the shape classes and the `Paint` class.

```java
// Create a new rectangle with dimensions 5x10
Rectangle rectangle = new Rectangle(5, 10);

// Calculate the area of the rectangle
double rectangleArea = rectangle.calculateArea();
System.out.println("Rectangle area: " + rectangleArea);

// Get the string representation of the rectangle
String rectangleString = rectangle.toString();
System.out.println("Rectangle: " + rectangleString);

// Create a new sphere with radius 3
Sphere sphere = new Sphere(3);

// Calculate the area of the sphere
double sphereArea = sphere.calculateArea();
System.out.println("Sphere area: " + sphereArea);

// Get the string representation of the sphere
String sphereString = sphere.toString();
System.out.println("Sphere: " + sphereString);

// Create a new paint with coverage 10 square units
Paint paint = new Paint(10);

// Calculate the amount of paint needed to cover the rectangle
double paintNeeded = paint.calculatePaintNeeded(rectangle);
System.out.println("Paint needed for rectangle: " + paintNeeded);

// Calculate the amount of paint needed to cover the sphere
paintNeeded = paint.calculatePaintNeeded(sphere);
System.out.println("Paint needed for sphere: " + paintNeeded);
```

Make sure to replace the values and shapes in the example with your own specific requirements.

## Contribution

Contributions to this repository are welcome. If you would like to contribute, please follow these steps:

1. Fork the repository by clicking on the "Fork" button on the repository's page.

2. Clone your forked repository to your local machine:

   ```
   git clone https://github.com/your-username/painting-shape.git
   ```

3. Create a new branch for your changes:

   ```
   git checkout -b feature/new-feature
   ```

4. Make your desired changes and commit them:

   ```
   git commit -m "Add new feature"
   ```

5. Push your changes to your forked repository:

   ```
   git push origin feature/new-feature
   ```

6. Open a pull request on the original repository's page and describe your changes.

Once your pull request is reviewed and approved, it will be merged into the main repository. Thank you for your contribution!
