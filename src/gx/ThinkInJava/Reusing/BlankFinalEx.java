package gx.ThinkInJava.Reusing;
/*
 * 创建一个含有指向某对象的空白final引用的类。在所有构造器内部都执行空白
 * final的初始化动作。说明Java确保final在使用前必须被初始化，且一旦被
 * 初始化即无法改变。
 */

class Poppet{
	private int i;
	Poppet(int k){
		i = k;
	}
	
	public String toString(){
		return ("Poppet " + i);
	}
}

public class BlankFinalEx {
	private final Poppet p ;//空白final引用
	//空白final必须在构造器中被初始化
	public BlankFinalEx(){
		p = new Poppet(1);//初始化空白final引用
	}
	
	public BlankFinalEx(int x){
		p = new Poppet(x);//初始化空白final引用
	}

	public static void main(String[] args) {
		BlankFinalEx b1 = new BlankFinalEx();
		BlankFinalEx b2 = new BlankFinalEx(47);
		
		//b1.p = new Poppet(2);//错误：不能给final变量
		//b2.p = new Poppet(3);//重新分配值
		
		System.out.println("b1.p: " + b1.p);
		System.out.println("b2.p: " + b2.p);
	} 

}
