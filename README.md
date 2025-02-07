# Assignment 8-2: Bounded Real Square Root

Name:

ID:

## Problem Overview

You will implement a bounded generic method that computes the square root of a given number while handling invalid inputs using a custom exception.

This assignment introduces:

- Bounded generics (`T extends Number`) – Ensuring type safety while working with numeric types.
- Custom exceptions (`NegativeValueException`) – Enforcing error handling for invalid inputs.
- Try-catch-finally – Ensuring proper exception handling and cleanup.

Your goal is to design a generic method `squareRoot()` inside the `MathUtils` class that:

- Accepts only `Number` types (e.g., `Integer`, `Double`) using bounded generics.
- Throws a custom exception `NegativeValueException` if the input is negative.

## Setup and Environment

- **WARNING:** Do not modify the `.github` or `gradle-tests` directories. These directories are essential for the automated grading process, and any changes may result in incorrect grading.

The Maven project has already been created for you. The package name is com.lab, and the project name (and directory) is lab82. Use `mvn compile` to build the project and `java -cp target/classes com.lab.App` or `mvn exec:java "-Dexec.mainClass=com.lab.App"` to run it.

## Requirements and Specifications

Class: `NegativeValueException` (custom exception)

- A checked exception (extends Exception).
- Should be thrown when attempting to compute the square root of a negative number.
- Constructor should accept an error message (a `String`).

Class: `MathUtils` (utility class)

- Implements a bounded generic method:
  - `public static <T extends Number> double squareRoot(T value) throws NegativeValueException`
  - Accepts only `Number` types (e.g., `Integer`, `Double`).
  - Throws `NegativeValueException` if value is negative.
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
- Consider edge cases, such as:
  - Passing `0` as input (valid case).
  - Passing a very large number.