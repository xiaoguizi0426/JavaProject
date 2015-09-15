package gx.ThinkInJava.Arrays;

import java.util.Arrays;

/*
 * Arrays.05
 */
class A{}
public class Ex5 {
	public static void main(String[] args) {
		A[][][] a3 = new A[3][3][3];
		System.out.println(Arrays.deepToString(a3));
		int[][][] a4 = new int[3][3][3];
		System.out.println(Arrays.deepToString(a4));
	}
}
