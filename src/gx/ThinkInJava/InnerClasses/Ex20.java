package gx.ThinkInJava.InnerClasses;
/*
 * InnerClasses.20
 * ����һ������Ƕ����Ľӿڣ�ʵ�ִ˽ӿڲ�����Ƕ�����ʵ����
 */
interface In {
	class Nested {
		Nested() { System.out.println("Nested()"); }
		public void hi() { System.out.println("hi"); }		
	}
}

public class Ex20 implements In {
	public static void main(String[] args) {
		In.Nested in = new In.Nested();
		in.hi();				
	}
}
