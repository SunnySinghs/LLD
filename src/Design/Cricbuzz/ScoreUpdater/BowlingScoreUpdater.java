package Design.Cricbuzz.ScoreUpdater;

import Design.Cricbuzz.Inning.BallDetails;
import Design.Cricbuzz.Inning.BallType;
import Design.Cricbuzz.Inning.RunType;
import Design.Cricbuzz.Team.Player.Score.BowlingScoreCard;

public class BowlingScoreUpdater implements ScoreUpdaterObserver{
    @Override
    public void update(BallDetails ballDetails) {
        BowlingScoreCard bowlingScoreCard = ballDetails.getBowledBy().getBowlingScoreCard();
        if (ballDetails.getBallNo() == 6 && ballDetails.getBallType() == BallType.NORMAL) {
            bowlingScoreCard.setTotalOvers(bowlingScoreCard.getTotalOvers()+1);
        }
        int run = 0;
        switch (ballDetails.getRunType()) {
            case ZERO -> run = 0;
            case ONE -> run = 1;
            case TWO -> run = 2;
            case THREE -> run = 3;
            case FOUR -> run = 4;
            case SIX -> run = 6;
        }
        bowlingScoreCard.setRunsGiven(bowlingScoreCard.getRunsGiven()+run);
        /*if (RunType.ONE == ballDetails.getRunType()) {
            bowlingScoreCard.setRunsGiven(bowlingScoreCard.getRunsGiven()+1);
        } else if (RunType.TWO == ballDetails.getRunType()) {
            bowlingScoreCard.setRunsGiven(bowlingScoreCard.getRunsGiven()+2);
        } else if (RunType.THREE == ballDetails.getRunType()) {
            bowlingScoreCard.setRunsGiven(bowlingScoreCard.getRunsGiven()+3);
        } else if (RunType.FOUR == ballDetails.getRunType()) {
            bowlingScoreCard.setRunsGiven(bowlingScoreCard.getRunsGiven()+4);
        } else if (RunType.SIX == ballDetails.getRunType()) {
            bowlingScoreCard.setRunsGiven(bowlingScoreCard.getRunsGiven()+6);
        }*/

        if (ballDetails.getWicket() != null) {
           bowlingScoreCard.setWickerTaken(bowlingScoreCard.getWickerTaken()+1);
        }

        if (ballDetails.getBallType() == BallType.NOBALL) {
            bowlingScoreCard.setNoBallsGiven(bowlingScoreCard.getNoBallsGiven()+1);
        }

        if (ballDetails.getBallType() == BallType.WIDEBALL) {
            bowlingScoreCard.setWideBallsGiven(bowlingScoreCard.getWideBallsGiven()+1);
        }

    }
}
