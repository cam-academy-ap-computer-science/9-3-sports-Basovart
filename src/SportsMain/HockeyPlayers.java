package SportsMain;
public class HockeyPlayers extends Players{
	protected int number;
	protected String position;
	protected int goalsScored;
	
	public HockeyPlayers(String name, int age, String nationality, int n, String p, int g) {
		super(name, age, nationality);
		number = n;
		position = p;
		goalsScored = g;
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
	public String hockeyPlayersToString() {
		return toString() + ", " + number + ", " + position  + ", goals scored:" + goalsScored;
	}
	public boolean equals(Object o) {
		if (o instanceof HockeyPlayers) {
			HockeyPlayers other = (HockeyPlayers) o;
			return other.getName() == getName() && (other.getAge() == getAge()) 
					&& (other.getNationality() == getNationality())
					&& (other.getNumber() == getNumber())
					&& (other.getPosition() == getPosition())
					&& (other.getGoalsScored() == getGoalsScored());
		} else {
			return false;
		}
	}
}