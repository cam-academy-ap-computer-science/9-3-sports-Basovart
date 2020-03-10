
public class Players {
	protected static String name;
	protected static int age;
	protected static String nationality;

	public Players(String na, int a, String n) {
		name = na;
		age = a;
		nationality = n;
	}
	public static String getName() {
		return name;
	}
	public static int getAge() {
		return age;
	}
	public static String getNationality() {
		return nationality;
	}

	
	
	
}
