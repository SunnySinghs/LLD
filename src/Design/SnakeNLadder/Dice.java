package Design.SnakeNLadder;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private int diceCount;
    private int sides;

    public Dice(int diceCount, int side) {
        this.diceCount = diceCount;
        this.sides = side;
    }

    public int rollDice() {
        int sum = 0;
        int diceUsed = 0;

        while(diceUsed < diceCount) {
            sum += ThreadLocalRandom.current().nextInt(1, sides+1);
            diceUsed++;
        }
        return sum;
    }
}
