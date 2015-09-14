package gx.ThinkInJava.TypeInfo;

import java.util.Date;

/*
 * TypeInfo.21
 */
interface Interface {
	void doSomething();
	void somethingElse(String arg);
}

class RealObject implements Interface {
	public void doSomething() { System.out.print("doSomething"); }
	public void somethingElse(String arg) {
		System.out.print("somethingElse " + arg);
	}
}

class SimpleProxy implements Interface {
	private Interface proxied;
	private static int doCount = 0;
	private static int sECount = 0;
	public SimpleProxy(Interface proxied) {
		this.proxied = proxied;
	}
	public void doSomething() { 
		long timeIn = new Date().getTime();
		System.out.print("Time called doSomething() " + doCount + ": " + timeIn + " msecs");
		System.out.print("on " + new Date());
		doCount++;
		proxied.doSomething();
		System.out.print("Call-return time = " + ((new Date().getTime()) - timeIn) + " msecs");
	}
	public void somethingElse(String arg) {
		long timeIn = new Date().getTime();
		System.out.print("Time called somethingElse() " + sECount + ": " + timeIn + " msecs");
		System.out.print("on " + new Date());
		sECount++;
		proxied.somethingElse(arg);
		System.out.print("Call-return time = " + ((new Date().getTime()) - timeIn) + " msecs");
	}
}

class SimpleProxyDemo21 {
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("bonobo");
	}
	public static void main(String[] args) {
		consumer(new RealObject());
		System.out.println();
		consumer(new SimpleProxy(new RealObject()));
		System.out.println();
		consumer(new SimpleProxy(new RealObject()));
		System.out.println();
		consumer(new SimpleProxy(new RealObject()));					
	}
}
