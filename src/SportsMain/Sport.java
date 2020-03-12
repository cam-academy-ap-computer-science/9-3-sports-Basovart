package SportsMain;
import java.util.Scanner;
public class Sport {
	private Object SoccerPlayers;
	private Object HockeyPlayers;
	private Object Boxers;
	public Sport(Object s, Object h, Object b) {
		SoccerPlayers = s;
		HockeyPlayers = h;
		Boxers = b;
	}
	public void makeArray() {
		Object[] Players = new Object[5];
		for (int i = 0; i < 5; i++) {
			Players[i] = new Players(null, i, null);
		}
	}
	
	
	
	//Scanner userInput = new Scanner(System.in);
	//int numOfPlayers = userInput.nextInt();
	//int[] Players = new int[numOfPlayers]; {
	
	//}
	
}



