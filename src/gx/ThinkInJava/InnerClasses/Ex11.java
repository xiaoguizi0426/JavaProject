package gx.ThinkInJava.InnerClasses;
/*
 * InnerClasses.11
 * 创建一个private内部类，让它实现一个public接口。写一个方法，它返回一个指向此private
 * 内部类的实例引用，并将此引用向上转型为该接口类型。通过尝试向下转型，说明此内部类被完全隐藏了。
 */
interface Ex11Interface{
	void say(String s);
}
class Test{
	private class Inner implements Ex11Interface{
		public void say(String s){
			System.out.println(s);
		}
	}
	Ex11Interface f(){
		return new Inner();
	}
}
public class Ex11 {
	public static void main(String[] args) {
		Test t = new Test();
		t.f().say("hi");
		// Error: cannot find symbol: class Inner:
		// ((Inner)t.f()).say("hello");
	}
}
