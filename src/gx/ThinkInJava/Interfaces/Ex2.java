package gx.ThinkInJava.Interfaces;
/*
 * Interfaces.02
 * 创建一个不包含任何抽象方法的抽象类，并验证我们不能为该类创建任何实例。
 */
abstract class Nogo1 {
	Nogo1() { System.out.println("Nogo1()"); }
}

abstract class Nogo2 {}

class Go1 extends Nogo1 {
	Go1() { System.out.println("Go1()"); }
}

public class Ex2 {
	public static void main(String[] args) {
		// Nogo1 and Nogo2 cannot be instantiated:
		// Nogo1 ng1 = new Nogo1();
		// Nogo2 ng2 = new Nogo2();
		// But Nogo1() constructor called during instatiation of child: 	
		Go1 g1 = new Go1();
	}
}
