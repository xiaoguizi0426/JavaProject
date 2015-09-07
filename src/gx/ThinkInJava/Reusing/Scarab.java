package gx.ThinkInJava.Reusing;
/*
 * REUSING.24
 * 在Beetle.java中，从Beetle类继承产生一个具体类型的“甲壳虫”。
 * 其形式与现有类相同，跟踪并解释其输出结果。
 */
class Insect{
	private int i = 9;
	protected int j;
	Insect(){
		System.out.println("i = " + i + ", j = " + j);
		j = 39;
	}
	private static int x1 = printInit("static Insect.x1 initialized");
	static int printInit(String s){
		System.out.println(s);
		return 47;
	}
}

class Beetle extends Insect{
	private int k = printInit("Beetle.k initialized");
	Beetle(){
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	private static int x2 = printInit("static Beetle.x2 initialized");
}

public class Scarab extends Beetle{
	private int n = printInit("Scarab.n initialized");
	
	Scarab(){
		System.out.println("n = " + n);
		System.out.println("j = " + j);
	}
	
	private static int x3 = printInit("static Scarab.x3 initialized");

	public static void main(String[] args) {
		System.out.println("Scarab constructor");
		Scarab sc = new Scarab();
	}

}
