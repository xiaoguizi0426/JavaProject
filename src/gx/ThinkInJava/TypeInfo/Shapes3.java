//package gx.ThinkInJava.TypeInfo;
//
//import java.util.Arrays;
//import java.util.List;
//
///*
// * TypeInfo.03¡¢04
// */
//abstract class Shape {
//	void draw() { System.out.println(this + ".draw()"); }
//	abstract public String toString();
//}
//
//class Circle extends Shape {
//	public String toString() { return "Circle"; }
//}
//
//class Square extends Shape {
//	public String toString() { return "Square"; }
//}
//
//class Triangle extends Shape {
//	public String toString() { return "Triangle"; }
//}
//
//class Rhomboid extends Shape {
//	public String toString() { return "Rhomboid"; }
//}
//
//public class Shapes3 {
//	public static void main(String[] args) {
//		// upcasting to Shape:
//		List<Shape> shapeList = Arrays.asList(
//			new Circle(), new Square(), new Triangle(), new Rhomboid()
//		);
//		// downcasting back to specific shape:
//		for(Shape shape : shapeList)
//			shape.draw();
//		Rhomboid r = new Rhomboid();
//		//Upcast
//		Shape s = (Shape)r;
//		s.draw();
//		//check type before downcast
//		if(s instanceof Circle){
//			((Circle)s).draw();
//		}else{
//			System.out.println("(Shape)r is not a circle!");
//		}
//		// inconvertible types:
//		// ((Circle)r).draw();
//	}
//}
