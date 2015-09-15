package gx.ThinkInJava.Holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

/*
 * holding.11
 * 使用Iterator遍历Collection，并打印容器中每个对象的toString()。
 * 填充各种Collection，然后对其使用此方法。
 */
public class Ex11 {
	public static void printAny(Collection c){
		Iterator it = c.iterator();
		while(it.hasNext()){
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayList<Integer> al = 
				new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		LinkedList<Character> ll =
			new LinkedList<Character>(Arrays.asList('a', 'b', 'c'));	
		HashSet<Float> hs = 
			new HashSet<Float>(Arrays.asList(1.1f, 2.2f, 3.3f));
		TreeSet<Double> ts =
			new TreeSet<Double>(Arrays.asList(1.11, 2.22, 3.33));
		LinkedHashSet<Integer> lhs =
			new LinkedHashSet<Integer>(Arrays.asList(11, 22, 33));
		printAny(al);
		printAny(ll);
		printAny(hs);
		printAny(ts);
		printAny(lhs);
	}
}
