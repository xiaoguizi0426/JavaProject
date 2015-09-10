package gx.ThinkInJava.holding;

import java.util.ArrayList;
import java.util.List;

/*
 * holding.07
 * ����һ���࣬Ȼ�󴴽�һ���������Ķ�����г�ʼ�������顣
 * ͨ��ʹ��sublist()�������������List�Ӽ���Ȼ�������List���Ƴ�����Ӽ���
 */
class Tester{
	public static int counter = 0;
	private int id = counter++;
	public String toString(){
		return String.valueOf(id);
	}
}
public class Ex7 {
	public static void main(String[] args) {
		Tester[] t = new Tester[10];
		for(int i=0;i<t.length;i++){
			t[i] = new Tester();
		}
		List<Tester> lt = new ArrayList<Tester>();
		for(Tester x : t){
			lt.add(x);
		}
		System.out.print("list of Tester: " + lt);
		System.out.println();
		List<Tester> sub = lt.subList(2, 6);
		System.out.print("sublist: " + sub);
		System.out.println();
		List<Tester> copy = new ArrayList<Tester>(lt);
		copy.removeAll(sub);
		System.out.print("copy: " + copy);
		System.out.println();
		lt = copy;
		System.out.print("list of Tester: " + lt);
	}
}
