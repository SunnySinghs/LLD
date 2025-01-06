package Design.TicTacToe;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter board size: ");
        int boardSize = sc.nextInt();

        System.out.print("Please enter player count: ");
        int playerCount = sc.nextInt();
        sc.nextLine();

        Map<String, String> map = new HashMap<>(playerCount);
        while (playerCount != 0) {
            System.out.print("Enter the player name and piece: ");
            String input = sc.nextLine();
            String[] values = input.split(",");
            map.put(values[0], values[1]);
            playerCount--;
        }

        TicTacToeGame game = new TicTacToeGame(boardSize, map);
        System.out.println("game winner is: " + game.startGame());
    }
}
