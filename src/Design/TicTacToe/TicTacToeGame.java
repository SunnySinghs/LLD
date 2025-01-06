package Design.TicTacToe;

import Design.TicTacToe.Model.*;

import java.util.*;

public class TicTacToeGame {
    Deque<Player> players;
    Board board;

    public TicTacToeGame(int boardSize, Map<String, String> map) {
        initializeGame(boardSize, map);
    }

    private void initializeGame(int boardSize, Map<String, String> map) {
        players = new LinkedList<>();

        for(Map.Entry<String, String> entry: map.entrySet()) {
            /*if (entry.getValue().equals(PieceType.X.name())) {
                PlayingPieceX playingPieceX = new PlayingPieceX();
                players.add(new Player(entry.getKey(), playingPieceX));
            } else {
                PlayingPieceO playingPieceO= new PlayingPieceO();
                players.add(new Player(entry.getKey(), playingPieceO));
            }*/
            PlayingPiece playingPiece = PlayingPieceFactory.getPlayingPiece(entry.getValue());
            players.add(new Player(entry.getKey(), playingPiece));
        }

        board = new Board(boardSize);
    }

    public String startGame() {
        boolean noWinner = true;
        while (noWinner) {
            //Take out the player whose turn is and put back the payer in the list back
            Player playerTurn = players.removeFirst();

            //Get the free space from the board
            board.printBoard();
            List<int[]> freeCells = board.getFreeCells();
            if (freeCells.isEmpty()) {
                noWinner = false;
                continue;
            }

            System.out.print("Player: "+playerTurn.getName()+", Enter row, column: ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            String[] values = input.split(",");
            int row = Integer.parseInt(values[0]);
            int column = Integer.parseInt(values[1]);

            boolean canAddPiece = board.addPiece(row, column, playerTurn.getPlayingPiece());
            if (!canAddPiece) {
                //player can not insert the piece into this cell, player has to choose another cell
                System.out.println("Incorrect Position entered. Try Again");
                players.addFirst(playerTurn);
                continue;
            }

            players.addLast(playerTurn);

            //boolean winner = board.checkWin(row, column, playerTurn.getPlayingPiece().getPieceType());
            boolean winner = board.checkWin(playerTurn.getPlayingPiece().getPieceType());
            if (winner)
                return playerTurn.getName();
        }
        return "Tie";
    }

}
