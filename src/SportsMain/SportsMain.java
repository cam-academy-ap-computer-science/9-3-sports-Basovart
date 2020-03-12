//The client 'main' tester routine - load your sports database, and produce desired output.
package SportsMain;

public class SportsMain {
	
	public static void main(String[] args) {
		
		SoccerPlayers p1 = new SoccerPlayers("Messi", 32, "Argentina", 10, "forward", 425, 625);
		
		System.out.println(p1.soccerPlayerToString());
		
	}

}
