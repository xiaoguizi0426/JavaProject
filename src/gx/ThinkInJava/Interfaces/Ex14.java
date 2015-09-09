package gx.ThinkInJava.Interfaces;
/*
 * Interfaces.14
 * 创建3个接口，每个接口都包含两个方法。继承出一个接口，它组合了这个三个接口并添加了一个新的方法。
 * 创建一个实现了该新接口并且继承了某个具体类的类。现在编写四个方法，每一个都接受这四个接口之一作为参数。
 */
interface History {
	void u();
	void v();
}

interface Exam {
	void w();
	void x();
}

interface Labs {
	void y();
	void z();
}

interface Workup extends History, Exam, Labs {
	void zz();
}

class Doctor {
	private int i = 0;
	public void doc() {}
}

class Anesthesiologist extends Doctor implements Workup {
	private int j = 0;
	public void u() {}
	public void v() {}
	public void w() {}
	public void x() {}
	public void y() {}
	public void z() {}
	public void zz() {}
}

public class Ex14 {
	public static void m1(History history) { history.v(); }
	public static void m2(Exam exam) { exam.w(); }
	public static void m3(Labs labs) { labs.y(); } 
	public static void m4(Workup workup) { workup.zz(); }
	public static void main(String[] args) {
		Anesthesiologist anes = new Anesthesiologist();
		m1(anes);
		m2(anes);
		m3(anes);
		m4(anes);
	}
}
