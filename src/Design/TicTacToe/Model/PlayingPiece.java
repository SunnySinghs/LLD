package Design.TicTacToe.Model;

import Design.TicTacToe.Enum.PieceType;

public abstract class PlayingPiece {
    private PieceType pieceType;

    public PlayingPiece(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    public PieceType getPieceType() {
        return pieceType;
    }
}