package gx.ThinkInJava.Reusing;
/*
 * ����һ������ָ��ĳ����Ŀհ�final���õ��ࡣ�����й������ڲ���ִ�пհ�
 * final�ĳ�ʼ��������˵��Javaȷ��final��ʹ��ǰ���뱻��ʼ������һ����
 * ��ʼ�����޷��ı䡣
 */

class Poppet{
	private int i;
	Poppet(int k){
		i = k;
	}
	
	public String toString(){
		return ("Poppet " + i);
	}
}

public class BlankFinalEx {
	private final Poppet p ;//�հ�final����
	//�հ�final�����ڹ������б���ʼ��
	public BlankFinalEx(){
		p = new Poppet(1);//��ʼ���հ�final����
	}
	
	public BlankFinalEx(int x){
		p = new Poppet(x);//��ʼ���հ�final����
	}

	public static void main(String[] args) {
		BlankFinalEx b1 = new BlankFinalEx();
		BlankFinalEx b2 = new BlankFinalEx(47);
		
		//b1.p = new Poppet(2);//���󣺲��ܸ�final����
		//b2.p = new Poppet(3);//���·���ֵ
		
		System.out.println("b1.p: " + b1.p);
		System.out.println("b2.p: " + b2.p);
	} 

}
