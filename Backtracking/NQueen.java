package Backtracking;

import java.util.*;
class Solve {
boolean isSafe(int row, int col, int board[][]) {
for (int i = 0; i < row; i++) {
if (board[i][col] == 1) {
return false;
}
}
for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
if (board[i][j] == 1) {
return false;
}
}
for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
if (board[i][j] == 1) {
return false;
}
}
return true;
}
boolean nQueen(int row, int n, int board[][]) {
if (row == n) {
return true;
}
for (int i = 0; i < n; i++) {
if (isSafe(row, i, board)) {
board[row][i] = 1;
if (nQueen(row + 1, n, board)) {
return true;
}
board[row][i] = 0;
}
}
return false;
}
void printSolution(int n, int board[][]) {
if (nQueen(0, n, board)) {
System.out.println("The solution is:");
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
    System.out.print(board[i][j] + " ");
    }
    System.out.println();
    }
    } else {
    System.out.println("No solution");
    }
    }
    }
    public class NQueen {
    public static void main(String[] args) {
    int max = 20;
    Solve solve = new Solve();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of queens you want to place:");
    int n = sc.nextInt();
    if (n < 1 || n > max) {
    System.out.println("Invalid input");
    } else {
    int[][] board = new int[max][max];
    for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
    board[i][j] = 0;
    }
    }
    solve.printSolution(n, board);
    }
    sc.close();
    }
    }
    