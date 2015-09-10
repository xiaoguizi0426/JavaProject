package gx.ThinkInJava.holding;

import java.util.HashSet;
import java.util.Set;

/*
 * holding.02
 */
public class Ex2 {
	public static void main(String[] args) {
		Set<Integer> c = new HashSet<Integer>();
		for(int i = 0; i < 10; i++)
			c.add(i); // Autoboxing
		for(Integer i : c)
			System.out.print(i + ", ");
	}	
}
