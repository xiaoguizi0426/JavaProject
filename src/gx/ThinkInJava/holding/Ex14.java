package gx.ThinkInJava.holding;

import java.util.LinkedList;
import java.util.ListIterator;

/*
 * holding.14
 * 创建一个空的LinkedList<Integer>,通过使用ListIterator，将若干个Integer插入这个List中，
 * 插入时，总是将它们插入到List中间。
 */
public class Ex14 {
	static void addMiddle(LinkedList<Integer> l,Integer[] ia){
		for(Integer i : ia){
			ListIterator<Integer> it =l.listIterator((l.size())/2);
			it.add(i);
			System.out.println(l);
		}
	}
	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();
		Integer[] x = {0,1,2,3,4,5,6,7};
		Ex14.addMiddle(li, x);
	}
}
