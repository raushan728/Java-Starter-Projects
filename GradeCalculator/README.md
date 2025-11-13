# Grade Calculator (Java Console Application)

This is a Java console application that calculates a student's grade based on marks entered for five subjects. The program accepts user inputs, validates them, computes total and average marks, and assigns a grade accordingly.

## Table of Contents

- [Features](#features)
- [Requirements](#requirements)
- [How to Run](#how-to-run)
- [Sample Output](#sample-output)

## Features

- Accepts marks for five subjects (out of 100 each)
- Validates non-numeric input and out-of-range values
- Calculates total and average marks
- Assigns grades based on average percentage:
  - A: 90–100
  - B: 80–89
  - C: 70–79
  - D: 60–69
  - F: Below 60
- Provides user-friendly error messages

## Requirements

- Java Development Kit (JDK) 17 or later (tested on Java 23.0.1)
- To check your Java version, run: `java --version`

## How to Run

Compile and run the application using the following commands:

```
javac GradeCalculator.java
java GradeCalculator
```

## Sample Output

```
Welcome to Grade Calculator!
Please enter marks for 5 subjects (out of 100):
Enter marks for subject 1: 85
Enter marks for subject 2: 90
Enter marks for subject 3: 88
Enter marks for subject 4: 92
Enter marks for subject 5: 79

Results:
Total Marks: 434.0 / 500
Average: 86.8
Grade: B
```

If marks are out of range:

```
Enter marks for subject 4: 120
Marks must be between 0 and 100.
