package gx.ThinkInJava.holding;

import java.util.LinkedList;
import java.util.Queue;

/*
 * holding.27
 * дһ��Command���࣬����һ��String���һ����ʾ��String��operation()������
 * д�ڶ����࣬������һ��ʹ��Command���������һ��Queue�������������ķ����������
 * ���Queue���ݸ����������һ���������÷������ĵ�Queue�еĶ��󣬲��������ǵ�operation()������
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
