package gx.ThinkInJava.InnerClasses;
/*
 * InnerClasses.01
 * 编写一个名为Outer的类，它包含一个名为Inner的类。在Outer中添加一个方法，
 * 它返回一个Inner类型的对象。在main()中，创建并初始化一个指向某个Inner对象的引用。
 */
public class Outer1 {
	class Inner{
		Inner(){
			System.out.println("Inner()");
		}
	}
	Outer1(){
		System.out.println("Outer1()");
	}
	// make an Inner from within a non-static method of outer class:
	Inner makeInner(){
		return new Inner();
	}
	public static void main(String[] args) {
		Outer1 o = new Outer1();
		Inner i = o.makeInner();
	}
}
