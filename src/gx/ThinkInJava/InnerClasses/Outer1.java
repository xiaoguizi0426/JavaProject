package gx.ThinkInJava.InnerClasses;
/*
 * InnerClasses.01
 * ��дһ����ΪOuter���࣬������һ����ΪInner���ࡣ��Outer�����һ��������
 * ������һ��Inner���͵Ķ�����main()�У���������ʼ��һ��ָ��ĳ��Inner��������á�
 */
public class Outer1 {
	class Inner{
		Inner(){
			System.out.println("Inner()");
		}
	}
	Outer1(){
		System.out.println("Outer1()");
	}
	// make an Inner from within a non-static method of outer class:
	Inner makeInner(){
		return new Inner();
	}
	public static void main(String[] args) {
		Outer1 o = new Outer1();
		Inner i = o.makeInner();
	}
}
