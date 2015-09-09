package gx.ThinkInJava.InnerClasses;
/*
 * InnerClasses.07
 * 创建一个含有private域和private方法的类。创建一个内部类，它有一个方法
 * 用来修改外围类的域，并调用外围类的方法。在外围类的另一方法中，创建此内部类
 * 的对象，并且调用它的方法，然后说明对外围类对象的影响。
 */
public class Outer7 {
	private int oi = 1;
	private void hi(){
		System.out.println("Outer hi " + oi);
	}
	class Inner{
		void modifyOuter(){
			oi *= 2;
			hi();
		}
	}
	public void showOi(){
		System.out.println(oi);
	}
	void testInner(){
		Inner in = new Inner();
		in.modifyOuter();
	}
	public static void main(String[] args) {
		Outer7 out = new Outer7();
		out.showOi();
		out.testInner();
		out.showOi();
	}
}
