package gx.ThinkInJava.TypeInfo;
/*
 * TypeInfo.01��02
 * 01.��ToyTest.java�У���Toy��Ĭ�Ϲ�����ע�͵�
 * 02.���µ�interface�ӵ�ToyTest.java�У��������Ƿ��ܹ���ȷ������
 * ʹ��newInstance()���������࣬�������Ĭ�ϵĹ�����
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
