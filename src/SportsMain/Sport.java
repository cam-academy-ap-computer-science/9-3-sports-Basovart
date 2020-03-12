package SportsMain;
import java.util.ArrayList;
import java.util.Scanner;
public class Sport {
	Scanner userInput = new Scanner(System.in);
	int numOfPlayers = userInput.nextInt();
	int[] Players = new int[numOfPlayers]; {
	for (int i = 0; i <= numOfPlayers; i++) {
		int newPlayer = userInput.nextInt();
		Players[i] = newPlayer;
	}
}
}


