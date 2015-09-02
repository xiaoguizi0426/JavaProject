package gx.ThinkInJava.Reusing;
/*
 * REUSING.18
 * 创建一个含有static final域和final域的类，说明二者间的区别 
 * answer:被static final定义的变量的值是不会因为通过创建第二个对象
 * 而加以改变的，这是因为static的变量在类装载时已被初始化，而不是每次
 * 创建新对象时都初始化。被final定义的变量可以通过创建其它对象而改变。
 */
import java.util.Random;

class Test{
	Test(String s){
		System.out.println("Test() " + s);
	}
}

public class Difference {
	private String name;
	public Difference(String s){
		name = s;
	}
	static final Test sft = new Test("static final");
	private final Test ft = new Test("final");
	static final String SFS = "static final";
	private final String fs = "final";
	private static Random rand = new Random();
	static final int SFI = rand.nextInt();
	private final int fi = rand.nextInt();
	public String toString(){
		return (name + ": " + sft + ", " + ft + ", " + SFS + ", " + fs + ", " + SFI + ", " + fi);
	}
	
	
	public static void main(String[] args) {
		Difference d1 = new Difference("d1");
		Difference d2 = new Difference("d2");
		Difference d3 = new Difference("d3");
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}

}
