package gx.ThinkInJava.TypeInfo;
/*
 * TypeInfo.10
 * 写一个程序，判断char数组是个基本类型，还是一个对象。
 */
public class Ex10 {
	public static void main(String[] args) {
		char[] c = new char[10];
		//c is an object
		System.out.println("Superclass of char[] c: " + c.getClass().getSuperclass());
		System.out.println("Char[] c instanceof Object: " + (c instanceof Object));
	}
}
