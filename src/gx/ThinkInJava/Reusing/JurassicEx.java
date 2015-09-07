package gx.ThinkInJava.Reusing;
/*
 * REUSING.22
 * 创建一个final类并试着继承它
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
