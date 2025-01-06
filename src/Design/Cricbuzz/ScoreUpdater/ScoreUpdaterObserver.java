package Design.Cricbuzz.ScoreUpdater;

import Design.Cricbuzz.Inning.BallDetails;

public interface ScoreUpdaterObserver {
    public void update(BallDetails ballDetails);
}
