# Simple Calculator (Java Console Application)

This is a basic calculator application developed in Java. It operates in the console and enables users to perform fundamental arithmetic operations, including addition, subtraction, multiplication, and division.

## Table of Contents

- [Features](#features)
- [Requirements](#requirements)
- [How to Run](#how-to-run)
- [Sample Output](#sample-output)

## Features

- Supports basic arithmetic operations: `+`, `-`, `*`, `/`
- Handles division by zero errors
- Validates operator input
- Manages invalid numeric entries gracefully
- Continues execution in a loop until the user chooses to exit

## Requirements

- Java Development Kit (JDK) 8 or later (tested on Java 23.0.1)
- Any IDE (such as IntelliJ IDEA, Visual Studio Code) or terminal with Java support

## How to Run

1. Clone or download this repository.
2. Open the `Calculator.java` file in your Java IDE or terminal.
3. Compile and run the file using the following commands:

```bash
javac Calculator.java
java Calculator
```

## Sample Output

```
=== Simple Calculator ===

Enter first number: 10
Enter second number: 5
Choose operation (+, -, *, /): *
Result: 50.0

Do you want to perform another calculation? (yes/no): yes

Enter first number: 20
Enter second number: 0
Choose operation (+, -, *, /): /
Error: Cannot divide by zero.

Do you want to perform another calculation? (yes/no): y

Enter first number: 15
Enter second number: 5
Choose operation (+, -, *, /): -
Result: 10.0

Do you want to perform another calculation? (yes/no): no
Exiting Calculator. Goodbye!
