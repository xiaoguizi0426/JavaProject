package gx.ThinkInJava.TypeInfo;
/*
 * TypeInfo.08
 * 写一个方法，令它接受任意对象为参数，并能够递归打印出该对象所在的继承体系中的所有类
 */
//class A{}
//class B extends A{}
//class C extends B{}
//public class Ex8 {
//	public static void Hierarchy(Object o){
//		if(o.getClass().getSuperclass() != null){
//			System.out.println(o.getClass() + " is a subclass of " + o.getClass().getSuperclass());
//			try {
//				Hierarchy(o.getClass().getSuperclass().newInstance());
//			} catch (InstantiationException e) {
//				System.out.println("Unable to instantiate obj");
//			} catch (IllegalAccessException e){
//				System.out.println("Unable to access");
//			}
//		}
//	}
//	public static void main(String[] args) {
//		Hierarchy(new C());
//	}
//}
