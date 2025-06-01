import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = {
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' }
    };

    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean gameEnded = false;

        System.out.println("🎮 Welcome to Tic Tac Toe!");
        printBoard();

        while (!gameEnded) {
            int row = -1;
            int col = -1;

            while (true) {
                try {
                    System.out.print("Player " + currentPlayer + ", enter your move (row[1-3] and column[1-3]): ");
                    row = input.nextInt() - 1;
                    col = input.nextInt() - 1;

                    if (row < 0 || row > 2 || col < 0 || col > 2) {
                        System.out.println("Invalid position. Please choose between 1 and 3 for both row and column.");
                    } else if (board[row][col] != ' ') {
                        System.out.println("Cell already taken. Try again.");
                    } else {
                        board[row][col] = currentPlayer;
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter numbers only.");
                    input.nextLine(); // clear buffer
                }
            }

            printBoard();

            if (checkWin(currentPlayer)) {
                System.out.println("🎉 Player " + currentPlayer + " wins!");
                gameEnded = true;
            } else if (isBoardFull()) {
                System.out.println("It's a draw!");
                gameEnded = true;
            } else {
                // Switch player
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }

        input.close();
        System.out.println("Game Over!");
    }

    private static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    private static boolean checkWin(char player) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        // Check diagonals
        return ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player));
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    return false;
        return true;
    }
}
