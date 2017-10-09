# Java assessment

# Java Fundamentals Assessment

## Getting Started

- Create a new project in your `IdeaProjects` folder and name it `java-assessment`
- Go to `VCS -> Enable Version Control integration`, choose `git`
- Go to `VCS -> Import into Version Control -> Share project on Github` use the default values  
- You'll write your code directly on the `master` branch
- Commit your work and push it to Github.

## Problems

Write methods with the following names and behavior

- Create a class named `Assessment` inside of the `src/main/java` folder. Add the following methods:
    - Write a static method called `square(number)` accepts an integer as input and returns that number times itself.
    - Write a static method `sum(number1, number2)` method that works with both integers and doubles (use method overloading) and returns the result.
    - Write a static method called `average(numbers)` that takes in an array of integers and returns the average as a double.
    - Write a `main` method on this class in order to run code that tests the above methods.

- Create a class named `Person` inside of `src/main/java`.
   - Add `firstName` and `lastName` as protected properties.
   - Add a constructor method that takes in two strings that are `firstName` and `lastName`.
   - The `firstName` and `lastName` properties cannot be `null`.
   - If the `firstName` or `lastName` inputs are `null`, be sure to throw an `IllegalArgumentException` inside of the constructor.
   - Write a getter and setter for the `firstName` property as well as a getter and setter for `lastName`.

- Create a class called `User` that inherits from `Person`.
    - Add a protected property called `isAdmin` that is a boolean.
    - Write the constructor on `User` so that it extends from `Person` and accepts a 3rd parameter, a boolean of whether or not that user is an administrator.
    - Write a method on the `User` class called `isAdmin()` that returns a boolean if the contact is an administrator.

- Create an interface called `Greeter`. 
    - Greeter interface should specify a method called `sayHello()`.
    - Go to your `Person` class and ensure that it implements the `Greeter` interface.
    - The implementation of `sayHello()` method on Person class should produce "Hello from `firstName`  `lastName`" using the class properties to display the assigned values.

- On your `Assessment` class create a method called `capitalizeRecords`.
    - The method takes in an `ArrayList` of  `User` objects. The `capitalizeRecords` method should check to make sure that each object's `firstName` and `lastName` property are capitalized. If they are not, use the setter to capitalize the first letter of each `firstName` and `lastName` and the method should return a copy of the `ArrayList`.
