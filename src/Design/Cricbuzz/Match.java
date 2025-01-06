package Design.Cricbuzz;

import Design.Cricbuzz.Inning.InningDetails;
import Design.Cricbuzz.Team.Team;

import java.util.Date;

public class Match {
    private Team teamA;
    private Team teamB;
    private MatchType matchType;
    private InningDetails[] innings;
    private Date matchDate;
    private String venue;
    private Team tossWinningTeam;

    public Match(Team teamA, Team teamB, MatchType matchType, Date matchDate, String venue) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.matchType = matchType;
        this.innings = new InningDetails[2];;
        this.matchDate = matchDate;
        this.venue = venue;
    }

    public void startMatch() throws Exception {
        //1. Toss
        tossWinningTeam = toss(teamA, teamB);

        InningDetails inningDetails;
        Team battingTeam;
        Team bowlingTeam;
        //start The Inning, there are 2 innings in a match
        for(int inning=1; inning<=2; inning++) {
            boolean isChasing = false;
            if (inning == 1) {
                battingTeam = tossWinningTeam;
                bowlingTeam = tossWinningTeam.getTeamName().equals(teamA.getTeamName()) ? teamB : teamA;
                inningDetails = new InningDetails(battingTeam, bowlingTeam, matchType);
                inningDetails.start(-1);
            } else {
                bowlingTeam = tossWinningTeam;
                battingTeam = tossWinningTeam.getTeamName().equals(teamA.getTeamName()) ? teamB : teamA;
                inningDetails = new InningDetails(battingTeam, bowlingTeam, matchType);
                inningDetails.start(innings[0].getTotalRuns());
                if(bowlingTeam.getTotalRuns() > battingTeam.getTotalRuns()) {
                    bowlingTeam.setWinner(true);
                }
            }
            innings[inning-1] = inningDetails;

            //print inning details
            System.out.println();
            System.out.println("INNING " + inning + " -- total Run: " + battingTeam.getTotalRuns());
            System.out.println("---Batting ScoreCard : " + battingTeam.getTeamName() + "---");

            battingTeam.printBattingScorecard();

            System.out.println();
            System.out.println("---Bowling ScoreCard : " + bowlingTeam.getTeamName() + "---");
            bowlingTeam.printBowlingScorecard();


        }
        System.out.println();
        if(teamA.isWinner()){
            System.out.println("---WINNER---" + teamA.getTeamName());
        }else {
            System.out.println("---WINNER---" + teamB.getTeamName());
        }

    }

    private Team toss(Team teamA, Team teamB){
        //random function return value between 0 and 1
        if(Math.random() < 0.5) {
            return teamA;
        } else {
            return teamB;
        }
    }

}
