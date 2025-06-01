# 🎓 Grade Calculator (Java)

This is a simple Java console application that calculates a student's grade based on marks entered for 5 subjects. The program accepts inputs, validates them, calculates total and average marks, and assigns a grade accordingly.

---

## 📌 Features

- Accepts marks for 5 subjects (out of 100)
- Validates non-numeric input and out-of-range values
- Calculates total and average marks
- Assigns grades based on average:
  - A: 90–100
  - B: 80–89
  - C: 70–79
  - D: 60–69
  - F: Below 60
- User-friendly error messages

---

## 🧑‍💻 How to Run

### ✅ Prerequisites

- Java installed (Java 17+ recommended)
- Your Java version: `java --version`  
  Example:
  ```bash
  java 23.0.1
  ```
---

## ▶️ Steps to Compile & Run:
```
javac GradeCalculator.java
java GradeCalculator

```
---

## 💡 Sample Output
```
🎓 Welcome to Grade Calculator!
Please enter marks for 5 subjects (out of 100):
Enter marks for subject 1: 85
Enter marks for subject 2: 90
Enter marks for subject 3: 88
Enter marks for subject 4: 92
Enter marks for subject 5: 79

📊 Results:
Total Marks: 434.0 / 500
Average: 86.8
Grade: B
```
---

If marks out of range:
```
Enter marks for subject 4: 120
❌ Marks must be between 0 and 100.