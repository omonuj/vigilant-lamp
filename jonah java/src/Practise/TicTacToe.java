package Practise;

import java.util.Scanner;

public class TicTacToe {

    public enum Cell {
        X, O, EMPTY;
    }
    private Cell[][] board;
    private Cell currentPlayer;
    private boolean isGameOver;

    public TicTacToe() {
        board = new Cell[3][3];
        currentPlayer = Cell.X;
        isGameOver = false;

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = Cell.EMPTY;
            }
        }
    }

    public void printBoard() {
        print("Current board");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == Cell.EMPTY) {
                    print(" - ");
                } else {
                    print(" " + board[row][col]);
                }
            }
            print("");
        }
    }
    private void switchPlayer() {
        currentPlayer = (currentPlayer == Cell.X) ? Cell.O : Cell.X;
    }
    public boolean makeMove(int row, int col) {
        if(row >= 0 && row < 3 && col >= 0 && col < 3) {
            board[row][col] = currentPlayer;
            return true;
        }
        return false;
    }
    public boolean checkWin(){
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == currentPlayer && board[row][1] == currentPlayer && board[row][2] == currentPlayer) {
                return true;
            }
        }

        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }

        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        return false;

    }

    public boolean checkDraw(){
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == Cell.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public void playGame(){
        Scanner scanner = new Scanner(System.in);

        while (!isGameOver) {
            printBoard();
            print("Player" + currentPlayer + " it's your turn.");

            int row;
            int col;
            boolean validMove;

            do {
                print("Enter row(0, 1, 2): ");
                row = scanner.nextInt();
                print("Enter col(0, 1, 2): ");
                col = scanner.nextInt();

                validMove = makeMove(row, col);

                if (!validMove) {
                    print("Invalid move! Try again.");
                }
            } while (!validMove);

            if (checkWin()) {
                printBoard();
                print("Player" + currentPlayer + " wins!");
                isGameOver = true;
            } else if (checkDraw()) {
                printBoard();
                print("It's a draw!");
                isGameOver = true;
            } else {
                switchPlayer();
            }
        }
        scanner.close();
    }

    private static void print(String message) {
        System.out.println(message);
    }

}
