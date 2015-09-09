package gx.ThinkInJava.InnerClasses;
/*
 * InnerClasses.05
 * 创建一个包含内部类的类，在另一个独立的类中，创建此内部类的实例。
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
