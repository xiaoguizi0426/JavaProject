package gx.ThinkInJava.Exceptions;
/*
 * Exceptions.05
 * ʹ��whileѭ���������ơ��ָ�ģ�͡����쳣������Ϊ������
 * �����ظ���ֱ���쳣�����׳���
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
