package gx.ThinkInJava.Containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
 * Containers.01
 * ����һ��List(�ֱ���ArrayList��LinkedList)��Ȼ����Countries����䡣
 * �Ը��б����򲢴�ӡ��Ȼ��Collections.shuffle()�����ظ���Ӧ���ڸ��б�
 * ����ÿ�ζ���ӡ�����������Կ���shuffle()�����ÿ�ζ����б���������ˡ�
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
