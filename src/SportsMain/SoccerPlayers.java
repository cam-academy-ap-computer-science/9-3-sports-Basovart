package SportsMain;
public class SoccerPlayers extends Players {
	int number;
	String position;
	
	public SoccerPlayers(String name, int age, String nationality, int num, String pos) {
		super(name, age, nationality);
		number = num;
		position = pos;
	}
	
	public String getName() {
		return super.name;
	}
	public int getAge() {
		return super.age;
	}
	public String getNationality() {
		return super.nationality;
	}
	public int getNumber() {
		return number;
	}
	public String getPosition() {
		return position;
	}
	public String soccerPlayerToString() {
		
	}
	
}

