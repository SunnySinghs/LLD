package Design.Cricbuzz.Team;

import Design.Cricbuzz.Inning.BallDetails;
import Design.Cricbuzz.Inning.OverDetails;
import Design.Cricbuzz.Team.Player.PlayerDetails;

public class Wicket {
    private WicketType wicketType;
    private PlayerDetails takenBy;
    private BallDetails ballDetails;
    private OverDetails overDetails;

    public Wicket(WicketType wicketType, PlayerDetails takenBy, BallDetails ballDetails, OverDetails overDetails) {
        this.wicketType = wicketType;
        this.takenBy = takenBy;
        this.ballDetails = ballDetails;
        this.overDetails = overDetails;
    }

    public WicketType getWicketType() {
        return wicketType;
    }

    public void setWicketType(WicketType wicketType) {
        this.wicketType = wicketType;
    }

    public PlayerDetails getTakenBy() {
        return takenBy;
    }

    public void setTakenBy(PlayerDetails takenBy) {
        this.takenBy = takenBy;
    }

    public BallDetails getBallDetails() {
        return ballDetails;
    }

    public void setBallDetails(BallDetails ballDetails) {
        this.ballDetails = ballDetails;
    }

    public OverDetails getOverDetails() {
        return overDetails;
    }

    public void setOverDetails(OverDetails overDetails) {
        this.overDetails = overDetails;
    }
}
