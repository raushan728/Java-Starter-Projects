# 🧮 Simple Calculator (Java Console App)

This is a basic calculator application built using Java.  
It runs in the console and allows users to perform arithmetic operations like addition, subtraction, multiplication, and division.

---

## 🚀 Features

- Supports `+`, `-`, `*`, `/` operations
- Handles divide-by-zero errors
- Validates operator input
- Gracefully handles invalid number entries
- Runs in a loop until user decides to exit

---

## 🛠️ Requirements

- Java Development Kit (JDK) 8 or later  
  _(Tested on Java 23.0.1)_
- Any IDE (like IntelliJ, VS Code) or terminal with Java support


---

## ▶️ How to Run

1. Clone or download this repository.
2. Open the `Calculator.java` file in your Java IDE or terminal.
3. Compile and run the file using:

```bash
javac Calculator.java
java Calculator

```
---

## 💡 Sample Output
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

