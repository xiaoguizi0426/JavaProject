package gx.ThinkInJava.InnerClasses;
/*
 * InnerClasses.20
 * 创建一个包含嵌套类的接口，实现此接口并创建嵌套类的实例。
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
