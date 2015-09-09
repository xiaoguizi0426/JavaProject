package gx.ThinkInJava.InnerClasses;
/*
 * InnerClasses.08
 * 确定外部类是否可以访问其内部类的private元素
 */
public class Outer8 {
	class Inner{
		private int ii1 = 1;
		private int ii2 = 2;
		private void showIi2(){
			System.out.println(ii2);
		}
		private void hi(){
			System.out.println("Inner hi");
		}
	}
	int oi = new Inner().ii1;
	void showOi(){
		System.out.println(oi);
	}
	void showOi2(){
		new Inner().showIi2();
	}
	void outerHi(){
		new Inner().hi();
	}
	public static void main(String[] args) {
		Outer8 out = new Outer8();
		out.showOi();
		out.showOi2();
		out.outerHi();
	}
}
