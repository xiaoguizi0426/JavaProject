package gx.ThinkInJava.InnerClasses;
/*
 * InnerClasses.09
 * ����һ��������һ�������Ľӿڡ���ĳ�������ڶ���һ���ڲ�����ʵ�ִ˽ӿڣ�
 * ����������ضԴ˽ӿڵ����á�
 */
interface Ex9Interface{
	void say(String s);
}
public class Ex9 {
	Ex9Interface f(){
		class Inner implements Ex9Interface{
			public void say(String s){
				System.out.println(s);
			}
		}
		return new Inner();
	}
	
	public static void main(String[] args) {
		Ex9 x = new Ex9();
		x.f().say("hi");
	}
}
