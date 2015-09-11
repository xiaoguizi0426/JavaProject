package gx.ThinkInJava.Exceptions;
/*
 * Exceptions.21
 * 试证明，派生类的构造器不能捕获它的基类构造器所抛出的异常。
 */
class BaseException extends Exception {}

class Base {
	Base() throws BaseException {
		throw new BaseException();
	}
}

class Derived extends Base {
	// BaseException must be caught (no way) or
	// declared to be thrown:
	Derived() throws BaseException {
		super();
		// not this way, 'catch' without 'try' not allowed:
		// catch(BaseException e) {}
		// not this way either, because call to super
		// must be first statement in constructor:		
		// try {
		//	super();
		// } catch(BaseException e) {}
	}
}

public class Ex21 {
	public static void main(String[] args) {
		try {
			Derived d = new Derived();
	} catch(BaseException e) {
			System.out.println("BaseException caught in main()");
		}
			
	}
}
