package gx.ThinkInJava.Exceptions;
/*
 * Exceptions.25
 * 建立一个三层的异常继承体系，然后创建基类A，它的一个方法能抛出异常体系的基类异常。
 * 让B继承A，并且覆盖这个方法，让它抛出第二层的异常。让C继承B，再次覆盖这个方法，让
 * 它抛出第三层的异常。在main()里创建一个C类型的对象，把它向上转型为A，然后调用这个方法。
 */
class LevelOneException extends Exception {}
class LevelTwoException extends LevelOneException {}
class LevelThreeException extends LevelTwoException {} 

class A {
	void f() throws LevelOneException {
		throw new LevelOneException();
	}
}

class B extends A {
	void f() throws LevelTwoException {
		throw new LevelTwoException();
	}
}

class C extends B {
	void f() throws LevelThreeException {
		throw new LevelThreeException();
	}
}

public class Ex25 {
	public static void main(String[] args) {
		A a = new C();
		try {
			a.f();
		}	catch(LevelThreeException e3) {
			System.out.println("Caught e3");			
		}	catch(LevelTwoException e2) {
			System.out.println("Caught e2");
		}	catch(LevelOneException e1) {
			System.out.println("Caught e1");
		}		
	}
}
