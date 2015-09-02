package gx.ThinkInJava.Reusing;
/*
 * REUSING.18
 * ����һ������static final���final����࣬˵�����߼������ 
 * answer:��static final����ı�����ֵ�ǲ�����Ϊͨ�������ڶ�������
 * �����Ըı�ģ�������Ϊstatic�ı�������װ��ʱ�ѱ���ʼ����������ÿ��
 * �����¶���ʱ����ʼ������final����ı�������ͨ����������������ı䡣
 */
import java.util.Random;

class Test{
	Test(String s){
		System.out.println("Test() " + s);
	}
}

public class Difference {
	private String name;
	public Difference(String s){
		name = s;
	}
	static final Test sft = new Test("static final");
	private final Test ft = new Test("final");
	static final String SFS = "static final";
	private final String fs = "final";
	private static Random rand = new Random();
	static final int SFI = rand.nextInt();
	private final int fi = rand.nextInt();
	public String toString(){
		return (name + ": " + sft + ", " + ft + ", " + SFS + ", " + fs + ", " + SFI + ", " + fi);
	}
	
	
	public static void main(String[] args) {
		Difference d1 = new Difference("d1");
		Difference d2 = new Difference("d2");
		Difference d3 = new Difference("d3");
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}

}
