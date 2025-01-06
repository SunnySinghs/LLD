package Design.SnakeNLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    private Board board;
    private Dice dice;
    private Deque<Player> players;
    private Player winner;

    public Game(int size, int noOfDice, int sides, int noOfSnakes, int noOfLadders) {
        this.board = new Board(size, noOfSnakes, noOfLadders);
        this.dice = new Dice(noOfDice, sides);
        this.players = new LinkedList<>();
        this.winner = null;
    }

    public boolean addPlayers(int count) {
        if (count == 1) {
            return false;
        }

        while (count > 0) {
            players.add(new Player("P"+count--));
        }
        return true;
    }

    public void startGame() {
        int boardSize = board.getSize() * board.getSize();
        System.out.println("Board size: " + boardSize);
        while (winner == null) {
            //check whose turn now
            Player playerTurn = findPlayerTurn();
            System.out.println("player turn is: " + playerTurn.getName() + " current position is: " + playerTurn.getPosition());

            //roll the dice
            int diceNo = dice.rollDice();
            System.out.println("Dice Sum: " + diceNo);
            //get the new position
            int playerNewPosition = playerTurn.getPosition() + diceNo;
            if (playerNewPosition > boardSize) {
                System.out.println("Cannot move, overshot the board!");
            } else {
                playerNewPosition = jumpCheck(playerNewPosition);
                playerTurn.setPosition(playerNewPosition);
                System.out.println("player turn is:" + playerTurn.getName() + " new Position is: " + playerNewPosition);
                
                if (playerNewPosition == boardSize) {
                    winner = playerTurn;
                }
            }
            System.out.println();
        }
        System.out.println("WINNER IS:" + winner.getName());
    }

    private int jumpCheck(int playerNewPosition) {
        Cell cell = board.getCell(playerNewPosition);

        if (cell.getJump() != null && cell.getJump().getStart() == playerNewPosition) {
            String jumpBy = cell.getJump().getStart() < cell.getJump().getEnd() ? "Ladder" : "Snake";
            System.out.println("Jump done by: " + jumpBy);
            playerNewPosition = cell.getJump().getEnd();
        }
        return playerNewPosition;
    }

    private Player findPlayerTurn() {
        Player playerTurn = players.removeFirst();
        players.add(playerTurn);
        return playerTurn;
    }
}
