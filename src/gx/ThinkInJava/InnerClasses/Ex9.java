package gx.ThinkInJava.InnerClasses;
/*
 * InnerClasses.09
 * 创建一个至少有一个方法的接口。在某个方法内定义一个内部类以实现此接口，
 * 这个方法返回对此接口的引用。
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
