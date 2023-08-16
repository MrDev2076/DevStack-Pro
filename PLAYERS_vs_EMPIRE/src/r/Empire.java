package r;

//Empire class
public class Empire {
	//Main Method
	    public static void main(String[] args) {
	    	//initializing team1&2 Scores in array
	        int[] team1Runs = {50, 30, 70, 45};
	        int[] team2Runs = {60, 40, 55, 65};

	        //creating objects to team_1 and team_2 classes and passing team1 and team2 RunsArray
	        Team_1 team1 = new Team_1(team1Runs);
	        Team_2 team2 = new Team_2(team2Runs);

	        //displaying team1 and team2 team_player scores
	        System.out.println("\n Team 1 Scores:");
	        displayTeamScores(team1);

	        System.out.println("\n Team 2 Scores:");
	        displayTeamScores(team2);
	        
	    }

	    //creating display_TeamScores methods to team1 and team2
	    public static void displayTeamScores(Team_1 team) {
	    	
	    	//players class object to get players method
	        Player[] players = team.getPlayers();
	        for (int i = 0; i < 4; i++) {
	            System.out.println("Player " + (i + 1) + ": " + players[i].getRuns() + " runs");
	        }
	    }

	    public static void displayTeamScores(Team_2 team) {
	        Player[] players = team.getPlayers();
	        for (int i = 0; i < 4; i++) {
	            System.out.println("Player " + (i + 1) + ": " + players[i].getRuns() + " runs");
	            
	        }
	    }
	

}

