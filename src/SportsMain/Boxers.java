package SportsMain;
public class Boxers extends Players {
	protected int Wins;
	protected int Losses;
	protected int Matches;
	protected int KOs;
	
	public Boxers(String name, int age, String nationality, int w, int l, int m, int k) {
		super(name, age, nationality);
		Wins = w;
		Losses = l;
		Matches = m;
		KOs = k;
		
	}
	public int getWins() {
		return Wins;
	}
	public int getLosses() {
		return Losses;
	}
	public int getMatches() {
		return Matches;
	}
	public int getKOs() {
		return KOs;
	}
	public String boxersToString() {
		return toString() + ", Wins:" + Wins + ", Losses:" + Losses  + ", Matches:" + Matches + "KOs:" + KOs;
	} 
	public boolean equals(Object o) {
		if (o instanceof Boxers) {
			Boxers other = (Boxers) o;
			return other.getName() == getName() && (other.getAge() == getAge()) 
					&& (other.getNationality() == getNationality())
					&& (other.getWins() == getWins())
					&& (other.getLosses() == getLosses())
					&& (other.getMatches() == getMatches())
					&& (other.getKOs() == getKOs());
		} else {
			return false;
		}
	}
	
	
}
