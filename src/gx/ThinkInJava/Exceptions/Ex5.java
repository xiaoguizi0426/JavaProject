package gx.ThinkInJava.Exceptions;
/*
 * Exceptions.05
 * 使用while循环建立类似“恢复模型”的异常处理行为，它将
 * 不断重复，直到异常不再抛出。
 */
public class Ex5 {
	private static int[] ia = new int[2];
	static int x = 5;
	public static void main(String[] args) {
		while(true){
			try {
				ia[x] = 1;
				System.out.println(ia[x]);
				break;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("Caught ArrayIndexOutOfBoundsException");
				e.printStackTrace();
				x--;
			} finally {
				System.out.println("Are we done yet?");
			}
		}
		System.out.println("Now, we're done!");
	}
}
