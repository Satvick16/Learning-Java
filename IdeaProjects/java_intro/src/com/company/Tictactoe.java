package com.company;

import java.util.Scanner;

public class Tictactoe {

    public static void main(String[] args) {
//        boolean p = true;
//        boolean status = true;
//
//        while (status) {
//            String[][] board = newBoard();
//            showBoard(board);
//            int[] move = getMove(board);
//            String[][] updated_board = updateBoard(move, board, p);
//            status = assessBoard(updated_board);
//
//            if (!status) {
//                System.exit(0);
//            }
//
//            p = switchPlayer(p);
//        }

    }

    public static String[][] newBoard() {
        String[][] board = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = " ";
            }
        }

        return board;
    }

    public static void showBoard(String[][] board) {
        String row1 = String.format("%s|%s|%s", board[0][0], board[0][1], board[0][2]);
        String sep1 = "—+-+-";
        String row2 = String.format("%s|%s|%s", board[1][0], board[1][1], board[1][2]);
        String sep2 = "-+-+-";
        String row3 = String.format("%s|%s|%s", board[2][0], board[2][1], board[2][2]);

        System.out.println(row1 + "\n" + sep1 + "\n" + row2 + "\n" + sep2 + "\n" + row3);
    }

    public static int[] getMove(String[][] board) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Row: ");
        int row = scanner.nextInt();

        System.out.print("Column");
        int column = scanner.nextInt();

        return new int[]{row, column};
    }

    public static String[][] updateBoard(int[] move, String[][] board, boolean p) {
        int row = move[0] - 1;
        int column = move[1] - 1;

        if (p) {
            String xo = "x";
        } else {
            String xo = "o";
        }

        // TODO fix xo variable

//        board[row][column] = xo;

        return board;
    }

    // TODO add return value for assessBoard
//    public static boolean assessBoard(String[][] board) {
//
//    }

    public static boolean switchPlayer(boolean p) {
        return !p;
    }
}

