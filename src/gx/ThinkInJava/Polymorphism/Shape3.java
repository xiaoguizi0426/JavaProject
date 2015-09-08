package gx.ThinkInJava.Polymorphism;
/*
 * Polymorphism.03
 * ��Shape.java�����һ�����������ڴ�ӡһ����Ϣ���������಻Ҫ����������������ͷ�����ʲô��
 * ������һ���������и��Ǹ÷��������������಻�踲�ǣ��۲��ַ���ʲô����������е������и���
 * ���������
 */
import java.util.Random;

//class Shape{
//	public void draw(){}
//	public void erase(){}
//	public void amend(){System.out.println("Shape.amend()");}
//}
//
//class Circle extends Shape{
//	@Override
//	public void draw(){
//		System.out.println("Circle.draw()");
//	}
//	
//	@Override
//	public void erase(){
//		System.out.println("Circle.erase()");
//	}
//	
//	@Override
//	public void amend(){
//		System.out.println("Circle.amend()");
//	}
//}
//
//class Square extends Shape{
//	@Override
//	public void draw(){
//		System.out.println("Square.draw()");
//	}
//	
//	@Override
//	public void erase(){
//		System.out.println("Square.erase()");
//	}
//	
//	@Override
//	public void amend(){
//		System.out.println("Square.amend()");
//	}
//}
//
//class Triangle extends Shape{
//	@Override
//	public void draw(){
//		System.out.println("Triangle.draw()");
//	}
//	
//	@Override
//	public void erase(){
//		System.out.println("Triangle.erase()");
//	}
//	
//	@Override
//	public void amend(){
//		System.out.println("Triangle.amend()");
//	}
//}
//
//class RandomShapeGenerator{
//	private Random rand = new Random();
//	public Shape next(){
//		switch(rand.nextInt(3)){
//			default:
//			case 0:return new Circle();
//			case 1:return new Square();
//			case 2:return new Triangle();
//		}
//	}
//}

public class Shape3 {
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
