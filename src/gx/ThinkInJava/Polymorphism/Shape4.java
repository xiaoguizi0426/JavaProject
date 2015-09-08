package gx.ThinkInJava.Polymorphism;
/*
 * Polymorphism.04
 * 向Shapes.java中添加一个新的Shape类型，并在main()方法中验证：多态对新类型
 * 的作用是否与在旧类型中的一样。
 */
import java.util.Random;

class Shape{
	public void draw(){}
	public void erase(){}
	public void amend(){System.out.println("Shape.amend()");}
}

class Circle extends Shape{
	@Override
	public void draw(){
		System.out.println("Circle.draw()");
	}
	
	@Override
	public void erase(){
		System.out.println("Circle.erase()");
	}
	
	@Override
	public void amend(){
		System.out.println("Circle.amend()");
	}
}

class Square extends Shape{
	@Override
	public void draw(){
		System.out.println("Square.draw()");
	}
	
	@Override
	public void erase(){
		System.out.println("Square.erase()");
	}
	
	@Override
	public void amend(){
		System.out.println("Square.amend()");
	}
}

class Triangle extends Shape{
	@Override
	public void draw(){
		System.out.println("Triangle.draw()");
	}
	
	@Override
	public void erase(){
		System.out.println("Triangle.erase()");
	}
	
	@Override
	public void amend(){
		System.out.println("Triangle.amend()");
	}
}

class Rectangle extends Shape{
	@Override
	public void draw(){
		System.out.println("Rectangle.draw()");
	}
	
	@Override
	public void erase(){
		System.out.println("Rectangle.erase()");
	}
	
	@Override
	public void amend(){
		System.out.println("Rectangle.amend()");
	}
}

class RandomShapeGenerator{
	private Random rand = new Random();
	public Shape next(){
		switch(rand.nextInt(3)){
			default:
			case 0:return new Circle();
			case 1:return new Square();
			case 2:return new Triangle();
		}
	}
}

public class Shape4 {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	public static void main(String[] args) {
		Shape[] s = new Shape[10];
		for(int i=0;i<s.length;i++){
			s[i] = gen.next();
		}
		for(Shape p : s){
			p.draw();
			p.amend();
		}
	}

}
