package gx.ThinkInJava.TypeInfo;
/*
 * TypeInfo.07
 */
class Candy {
	static { System.out.print("Loading Candy"); }
}

class Gum {
	static { System.out.print("Loading Gum"); } 
}

class Cookie {
	static { System.out.print("Loading Cookie"); }
}

public class SweetShop7 {
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("Usage: sweetName");
			System.exit(0);
		}
		Class c = null;
		try {
			//arguments:gx.ThinkInJava.TypeInfo.Candy
			c = Class.forName(args[0]);
			System.out.print("Enjoy your " + args[0]);
		} catch(ClassNotFoundException e) {
			System.out.print("Couldn't find " + args[0]);
		}
	}
}
