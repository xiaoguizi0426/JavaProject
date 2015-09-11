package gx.ThinkInJava.Exceptions;
/*
 * Exceptions.10
 * 为一个类定义两个方法：f()和g()。在g()里，抛出一个自定义的新异常。在f()里，
 * 调用g()，捕获它抛出的异常，并且catch子句里抛出另一个新异常。
 */
class GException extends Exception {
	GException(String s) { super(s); }
}

class HException extends Exception {
	HException(String s) { super(s); }
}
public class Ex10 {
	static void f() {
		try {
			try {
				g();
			} catch(GException ge) {
				System.out.println("Caught GException in f inner try");
				ge.printStackTrace();
				throw new HException("from f(), inner try");
			}
		} catch(HException he) {
			System.out.println("Caught HException in f() outer try");
			he.printStackTrace(System.out);
		}
	}
	static void g() throws GException {
		throw new GException("from g()");
	}
	public static void main(String[] args) {
		f();
	}
}
