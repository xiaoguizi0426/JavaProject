package gx.ThinkInJava.Containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
 * Containers.01
 * 创建一个List(分别用ArrayList和LinkedList)，然后用Countries来填充。
 * 对该列表排序并打印，然后将Collections.shuffle()方法重复地应用于该列表，
 * 并且每次都打印它，这样可以看到shuffle()是如何每次都将列表随机打乱了。
 */
public class Ex1 {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		List<String> ll = new LinkedList<String>();
		for(int i=0;i<Countries.DATA.length;i++){
			al.add(Countries.DATA[i][0]);
			ll.add(Countries.DATA[i][1]);
		}
		Collections.sort(al);
		Collections.sort(ll);
		System.out.println("Countries: " + al);
		System.out.println("Capitals: " +ll);
		for(int i=0;i<2;i++){
			Collections.shuffle(al);
			Collections.shuffle(ll);
			System.out.println("Countries " + i + ": " + al);
			System.out.println("Capitals " + i + ": " + ll);
		}
	}
}
