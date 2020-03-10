package SportsMain;
public class Players {
	protected static String name;
	protected static int age;
	protected static String nationality;

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
