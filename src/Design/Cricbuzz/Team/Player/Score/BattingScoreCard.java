package Design.Cricbuzz.Team.Player.Score;

import Design.Cricbuzz.Team.Wicket;

public class BattingScoreCard {
    private int TotalRuns;
    private int totalBallPlayed;
    private int totalSixes;
    private int totalFours;
    private double strikeRate;
    private Wicket wicketDetails;

    public int getTotalRuns() {
        return TotalRuns;
    }

    public void setTotalRuns(int totalRuns) {
        TotalRuns = totalRuns;
    }

    public int getTotalBallPlayed() {
        return totalBallPlayed;
    }

    public void setTotalBallPlayed(int totalBallPlayed) {
        this.totalBallPlayed = totalBallPlayed;
    }

    public int getTotalSixes() {
        return totalSixes;
    }

    public void setTotalSixes(int totalSixes) {
        this.totalSixes = totalSixes;
    }

    public int getTotalFours() {
        return totalFours;
    }

    public void setTotalFours(int totalFours) {
        this.totalFours = totalFours;
    }

    public double getStrikeRate() {
        return strikeRate;
    }

    public void setStrikeRate(double strikeRate) {
        this.strikeRate = strikeRate;
    }

    public Wicket getWicketDetails() {
        return wicketDetails;
    }

    public void setWicketDetails(Wicket wicketDetails) {
        this.wicketDetails = wicketDetails;
    }
}
