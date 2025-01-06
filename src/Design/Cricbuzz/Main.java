package Design.Cricbuzz;

import Design.Cricbuzz.Team.Player.Person;
import Design.Cricbuzz.Team.Player.PlayerDetails;
import Design.Cricbuzz.Team.Player.PlayerType;
import Design.Cricbuzz.Team.Team;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();

        Team teamA = main.addTeam("India");
        Team teamB = main.addTeam("SriLanka");

        MatchType matchType = new T20MatchType();
        Match match = new Match(teamA,teamB, matchType, new Date(), "Wankhede Stadium");

        match.startMatch();

    }

    private Team addTeam(String name) {

        Queue<PlayerDetails> playerDetails = new LinkedList<>();

        PlayerDetails p1 = addPlayer(name+"1", PlayerType.BATSMAN);
        PlayerDetails p2 = addPlayer(name+"2", PlayerType.BATSMAN);
        PlayerDetails p3 = addPlayer(name+"3", PlayerType.BATSMAN);
        PlayerDetails p4 = addPlayer(name+"4", PlayerType.BATSMAN);
        PlayerDetails p5 = addPlayer(name+"5", PlayerType.BATSMAN);
        PlayerDetails p6 = addPlayer(name+"6", PlayerType.ALLROUNDER);
        PlayerDetails p7 = addPlayer(name+"7", PlayerType.ALLROUNDER);
        PlayerDetails p8 = addPlayer(name+"8", PlayerType.BOWLER);
        PlayerDetails p9 = addPlayer(name+"9", PlayerType.BOWLER);
        PlayerDetails p10 = addPlayer(name+"10", PlayerType.BOWLER);
        PlayerDetails p11 = addPlayer(name+"11", PlayerType.BOWLER);

        playerDetails.add(p1);
        playerDetails.add(p2);
        playerDetails.add(p3);
        playerDetails.add(p4);
        playerDetails.add(p5);
        playerDetails.add(p6);
        playerDetails.add(p7);
        playerDetails.add(p8);
        playerDetails.add(p9);
        playerDetails.add(p10);
        playerDetails.add(p11);

        List<PlayerDetails> bowlers = new ArrayList<>();
        bowlers.add(p6);
        bowlers.add(p7);
        bowlers.add(p8);
        bowlers.add(p9);
        bowlers.add(p10);
        bowlers.add(p11);

        Team team = new Team(name, playerDetails, new ArrayList<>(), bowlers);
        return team;

    }

    private PlayerDetails addPlayer(String name, PlayerType playerType) {

        Person person = new Person(name);
        PlayerDetails playerDetails = new PlayerDetails(person, playerType);
        return playerDetails;
    }

}
