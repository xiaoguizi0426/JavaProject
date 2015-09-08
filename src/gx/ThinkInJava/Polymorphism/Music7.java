package gx.ThinkInJava.Polymorphism;
/*
 * Polymorphism.07
 * 向Music3.java添加一个新的类型Instrument，并验证多态性是否作用于所添加的新类型
 */
//class Instrument {
//	void play(Note n) { System.out.println("Instrument.play() " + n); }
//	public String toString() { return "Instrument"; }
//	void adjust() { System.out.println("Adjusting Instrument"); }
//}
//
//class Wind extends Instrument {
//	void play(Note n) { System.out.println("Wind.play() " + n); }
//	public String toString() { return "Wind"; }
//	void adjust() { System.out.println("Adjusting Wind"); }
//}
//
//class Percussion extends Instrument {
//	void play(Note n) { System.out.println("Percussion.play() " + n); }
//	public String toString() { return "Percussion"; }
//	void adjust() { System.out.println("Adjusting Percussion"); } 
//}
//
//class Stringed extends Instrument {
//	void play(Note n) { System.out.println("Stringed.play() " + n); }
//	public String toString() { return "Stringed"; }
//	void adjust() { System.out.println("Adjusting Stringed"); } 
//}
//
//class Keyboard extends Instrument {
//	void play(Note n) { System.out.println("Keyboard.play() " + n); }
//	public String toString() { return "Keyboard"; }
//	void adjust() { System.out.println("Adjusting Keyboard"); } 
//}
//
//class Brass extends Wind {
//	void play(Note n) { System.out.println("Brass.play() " + n); }
//	public String toString() { return "Brass"; }
//	void adjust() { System.out.println("Adjusting Brass"); }
//}
//
//class Woodwind extends Wind {
//	void play(Note n) { System.out.println("Woodwind.play() " + n); }
//	public String toString() { return "Woodwind"; }
//}
//
//class Piano extends Keyboard {
//	void play(Note n) { System.out.println("Piano.play() " + n); }
//	public String toString() { return "Piano"; }
//}

public class Music7 {
	// Doesn't care about type, so new types
		// added to the system still work right:
		public static void tune(Instrument i) {
			//...
			i.play(Note.MIDDLE_C);
		}
		public static void tuneAll(Instrument[] e) {
			for(Instrument i : e)
				tune(i);
		}
		public static void main(String[] args) {
			// Upcasting during addition to the array:
			Instrument[] orchestra = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind(),
				new Piano()
			};
			tuneAll(orchestra);
			for(Instrument i : orchestra)
				System.out.println(i);
		}
}
