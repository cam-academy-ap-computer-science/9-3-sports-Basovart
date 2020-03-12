package SportsMain;
public class Players {
	protected String name;
	protected int age;
	protected String nationality;

	public Players(String na, int a, String n) {
		name = na;
		age = a;
		nationality = n;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getNationality() {
		return nationality;
	}
	public String toString() {
		return name + ", " + age + ", " + nationality;
	}
	
	
	
}
