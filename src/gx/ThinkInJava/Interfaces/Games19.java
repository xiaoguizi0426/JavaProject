package gx.ThinkInJava.Interfaces;

import java.util.Random;

/*
 * Interfaces.19
 * 使用工厂方法来创建一个框架，它可以执行抛硬币和掷筛子功能
 */
interface Games{
	void play();
}
interface GamesFactory{
	Games getGames();
}
class CoinToss implements Games{
	Random rand = new Random();
	public void play(){
		System.out.println("Toss Coin");
		switch (rand.nextInt(2)) {
		case 0:
			System.out.println("Heads");
			return;
		case 1:
			System.out.println("Tails");
			return;
		default:
			System.out.println("OnEdge");
			return;
		}
	}
}
class CoinTossFactory implements GamesFactory{
	public Games getGames(){
		return new CoinToss();
	}
}
class DiceThrow implements Games{
	Random rand = new Random();
	public void play(){
		System.out.println("Throw Dice: " + (rand.nextInt(6) + 1));
	}
}
class DiceThrowFactory implements GamesFactory{
	public Games getGames(){
		return new DiceThrow();
	}
}
public class Games19 {
	public static void playGame(GamesFactory factory){
		Games g = factory.getGames();
		g.play();
	}
	public static void main(String[] args) {
		playGame(new CoinTossFactory());
		playGame(new DiceThrowFactory());
	}
}
