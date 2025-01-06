package Design.Cricbuzz.Inning;

import Design.Cricbuzz.MatchType;
import Design.Cricbuzz.Team.Player.PlayerDetails;
import Design.Cricbuzz.Team.Team;

import java.util.ArrayList;
import java.util.List;

public class InningDetails {
    private Team battingTeam;
    private Team bowlingTeam;
    private List<OverDetails> overDetailsList;
    private MatchType matchType;

    public InningDetails(Team battingTeam, Team bowlingTeam, MatchType matchType) {
        this.battingTeam = battingTeam;
        this.bowlingTeam = bowlingTeam;
        this.matchType = matchType;
        overDetailsList = new ArrayList<>();
    }

    public void start(int runsToWin) throws Exception {
        try {
            battingTeam.chooseNextBatsMan();
        } catch (Exception e) {
            System.out.println("All out");
        }
        int noOfOvers = matchType.noOfOvers();

        for(int overNo=1; overNo<noOfOvers; overNo++) {
            bowlingTeam.chooseNextBowler(matchType.maxOverCountPerBowler());
            OverDetails overDetails = new OverDetails(overNo, bowlingTeam.getCurrentBowler());
            overDetailsList.add(overDetails);

            boolean won = overDetails.startOver(battingTeam, bowlingTeam, runsToWin);
            if (won) {
                break;
            }

            if (battingTeam.isAllout()) {
                break;
            }

            PlayerDetails temp = battingTeam.getStriker();
            battingTeam.setStriker(battingTeam.getNonStriker());
            battingTeam.setNonStriker(temp);

        }
    }

    public int getTotalRuns(){
        return battingTeam.getTotalRuns();
    }

}
