package gx.ThinkInJava.Interfaces;
/*
 * Interfaces.18
 * 创建一个接口Cycle及其Unicycle、Bicycle和Tricycle实现。
 * 对每种类型的Cycle都创建相应的工厂，然后编写代码使用这些工厂。
 */
interface Cycle{
	void ride();
}
interface CycleFactory{
	Cycle getCycle();
}
class Unicycle implements Cycle{
	public void ride(){
		System.out.println("Ride Unicycle");
	}
}
class UnicycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Unicycle();
	}
}
class Bicycle implements Cycle{
	public void ride(){
		System.out.println("Ride Bicycle");
	}
}
class BicycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Bicycle();
	}
}
class Tricycle implements Cycle{
	public void ride(){
		System.out.println("Ride Tricycle");
	}
}
class TricycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Tricycle();
	}
}
public class Cycles {
	public static void rideCycle(CycleFactory factory){
		Cycle c = factory.getCycle();
		c.ride();
	}
	public static void main(String[] args) {
		rideCycle(new UnicycleFactory());
		rideCycle(new BicycleFactory());
		rideCycle(new TricycleFactory());
	}
}
