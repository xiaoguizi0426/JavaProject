package gx.ThinkInJava.holding;

import java.util.ArrayList;
import java.util.List;

/*
 * holding.07
 * 创建一个类，然后创建一个用你的类的对象进行初始化的数组。
 * 通过使用sublist()方法，创建你的List子集，然后在你的List中移除这个子集。
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
