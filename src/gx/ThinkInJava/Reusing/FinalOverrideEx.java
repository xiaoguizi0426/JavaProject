package gx.ThinkInJava.Reusing;
/*
 * REUSING.21
 * 创建一个带final方法的类。由此继承产生一个类并尝试覆盖该方法。
 */
class WithFinal{
	final void f(){
		System.out.println("WithFinal.f()");
	}
	
	void g(){
		System.out.println("WithFinal.g()");
	}
	
	final void h(){
		System.out.println("WithFinal.h()");
	}
}

class OverrideFinal extends WithFinal{
	@Override
	public void g(){
		System.out.println("OverrideFinal.g()");
	}
}

public class FinalOverrideEx {

	public static void main(String[] args) {
		OverrideFinal of = new OverrideFinal();
		of.f();
		of.g();
		of.h();
		
		WithFinal wf = of;
		wf.f();
		wf.g();
		wf.h();
	}

}
