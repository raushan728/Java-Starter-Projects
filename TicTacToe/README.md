# ❌⭕ Tic Tac Toe (Java Console App)

This is a simple **2-player Tic Tac Toe** game built using Java.  
It runs in the console and allows two users to play turn by turn on a 3x3 grid.

---

## 🚀 Features

- 2-player turn-based game (Player X and Player O)
- Input validation for:
  - Out-of-range positions
  - Occupied cells
  - Non-numeric input
- Checks for win and draw conditions
- Clean and simple grid display after every move

---

## 🛠️ Requirements

- Java Development Kit (JDK) 8 or later  
  _(Tested on Java 23.0.1)_

---

## ▶️ How to Run

1. Clone or download the project.
2. Open `TicTacToe.java` in your IDE or terminal.
3. Compile and run with:

```bash
javac TicTacToe.java
java TicTacToe
```
---

## 💡 Sample Output
```
🎮 Welcome to Tic Tac Toe!
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

🎉 Player X wins!
Game Over!
```
