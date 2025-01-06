package Design.Cricbuzz.Team;

import Design.Cricbuzz.Team.Player.PlayerBattingController;
import Design.Cricbuzz.Team.Player.PlayerBowlingController;
import Design.Cricbuzz.Team.Player.PlayerDetails;

import java.util.List;
import java.util.Queue;

public class Team {
    private String teamName;
    private Queue<PlayerDetails> playing11;
    private List<PlayerDetails> bench;
    private PlayerBowlingController playerBowlingController;
    private PlayerBattingController playerBattingController;
    private boolean isWinner;
    private boolean isAllout;

    public Team(String teamName, Queue<PlayerDetails> playing11, List<PlayerDetails> bench, List<PlayerDetails> bowlers) {
        this.teamName = teamName;
        this.playing11 = playing11;
        this.bench = bench;
        this.playerBowlingController = new PlayerBowlingController(bowlers);
        this.playerBattingController = new PlayerBattingController(playing11);
    }

    public String getTeamName() {
        return teamName;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }

    public boolean isAllout() {
        return isAllout;
    }

    public void setAllout(boolean allout) {
        isAllout = allout;
    }

    public void chooseNextBatsMan() throws Exception {
        playerBattingController.getNextPlayer();
    }

    public PlayerDetails getStriker() {
        return playerBattingController.getStriker();
    }

    public PlayerDetails getNonStriker() {
        return playerBattingController.getNonStriker();
    }

    public void setStriker(PlayerDetails player) {
        playerBattingController.setStriker(player);
    }

    public void setNonStriker(PlayerDetails player) {
        playerBattingController.setNonStriker(player);
    }

    public void chooseNextBowler(int maxOverPerBowler) {
        playerBowlingController.getNextBowler(maxOverPerBowler);
    }

    public PlayerDetails getCurrentBowler() {
        return playerBowlingController.getCurrentBowler();
    }

    public void printBattingScorecard() {
        for (PlayerDetails playerDetails: playing11) {
            playerDetails.printBattingScoreCard();
        }
    }

    public void printBowlingScorecard() {
        for (PlayerDetails playerDetails: playing11) {
            if (playerDetails.getBowlingScoreCard().getTotalOvers() > 0) {
                playerDetails.printBowlingScoreCard();
            }
        }
    }

    public int getTotalRuns() {
        int totalRuns = 0;
        for (PlayerDetails playerDetails: playing11) {
            totalRuns += playerDetails.getBattingScoreCard().getTotalRuns();
        }
        return totalRuns;
    }
 }
