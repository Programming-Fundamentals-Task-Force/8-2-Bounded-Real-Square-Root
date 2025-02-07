# Assignment 8-2: Bounded Real Square Root

Name:

ID:

## Problem Overview

You will implement a bounded generic method that computes the square root of a given number while handling invalid inputs using a custom exception.

This assignment introduces:

- Bounded generics (`T extends Number`) – ensuring type safety while working with numeric types.
- Custom exceptions (`NegativeValueException`) – enforcing error handling for invalid inputs.
- Try-catch-finally – ensuring proper exception handling and cleanup.

Your goal is to design a generic method `squareRoot()` inside the `MathUtils` class that:

- Accepts only `Number` types (e.g., `Integer`, `Double`) using bounded generics.
- Throws a custom exception `NegativeValueException` if the input is negative.

## Setup and Environment

- **WARNING:** Do not modify the `.github` or `gradle-tests` directories. These directories are essential for the automated grading process, and any changes may result in incorrect grading.

The Maven project has already been created for you. The package name is com.lab, and the project name (and directory) is lab82. Use `mvn compile` to build the project and `java -cp target/classes com.lab.App` or `mvn exec:java "-Dexec.mainClass=com.lab.App"` to run it.

## Requirements and Specifications

Class: `NegativeValueException` (custom exception)

- An unchecked exception (extends `RuntimeException`).
- Should be thrown when attempting to compute the square root of a negative number.
- Constructor should accept an error message (a `String`).

Class: `MathUtils` (utility class)

- Implements a bounded generic method:
  - `public static <T extends Number> double squareRoot(T value)`
  - Accepts only `Number` types (e.g., `Integer`, `Double`).
  - Throws `NegativeValueException` with the message `"Cannot compute square root of a negative number."` if value is negative.
  - Returns the square root of the given number using `Math.sqrt()`.

## Examples and Usage

Executing `main()` should produce the following output:

```
Result: 5.0
Error: Cannot compute square root of a negative number.
Computation completed.
```

## Additional Notes

- Ensure `squareRoot()` is truly generic and works with `Integer`, `Double`, `Float`, etc.
- Consider edge cases, such as passing `0` as input (valid case).