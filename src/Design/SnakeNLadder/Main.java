package Design.SnakeNLadder;

public class Main {
    public static void main(String[] args) {
        int size = 10;
        int dice = 1;
        int noOfSnakes = 5;
        int noOfLadders = 7;
        int sides = 6;
        Game game = new Game(size, dice, sides, noOfSnakes, noOfLadders);
        game.addPlayers(2);
        game.startGame();
    }
}
