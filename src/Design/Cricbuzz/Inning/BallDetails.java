package Design.Cricbuzz.Inning;

import Design.Cricbuzz.ScoreUpdater.BattingScoreUpdater;
import Design.Cricbuzz.ScoreUpdater.BowlingScoreUpdater;
import Design.Cricbuzz.ScoreUpdater.ScoreUpdaterObserver;
import Design.Cricbuzz.Team.Player.PlayerDetails;
import Design.Cricbuzz.Team.Team;
import Design.Cricbuzz.Team.Wicket;
import Design.Cricbuzz.Team.WicketType;

import java.util.ArrayList;
import java.util.List;

public class BallDetails {
    private int ballNo;
    private BallType ballType;
    private RunType runType;
    private PlayerDetails playedBy;
    private PlayerDetails bowledBy;
    private Wicket wicket;
    private List<ScoreUpdaterObserver> scoreUpdaterObserverList;

    public BallDetails(int ballNo) {
        this.ballNo = ballNo;
        scoreUpdaterObserverList = new ArrayList<>();
        scoreUpdaterObserverList.add(new BattingScoreUpdater());
        scoreUpdaterObserverList.add(new BowlingScoreUpdater());
    }

    public int getBallNo() {
        return ballNo;
    }

    public BallType getBallType() {
        return ballType;
    }

    public PlayerDetails getPlayedBy() {
        return playedBy;
    }

    public RunType getRunType() {
        return runType;
    }

    public PlayerDetails getBowledBy() {
        return bowledBy;
    }

    public Wicket getWicket() {
        return wicket;
    }



    public void startBallDelivery(Team battingTeam, Team ballingTeam, OverDetails overDetails) {
        playedBy = battingTeam.getStriker();
        bowledBy = overDetails.getBowledBy();

        //THROW BALL AND GET THE BALL TYPE, assuming here that ball type is always NORMAL
        ballType = BallType.NORMAL;

        //wicket or no wicket
        if (isWicketTaken()) {
            runType = RunType.ZERO;
            //considering only BOLD
            wicket = new Wicket(WicketType.BOLD, bowledBy, this, overDetails);
            //making only striker out for now
            battingTeam.setStriker(null);
        } else {
            RunType runType = getRunTypeRandom();
            this.runType = runType;
            if (runType == RunType.ONE || runType == RunType.THREE) {
                PlayerDetails playerDetails = battingTeam.getStriker();
                battingTeam.setStriker(battingTeam.getNonStriker());
                battingTeam.setNonStriker(playerDetails);
            }
        }
        //update player scoreboard
        notifyUpdaters(this);
    }

    private void notifyUpdaters(BallDetails ballDetails){
        for(ScoreUpdaterObserver observer : scoreUpdaterObserverList) {
            observer.update(ballDetails);
        }
    }


    private RunType getRunTypeRandom() {
        double val = Math.random();
        if (val <= 0.2) {
            return RunType.ONE;
        } else if (val >= 0.3 && val <= 0.5) {
            return RunType.TWO;
        } else if (val >= 0.6 && val <= 0.8) {
            return RunType.FOUR;
        } else {
            return RunType.SIX;
        }
    }


    private boolean isWicketTaken() {
        //random function return value between 0 and 1
        if (Math.random() < 0.2) {
            return true;
        } else {
            return false;
        }
    }

}

