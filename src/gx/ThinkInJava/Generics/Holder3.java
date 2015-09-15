//package gx.ThinkInJava.Generics;
///*
// * Generics.01
// * 如果指定Holder3可以持有某个基类类型，那么它也能持有导出类型
// */
//public class Holder3<T> {
//	private T a;
//	public Holder3(T a){this.a = a;}
//	public void set(T a){this.a = a;}
//	public T get(){return a;}
//	public static void main(String[] args) {
//		Holder3<Pet> h3 = new Holder3<Pet>(new Pet());
//		Pet a = h3.get();
//		System.out.println(h3.get());
//		h3.set(new Dog());
//		System.out.println(h3.get());
//		h3.set(new Gerbil());
//		System.out.println(h3.get());
//	}
//}
