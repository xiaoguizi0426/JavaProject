package gx.ThinkInJava.InnerClasses;
/*
 * InnerClasses.05
 * ����һ�������ڲ�����࣬����һ�����������У��������ڲ����ʵ����
 */
class Outer{
	class Inner{
		Inner(){
			System.out.println("Outer.Inner()");
		}
	}
}
public class OtherOuter {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner inner = o.new Inner();
	}
}
