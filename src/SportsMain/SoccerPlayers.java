package SportsMain;
public class SoccerPlayers extends Players {
	protected int number;
	protected String position;
	protected int goalsScored;
	protected int gamesPlayed;
	
	public SoccerPlayers(String name, int age, String nationality, int num, String pos, int g, int gp) {
		super(name, age, nationality);
		number = num;
		position = pos;
		goalsScored = g;
		gamesPlayed = gp;
	}
	
	public int getNumber() {
		return number;
	}
	public String getPosition() {
		return position;
	}
	public int getGoalsScored() {
		return goalsScored;
	}
	public int getGamesPlayed() {
		return gamesPlayed;
	}
	public String soccerPlayerToString() {
		return toString() + ", " + number + ", " + position  + ", goals scored:" + goalsScored + ", games played:" + gamesPlayed;
	} 
	public boolean equals(Object o) {
		if (o instanceof SoccerPlayers) {
			SoccerPlayers other = (SoccerPlayers) o;
			return other.getName() == getName() && (other.getAge() == getAge()) 
					&& (other.getNationality() == getNationality()) 
					&& (other.getNumber() == getNumber()) 
					&& (other.getNumber() == getNumber()) 
					&& (other.getPosition() == getPosition()) 
					&& (other.getGoalsScored() == getGoalsScored()) 
					&& (other.getGamesPlayed() == getGamesPlayed());					
		} else {
			return false;
		}
	}

}

