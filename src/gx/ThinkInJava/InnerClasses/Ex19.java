package gx.ThinkInJava.InnerClasses;
/*
 * InnerClasses.19
 * 创建了一个包含了内部类的类，而此内部类又包含有内部类。使用嵌套类重复
 * 这个过程。注意编译器生成的.class文件的名字。
 */
public class Ex19 {
	Ex19() { System.out.println("Ex19()"); }
	private class Ex19Inner {
		Ex19Inner() { System.out.println("Ex19Inner()"); } 
		private class Ex19InnerInner {
			Ex19InnerInner() {
				System.out.println("Ex19InnerInner()");
			}
		}
	}
	private static class Ex19Nested {
		Ex19Nested() { System.out.println("Ex19Nested()"); }
		private static class Ex19NestedNested {
			Ex19NestedNested() { 
			System.out.println("Ex19NestedNested()"); 
			}
		}
	}	
	public static void main(String[] args) {
		Ex19Nested en = new Ex19Nested();
		Ex19Nested.Ex19NestedNested enn = new Ex19Nested.Ex19NestedNested();
		Ex19 e19 = new Ex19();
		Ex19.Ex19Inner ei = e19.new Ex19Inner();
		Ex19.Ex19Inner.Ex19InnerInner eii = ei.new Ex19InnerInner();
	}
}

/* compiler produces:
* Ex19$Ex19Inner$Ex19InnerInner.class
* Ex19$Ex19Inner.class
* Ex19$Ex19Nested$Ex19NestedNested.class
* Ex19$Ex19Nested.class
* Ex19.class
*/
