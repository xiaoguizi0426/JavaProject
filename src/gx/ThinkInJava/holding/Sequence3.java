package gx.ThinkInJava.holding;

import java.util.ArrayList;

/*
 * holding.03
 */
interface Selector {
	boolean end();
	Object current();
	void next();
}

public class Sequence3 {
	private ArrayList<Object> items = new ArrayList<Object>();
	public void add(Object x) {
		items.add(x);
	}
	private class Sequence3Selector implements Selector {
		private int i = 0;
		public boolean end() {
			return i == items.size();			
		}
		public Object current() {
			return items.get(i);
		}
		public void next() {
			i++;
		}	
	}
	public Selector selector() {
		return new Sequence3Selector();
	}
	public static void main(String[] args) {
		Sequence3 s3 = new Sequence3();
		for(int i = 0; i < 10; i++)
			s3.add(i);
		Selector selector = s3.selector();
		while(!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
		s3.add(10);
		s3.add(11);
		s3.add(12);
		s3.add(13);
		s3.add(13);
		s3.add("good bye");
		while(!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}
}
