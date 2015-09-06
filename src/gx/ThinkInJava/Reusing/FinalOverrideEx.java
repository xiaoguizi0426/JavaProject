package gx.ThinkInJava.Reusing;
/*
 * REUSING.21
 * ����һ����final�������ࡣ�ɴ˼̳в���һ���ಢ���Ը��Ǹ÷�����
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
