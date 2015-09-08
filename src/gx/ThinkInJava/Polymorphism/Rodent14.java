package gx.ThinkInJava.Polymorphism;
/*
 * Polymorphism.14
 */
import java.util.Random;

class Shared {
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++; 
	public Shared() { System.out.println("Creating " + this); }
	public void addRef() { refcount++; }
	public String toString() { return "Shared " + id; }
	public void showRefcount() { System.out.println("refcount = " + refcount); }		
}

class Characteristic{
	private String s;
	Characteristic(String s){
		this.s = s;
		System.out.println("Creating Characteristic " + s);
	}
}

class Description{
	private String s;
	Description(String s){
		this.s = s;
		System.out.println("Creating Description " + s);
	}
}

class RandomRodentGenerator {
	private Random rand = new Random();
	protected Shared shared = new Shared();
	public Rodent next() {
		switch(rand.nextInt(3)) {
			default:
			case 0: return new Mouse(shared);
			case 1: return new Rat(shared);
			case 2: return new Squirrel(shared);			
		}
	}
}

class Rodent {
	private String name = "Rodent";
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	private Characteristic c = new Characteristic("has tail");
	private Description d = new Description("small mammal");
	Rodent(Shared shared){
		System.out.println("Rodent() " + id);
		this.shared = shared;
		this.shared.addRef();
	}
	protected void eat() { System.out.println("Rodent.eat()"); }
	protected void run() { System.out.println("Rodent.run()"); }
	protected void sleep() { System.out.println("Rodent.sleep()"); }
	public String toString() { return name; }
}

class Mouse extends Rodent {
	private String name = "Mouse";
	private Characteristic c = new Characteristic("likes cheese");
	private Description d = new Description("nocturnal");
	Mouse(Shared shared){
		super(shared);
		System.out.println("Mouse()");
	}
	protected void eat() { System.out.println("Mouse.eat()"); }
	protected void run() { System.out.println("Mouse.run()"); }
	protected void sleep() { System.out.println("Mouse.sleep()"); }
	public String toString() { return name; }
}

class Rat extends Rodent {
	private String name = "Rat";
	private Characteristic c = new Characteristic("larger");
	private Description d = new Description("black");
	Rat(Shared shared){
		super(shared);
		System.out.println("Rat()");
	}
	protected void eat() { System.out.println("Rat.eat()"); }
	protected void run() { System.out.println("Rat.run()"); }
	protected void sleep() { System.out.println("Rat.sleep()"); }
	public String toString() { return name; }
}

class Squirrel extends Rodent {
	private String name = "Squirrel";
	private Characteristic c = new Characteristic("climbs trees");
	private Description d = new Description("likes nuts");
	Squirrel(Shared shared){
		super(shared);
		System.out.println("Squirrel()");
	}
	protected void eat() { System.out.println("Squirrel.eat()"); }
	protected void run() { System.out.println("Squirrel.run()"); }
	protected void sleep() { System.out.println("Squirrel.sleep()"); }
	public String toString() { return name; }
}

public class Rodent14 {
	private static RandomRodentGenerator gen = new RandomRodentGenerator();
	public static void main(String[] args) {
		Rodent[] rodents = new Rodent[5];
		for(Rodent r : rodents) {
			r = gen.next();
			System.out.println(r);
		}
		gen.shared.showRefcount();		
	}
}
