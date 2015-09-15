package gx.ThinkInJava.Generics;
/*
 * Generics.09
 */
public class GenericMethods9 {
	public <T, U, V> void f(T x, U y, V z) {
		System.out.println(x.getClass().getName() +
		" " + y.getClass().getName() +
		" " + z.getClass().getName());
	}
	public static void main(String[] args) {
		GenericMethods9 gm = new GenericMethods9();
		gm.f("", 1, 1.0);
		gm.f(1.0F, 'c', gm);
	}
}
