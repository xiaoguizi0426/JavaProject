package gx.ThinkInJava.TypeInfo;
/*
 * TypeInfo.01、02
 * 01.在ToyTest.java中，将Toy的默认构造器注释掉
 * 02.将新的interface加到ToyTest.java中，看程序是否能够正确检测出来
 * 使用newInstance()来创建的类，必须带有默认的构造器
 */
interface HasBatteries{}
interface Waterproof{}
interface Shoots{}
interface Files{}
class Toy{
//	Toy(){}
	Toy(int i){}
}
class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots,Files{
	FancyToy(){
		super(1);
	}
}
public class ToyTest1 {
	static void printInfo(Class cc){
		System.out.print("Class name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
		System.out.print("Simple name: " + cc.getSimpleName());
		System.out.println("Canonical name: " + cc.getCanonicalName());
	}
	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("gx.ThinkInJava.TypeInfo.FancyToy");
		} catch (ClassNotFoundException e) {
			System.out.print("Can't find FancyToy");
			System.exit(1);
		}
		printInfo(c);
		for(Class face : c.getInterfaces()){
			printInfo(face);
		}
		Class up = c.getSuperclass();
		Object obj = null;
		try {
			obj = up.newInstance();
		} catch (InstantiationException e) {
			System.out.print("Cannot instantiate");
			System.exit(1);
		} catch (IllegalAccessException i){
			System.out.print("Cannot access");
			System.exit(1);
		}
		printInfo(obj.getClass());
	}
}
