package gx.ThinkInJava.holding;

import java.util.LinkedList;
import java.util.ListIterator;

/*
 * holding.14
 * ����һ���յ�LinkedList<Integer>,ͨ��ʹ��ListIterator�������ɸ�Integer�������List�У�
 * ����ʱ�����ǽ����ǲ��뵽List�м䡣
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
