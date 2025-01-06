package Design.Cricbuzz.Team.Player;

import java.util.*;

public class PlayerBowlingController {
    private Deque<PlayerDetails> bowlersList;
    private Map<PlayerDetails, Integer> bowlerVsOversCount;
    private PlayerDetails currentBowler;

    public PlayerBowlingController(List<PlayerDetails> bowlersList) {
        setBowlerList(bowlersList);
    }

    private void setBowlerList(List<PlayerDetails> bowlersList) {
        this.bowlersList = new LinkedList<>();
        bowlerVsOversCount = new HashMap<>();
        for(PlayerDetails bowler: bowlersList) {
            this.bowlersList.addLast(bowler);
            bowlerVsOversCount.put(bowler, 0);
        }
    }

    public void getNextBowler(int maxOversPerBowler) {
        PlayerDetails bowler = bowlersList.poll();
        if (bowlerVsOversCount.get(bowler)+1 == maxOversPerBowler) {
            currentBowler = bowler;
        } else {
            currentBowler = bowler;
            bowlersList.addLast(bowler);
            bowlerVsOversCount.put(bowler, bowlerVsOversCount.get(bowler)+1);
        }
    }

    public PlayerDetails getCurrentBowler() {
        return currentBowler;
    }
}
