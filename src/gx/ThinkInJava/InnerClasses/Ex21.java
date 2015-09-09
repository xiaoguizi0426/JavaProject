//package gx.ThinkInJava.InnerClasses;
///*
// * Interfaces.21
// * 创建一个包含嵌套类的接口，该嵌套类中有一个static方法，它将调用接口中的方法并显示结果。
// * 实现这个接口，并将这个实现的一个实例传递给这个方法。
// */
//interface In {
//	String f();
//	String g(); 
//	class Nested {
//		static void testIn(In i) { 
//			System.out.println(i.f() + i.g());
//		}		
//	}		
//}
//
//public class Ex21 implements In {
//	public String f() { return "hello "; }
//	public String g() { return "friend"; }
//	public static void main(String[] args) {
//		Ex21 x = new Ex21();
//		In.Nested.testIn(x);						
//	}
//}
