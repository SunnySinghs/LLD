package Design.TicTacToe.Model;

import Design.TicTacToe.Enum.PieceType;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private PlayingPiece[][] board;
    // Counters for rows, columns, and diagonals
    private int[] rows;
    private int[] cols;
    private int diagonal;
    private int antiDiagonal;

    public Board(int size) {
        this.size = size;
        this.rows = new int[size];
        this.cols = new int[size];
        this.diagonal = 0;
        this.antiDiagonal = 0;
        this.board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int column, PlayingPiece playingPiece) {
        if (row < 0 || row >= size || column < 0 || column >= size || board[row][column] != null) {
            return false;
        }
        board[row][column] = playingPiece;
        // Update counters
        int value = (playingPiece.getPieceType() == PieceType.X) ? 1 : -1; // X -> +1, O -> -1
        rows[row] += value;
        cols[column] += value;
        if (row == column) {
            diagonal += value; // Primary diagonal
        }
        if (row + column == size - 1) {
            antiDiagonal += value; // Anti-diagonal
        }
        return true;
    }

    public List<int[]> getFreeCells() {
        List<int[]> list = new ArrayList<>();
        for (int i=0; i<size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    list.add(new int[]{i, j});
                }
            }
        }
        return list;
    }

    public void printBoard() {
        for (int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                if(board[i][j] != null) {
                    System.out.print(board[i][j].getPieceType().name() + " ");
                } else {
                    System.out.print("  ");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }

    public boolean checkWin(PieceType pieceType) {
        int target = (pieceType == PieceType.X) ? size : -size; // X -> size, O -> -size
        for (int i = 0; i < size; i++) {
            if (rows[i] == target || cols[i] == target) {
                return true;
            }
        }
        return diagonal == target || antiDiagonal == target;
    }

    public boolean checkWin1(int row, int column, PieceType pieceType) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //Row check
        for(int i=0; i<size; i++) {
            if (board[row][i] == null || board[row][i].getPieceType() != pieceType) {
                rowMatch = false;
            }
        }

        //Column check
        for(int i=0; i<size; i++) {
            if (board[i][column] == null || board[i][column].getPieceType() != pieceType) {
                columnMatch = false;
            }
        }

        //Diagonal check
        for(int i=0, j=0; i<size; i++, j++) {
            if (board[i][j] == null || board[i][j].getPieceType() != pieceType) {
                diagonalMatch = false;
            }
        }

        //Anti diagonal check
        for(int i=0, j=size-1; i<size; i++, j--) {
            if (board[i][j] == null || board[i][j].getPieceType() != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
