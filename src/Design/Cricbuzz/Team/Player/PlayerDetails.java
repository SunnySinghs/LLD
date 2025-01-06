package Design.Cricbuzz.Team.Player;

import Design.Cricbuzz.Team.Player.Score.BattingScoreCard;
import Design.Cricbuzz.Team.Player.Score.BowlingScoreCard;

public class PlayerDetails {
    private Person person;
    private PlayerType playerType;
    private BattingScoreCard battingScoreCard;
    private BowlingScoreCard bowlingScoreCard;

    public PlayerDetails(Person person, PlayerType playerType) {
        this.person = person;
        this.playerType = playerType;
        battingScoreCard = new BattingScoreCard();
        bowlingScoreCard = new BowlingScoreCard();
    }


    public void printBattingScoreCard(){

        System.out.println("PlayerName: " + person.getName() + " -- totalRuns: " + battingScoreCard.getTotalRuns()
                + " -- totalBallsPlayed: " + battingScoreCard.getTotalBallPlayed() + " -- 4s: " +
                battingScoreCard.getTotalFours() + " -- 6s: " + battingScoreCard.getTotalSixes() +
                " -- outby: " + ((battingScoreCard.getWicketDetails() != null) ?
                battingScoreCard.getWicketDetails().getTakenBy().getPerson().getName() : "notout"));
    }

    public void printBowlingScoreCard(){
        System.out.println("PlayerName: " + person.getName() + " -- totalOversThrown: " + bowlingScoreCard.getTotalOvers()
                + " -- totalRunsGiven: " + bowlingScoreCard.getRunsGiven() + " -- WicketsTaken: " + bowlingScoreCard.getWickerTaken());
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public BattingScoreCard getBattingScoreCard() {
        return battingScoreCard;
    }

    public BowlingScoreCard getBowlingScoreCard() {
        return bowlingScoreCard;
    }
}
