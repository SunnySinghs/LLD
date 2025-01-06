package Design.Cricbuzz.Team.Player.Score;

public class BowlingScoreCard {
    private int totalOvers;
    private int runsGiven;
    private int maidens;
    private int wideBallsGiven;
    private int noBallsGiven;
    private int wickerTaken;
    private double economyRate;

    public int getTotalOvers() {
        return totalOvers;
    }

    public void setTotalOvers(int totalOvers) {
        this.totalOvers = totalOvers;
    }

    public int getRunsGiven() {
        return runsGiven;
    }

    public void setRunsGiven(int runsGiven) {
        this.runsGiven = runsGiven;
    }

    public int getMaidens() {
        return maidens;
    }

    public void setMaidens(int maidens) {
        this.maidens = maidens;
    }

    public int getWideBallsGiven() {
        return wideBallsGiven;
    }

    public void setWideBallsGiven(int wideBallsGiven) {
        this.wideBallsGiven = wideBallsGiven;
    }

    public int getNoBallsGiven() {
        return noBallsGiven;
    }

    public void setNoBallsGiven(int noBallsGiven) {
        this.noBallsGiven = noBallsGiven;
    }

    public int getWickerTaken() {
        return wickerTaken;
    }

    public void setWickerTaken(int wickerTaken) {
        this.wickerTaken = wickerTaken;
    }

    public double getEconomyRate() {
        return economyRate;
    }

    public void setEconomyRate(double economyRate) {
        this.economyRate = economyRate;
    }
}
