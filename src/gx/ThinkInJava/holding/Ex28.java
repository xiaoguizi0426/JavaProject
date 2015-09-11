package gx.ThinkInJava.holding;

import java.util.PriorityQueue;
import java.util.Random;

/*
 * holding.28
 */
public class Ex28 {
	public static void main(String[] args) {
		Random rand = new Random();
		PriorityQueue<Double> d = new PriorityQueue<Double>();
		for(int i=0;i<10;i++){
			d.offer(rand.nextDouble() * i);
		}
		while(d.peek() != null){
			System.out.println(d.poll() + " ");
		}
	}
}
