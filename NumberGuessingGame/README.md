# 🎯 Number Guessing Game (Java Console App)

This is a simple number guessing game built in Java.  
The program randomly selects a number between 1 and 100, and the player has to guess it in as few attempts as possible.

---

## 🚀 Features

- Random number generated between **1 to 100**
- Tracks the number of attempts taken
- Provides hints if the guess is too high or too low
- Handles invalid (non-numeric) inputs
- Keeps running until the user chooses to exit

---

## 🛠️ Requirements

- Java Development Kit (JDK) 8 or later  
  _(Tested on Java 23.0.1)_
- Any Java-supported terminal or IDE (like IntelliJ, VS Code, Eclipse)

---

## ▶️ How to Run

1. Clone or download this repository.
2. Open the `NumberGuess.java` file in your Java IDE or terminal.
3. Compile and run the file using:

```bash
javac NumberGuess.java
java NumberGuess
```
---

## 💡 Sample Output
```
🎯 Welcome to Number Guessing Game!

I have selected a number between 1 and 100. Try to guess it!
Enter your guess: 50
Too low! Try again.
Enter your guess: 75
Too high! Try again.
Enter your guess: 65
🎉 Congratulations! You guessed it in 3 attempts.

Do you want to play again? (yes/no): no
Thanks for playing! Goodbye!
