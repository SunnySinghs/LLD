package Design.TicTacToe;

import Design.TicTacToe.Model.PlayingPiece;
import Design.TicTacToe.Model.PlayingPieceNull;
import Design.TicTacToe.Model.PlayingPieceO;
import Design.TicTacToe.Model.PlayingPieceX;

public class PlayingPieceFactory {
    public static PlayingPiece getPlayingPiece(String type) {
        switch (type) {
            case "X":
                return new PlayingPieceX();
            case "O":
                return new PlayingPieceO();
            default:
                return new PlayingPieceNull();
        }
    }
}
