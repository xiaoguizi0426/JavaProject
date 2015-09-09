package gx.ThinkInJava.InnerClasses;
/*
 * Interfaces.15
 * 创建一个类，有非默认的构造器，并且没有默认构造器。创建第二个类，
 * 它包含一个方法，能够返回对第一个类的对象的引用。通过写一个继承自
 * 第一个类的匿名内部类，来创建一个返回对象。
 */
class One{
	private String s;
	One(String s){
		this.s = s;
	}
	public String showS(){
		return s;
	}
}
public class Ex15 {
	public One makeOne(String s){
		return new One(s){};
	}
	public static void main(String[] args) {
		Ex15 x= new Ex15();
		System.out.println(x.makeOne("hi").showS());
	}
}
