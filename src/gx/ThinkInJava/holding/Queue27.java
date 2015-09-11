package gx.ThinkInJava.holding;

import java.util.LinkedList;
import java.util.Queue;

/*
 * holding.27
 * 写一个Command的类，包含一个String域和一个显示该String的operation()方法。
 * 写第二个类，它具有一个使用Command对象来填充一个Queue并返回这个对象的方法。将填充
 * 后的Queue传递给第三个类的一个方法，该方法消耗掉Queue中的对象，并调用它们的operation()方法。
 */
class Command{
	String s;
	Command(String s){
		this.s = s;
	}
	void operation(){
		System.out.println(s);
	}
}
class Build{
	Queue<Command> makeQ(){
		Queue<Command> q = new LinkedList<Command>();
		for(int i=0;i<10;i++){
			q.offer(new Command(i + " "));
		}
		return q;
	}
}
public class Queue27 {
	public static void commandEater(Queue<Command> qc){
		while(qc.peek() != null){
			qc.poll().operation();
		}
	}
	public static void main(String[] args) {
		Build b = new Build();
		commandEater(b.makeQ());
	}
}
