package Design.Cricbuzz.Inning;

import Design.Cricbuzz.Team.Player.PlayerDetails;
import Design.Cricbuzz.Team.Team;

import java.util.ArrayList;
import java.util.List;

public class OverDetails {
    private int overNo;
    private List<BallDetails> ballDetails;
    private int extraBalls;
    private PlayerDetails bowledBy;

    public OverDetails(int overNo, PlayerDetails bowledBy) {
        this.overNo = overNo;
        this.ballDetails = new ArrayList<>();
        this.bowledBy = bowledBy;
    }

    public int getOverNo() {
        return overNo;
    }

    public int getExtraBalls() {
        return extraBalls;
    }

    public PlayerDetails getBowledBy() {
        return bowledBy;
    }

    public boolean startOver(Team battingTeam, Team bowlingTeam, int runsToWin) {
        int ballCount = 1;
        while(ballCount <= 6) {
            BallDetails ball = new BallDetails(ballCount);
            ball.startBallDelivery(battingTeam, bowlingTeam, this);
            if (ball.getBallType() == BallType.NORMAL) {
                ballDetails.add(ball);
                ballCount++;
                if (ball.getWicket() != null) {
                    try {
                        battingTeam.chooseNextBatsMan();
                    } catch (Exception e) {
                        battingTeam.setAllout(true);
                        break;
                    }
                }

                if (runsToWin != -1 && battingTeam.getTotalRuns() >= runsToWin) {
                    battingTeam.setWinner(true);
                    return true;
                }
            } else {
                extraBalls++;
            }
        }
        return false;
    }
}
