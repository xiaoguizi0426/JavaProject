package gx.ThinkInJava.InnerClasses;
/*
 * InnerClasses.26
 * ����һ�������ڲ�����࣬���ڲ�����һ����Ĭ�ϵĹ���������Ҫ�����Ĺ���������
 * ������һ��Ҳ�����ڲ�����࣬���ڲ���̳��Ե�һ���ڲ��ࡣ
 */
class FirstOuter{
	public class FirstInner{
		FirstInner(String s){
			System.out.println("FirstOuter.FirstInner() " + s);
		}
	}
}
public class SecondOuter {
	public class SecondInner extends FirstOuter.FirstInner{
		SecondInner(FirstOuter x){
			x.super("hello");
			System.out.println("SecondOuter.SecondInner()");
		}
	}
	public static void main(String[] args) {
		FirstOuter fo = new FirstOuter();
		SecondOuter so = new SecondOuter();
		SecondInner si = so.new SecondInner(fo);
	}
}
