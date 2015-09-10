package gx.ThinkInJava.InnerClasses;
/*
 * InnerClasses.26
 * 创建一个包含内部类的类，此内部类有一个非默认的构造器（需要参数的构造器）。
 * 创建另一个也包含内部类的类，此内部类继承自第一个内部类。
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
