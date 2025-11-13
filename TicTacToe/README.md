# Tic Tac Toe (Java Console Application)

This is a simple two-player Tic Tac Toe game developed in Java. It operates in the console and enables two users to play turn by turn on a 3x3 grid.

## Table of Contents

- [Features](#features)
- [Requirements](#requirements)
- [How to Run](#how-to-run)
- [Sample Output](#sample-output)

## Features

- Supports two-player turn-based gameplay (Player X and Player O)
- Includes input validation for:
  - Out-of-range positions
  - Occupied cells
  - Non-numeric input
- Checks for win and draw conditions
- Displays a clean and simple grid after each move

## Requirements

- Java Development Kit (JDK) 8 or later (tested on Java 23.0.1)

## How to Run

1. Clone or download the project.
2. Open `TicTacToe.java` in your IDE or terminal.
3. Compile and run using the following commands:

```bash
javac TicTacToe.java
java TicTacToe
```

## Sample Output

```
Welcome to Tic Tac Toe!
-------------
|   |   |   |
-------------
|   |   |   |
-------------
|   |   |   |
-------------
Player X, enter your move (row[1-3] and column[1-3]): 1 1
-------------
| X |   |   |
-------------
|   |   |   |
-------------
|   |   |   |
-------------
Player O, enter your move (row[1-3] and column[1-3]): 1 2
-------------
| X | O |   |
-------------
|   |   |   |
-------------
|   |   |   |
-------------

... (turns continue)

Player X wins!
Game Over!
```
