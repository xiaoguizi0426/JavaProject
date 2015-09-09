package gx.ThinkInJava.InnerClasses;
/*
 * InnerClasses.07
 * ����һ������private���private�������ࡣ����һ���ڲ��࣬����һ������
 * �����޸���Χ����򣬲�������Χ��ķ���������Χ�����һ�����У��������ڲ���
 * �Ķ��󣬲��ҵ������ķ�����Ȼ��˵������Χ������Ӱ�졣
 */
public class Outer7 {
	private int oi = 1;
	private void hi(){
		System.out.println("Outer hi " + oi);
	}
	class Inner{
		void modifyOuter(){
			oi *= 2;
			hi();
		}
	}
	public void showOi(){
		System.out.println(oi);
	}
	void testInner(){
		Inner in = new Inner();
		in.modifyOuter();
	}
	public static void main(String[] args) {
		Outer7 out = new Outer7();
		out.showOi();
		out.testInner();
		out.showOi();
	}
}
