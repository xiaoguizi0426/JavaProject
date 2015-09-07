package gx.ThinkInJava.Reusing;
/*
 * REUSING.23
 * 证明加载类的动作仅发生一次。证明该类的第一个实体的创建者或对static成员的访问都有可能引起加载
 */
class A{
	static int j = printInit("A.j initialized");
	static int printInit(String s){
		System.out.println(s);
		return 1;
	}
	
	A(){
		System.out.println("A() constructor");
	}
}

class B extends A{
	static int k = printInit("B.k initialized");
	B(){
		System.out.println("B() constructor");
	}
}

class C{
	static int n = printInitC("C.n initialized");
	static A a = new A();
	C(){
		System.out.println("C() constructor");
	}
	static int printInitC(String s){
		System.out.println(s);
		return 1;
	}
}

class D{
	D(){
		System.out.println("D() constructor");
	}
}

public class LoadClass extends B{
	
	static int i = printInit("LoadClass.i initialized");
	LoadClass(){
		System.out.println("LoadClass() constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("hi");
		
		LoadClass lc = new LoadClass();
		
		System.out.println(C.a);
		
		D d = new D();
	}

}
