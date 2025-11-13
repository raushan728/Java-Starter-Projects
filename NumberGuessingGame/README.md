# Number Guessing Game (Java Console Application)

This is a simple number guessing game developed in Java. The program randomly selects a number between 1 and 100, and the player must guess it in as few attempts as possible.

## Table of Contents

- [Features](#features)
- [Requirements](#requirements)
- [How to Run](#how-to-run)
- [Sample Output](#sample-output)

## Features

- Generates a random number between 1 and 100
- Tracks the number of attempts made by the player
- Provides hints indicating if the guess is too high or too low
- Handles invalid (non-numeric) inputs gracefully
- Continues running until the user chooses to exit

## Requirements

- Java Development Kit (JDK) 8 or later (tested on Java 23.0.1)
- Any Java-supported terminal or IDE (such as IntelliJ IDEA, Visual Studio Code, Eclipse)

## How to Run

1. Clone or download this repository.
2. Open the `NumberGuess.java` file in your Java IDE or terminal.
3. Compile and run the file using the following commands:

```bash
javac NumberGuess.java
java NumberGuess
```

## Sample Output

```
Welcome to Number Guessing Game!

I have selected a number between 1 and 100. Try to guess it!
Enter your guess: 50
Too low! Try again.
Enter your guess: 75
Too high! Try again.
Enter your guess: 65
Congratulations! You guessed it in 3 attempts.

Do you want to play again? (yes/no): no
Thanks for playing! Goodbye!
