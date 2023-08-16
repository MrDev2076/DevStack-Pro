package r;

//player class
public class Player {
	// private instance variable runs
	    private int runs;
//players method
	    public Player(int runs) {
	        this.runs = runs;
	    }
//getRuns method that return each player's score
	    public int getRuns()      {
	        return runs;
	    }
	}

//Team1 class
	class Team_1 {
		//instance player array to declare number of players in Team1
	    private Player[] players;

	    //runs array input assigned to specific player in team1
	    public Team_1(int[] runs) {
	        players = new Player[4];
	        for (int i = 0; i < 4; i++) {
	            players[i] = new Player(runs[i]);
	        }
	    }
//getRuns method that return each player's score
	    public Player[] getPlayers() {
	        return players;
	    }
	}

//Team2 class
	class Team_2 {
		//instance player array to declare number of players in Team2
	    private Player[] players;

	  //runs array input assigned to specific player in team2
	    public Team_2(int[] runs) {
	        players = new Player[4];
	        for (int i = 0; i < 4; i++) {
	            players[i] = new Player(runs[i]);
	        }
	    }
	  //getting players method
	    public Player[] getPlayers() {
	        return players;
	    }
	}

	

