package gx.ThinkInJava.Holding;

import java.util.LinkedList;

/*
 * holding.15
 */
class Stack<T>{
	private LinkedList<T> storage = new LinkedList<T>();
	public void push(T v){
		storage.add(v);
	}
	public T peek(){
		return storage.getFirst();
	}
	public T pop(){
		return storage.removeFirst();
	}
	public boolean empty(){
		return storage.isEmpty();
	}
	public String toString(){
		return storage.toString();
	}
}
public class Ex15 {
	public static void main(String[] args) {
		Stack<Character> sc = new Stack<Character>();
		sc.push('U');
		sc.push('n');
		sc.push('c');
		System.out.print(sc.pop());
		System.out.print(sc.pop());
		System.out.print(sc.pop());
		sc.push('e');
		sc.push('r');
		sc.push('t');
		System.out.print(sc.pop());
		System.out.print(sc.pop());
		System.out.print(sc.pop());
		sc.push('a');
		sc.push('i');
		sc.push('n');
		sc.push('t');
		System.out.print(sc.pop());
		System.out.print(sc.pop());
		System.out.print(sc.pop());
		sc.push(' ');
		System.out.print(sc.pop());
		sc.push('r');
		sc.push('u');
		System.out.print(sc.pop());
		System.out.print(sc.pop());
		sc.push('l');
		sc.push('e');
		sc.push('s');
		System.out.print(sc.pop());
		System.out.print(sc.pop());
		System.out.print(sc.pop());	
	}
}
