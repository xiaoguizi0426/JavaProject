package gx.ThinkInJava.Reusing;
/*
 * REUSING.22
 * ����һ��final�ಢ���ż̳���
 */
class SmallBrain{}

final class Dinosaur{
	SmallBrain x = new SmallBrain();
}

//class Further extends Dinosaur{}//Error: cannot inherit from final class

public class JurassicEx {

	public static void main(String[] args) {
		Dinosaur d = new Dinosaur();
	}

}
