package Design.Cricbuzz.ScoreUpdater;

import Design.Cricbuzz.Inning.BallDetails;
import Design.Cricbuzz.Team.Player.Score.BattingScoreCard;
import Design.Cricbuzz.Team.Player.Score.BowlingScoreCard;

public class BattingScoreUpdater implements ScoreUpdaterObserver{
    @Override
    public void update(BallDetails ballDetails) {
        BattingScoreCard battingScoreCard = ballDetails.getPlayedBy().getBattingScoreCard();
        int run = 0;
        switch (ballDetails.getRunType()) {
            case ZERO -> run = 0;
            case ONE -> run = 1;
            case TWO -> run = 2;
            case THREE -> run = 3;
            case FOUR -> {
                battingScoreCard.setTotalFours(battingScoreCard.getTotalFours()+1);
                run = 4;
            }
            case SIX -> {
                battingScoreCard.setTotalSixes(battingScoreCard.getTotalSixes()+1);
                run = 6;
            }
        }
        battingScoreCard.setTotalRuns(battingScoreCard.getTotalRuns()+run);
        battingScoreCard.setTotalBallPlayed(battingScoreCard.getTotalBallPlayed()+1);

        if (ballDetails.getWicket() != null) {
            battingScoreCard.setWicketDetails(ballDetails.getWicket());
        }
    }
}
