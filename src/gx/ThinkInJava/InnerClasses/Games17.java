package gx.ThinkInJava.InnerClasses;

import java.util.Random;

/*
 * Interfaces.17
 */
interface Games {
	void play();
}

interface GamesFactory {
	Games getGames();
}

class CoinToss implements Games {
	Random rand = new Random();
	public void play() { 
		System.out.print("Toss Coin: ");
		switch(rand.nextInt(2)) {
			case 0 : System.out.println("Heads"); return;
			case 1 : System.out.println("Tails"); return;
			default: System.out.println("OnEdge"); return;
		} 
	}
	public static GamesFactory factory =
		new GamesFactory() {
			public Games getGames() { return new CoinToss(); }	
		};
}

class DiceThrow implements Games {
	Random rand = new Random();
	public void play() { 
		System.out.print("Throw Dice: " + (rand.nextInt(6) + 1));		
	}
	public static GamesFactory factory =
		new GamesFactory() {
			public Games getGames() { return new DiceThrow(); }
		};
}

public class Games17 {
	public static void playGame(GamesFactory factory) {
		Games g = factory.getGames();
		g.play();
	}
	public static void main(String [] args) {
		playGame(CoinToss.factory);
		playGame(DiceThrow.factory);			
	}
}
