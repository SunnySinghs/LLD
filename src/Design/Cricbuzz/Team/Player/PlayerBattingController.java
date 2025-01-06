package Design.Cricbuzz.Team.Player;

import java.util.LinkedList;
import java.util.Queue;

public class PlayerBattingController {
    private Queue<PlayerDetails> yetToPlay;
    private PlayerDetails striker;
    private PlayerDetails nonStriker;

    public PlayerBattingController(Queue<PlayerDetails> yetToPlay) {
        this.yetToPlay = new LinkedList<>();
        this.yetToPlay.addAll(yetToPlay);
    }

    public Queue<PlayerDetails> getYetToPlay() {
        return yetToPlay;
    }

    public void setYetToPlay(Queue<PlayerDetails> yetToPlay) {
        this.yetToPlay = yetToPlay;
    }

    public PlayerDetails getStriker() {
        return striker;
    }

    public void setStriker(PlayerDetails striker) {
        this.striker = striker;
    }

    public void getNextPlayer() throws Exception {
        if (yetToPlay.isEmpty()) {
            throw new Exception("All players have played");
        }

        if (striker == null) {
            striker = yetToPlay.poll();
        }

        if (nonStriker == null) {
            nonStriker = yetToPlay.poll();
        }
    }

    public PlayerDetails getNonStriker() {
        return nonStriker;
    }

    public void setNonStriker(PlayerDetails nonStriker) {
        this.nonStriker = nonStriker;
    }
}
