package gx.ThinkInJava.TypeInfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/*
 * TypeInfo.18
 */
public class ShowMethods18 {
	private static String usage =
		"usage:\n" +
		"ShowMethods qualified.class.name\n" +
		"To show all methods in class or:\n" +
		"ShowMethods qualified.class.name word\n" +
		"To search for methods involving 'word'";
	private static Pattern p = Pattern.compile("\\w+\\.");
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.print(usage);
			System.exit(0);
		}
		int lines = 0;
		try {
			Class<?> c = Class.forName(args[0]);
			Method[] methods = c.getMethods();
			Constructor[] ctors = c.getConstructors();
			if(args.length == 1) {
				for(Method method : methods) {
					System.out.print(p.matcher(method.toString()).replaceAll(""));
				}
				for(Constructor ctor : ctors)
					System.out.print(p.matcher(ctor.toString()).replaceAll(""));
				lines = methods.length + ctors.length;
			} else {
				for(Method method : methods)
					if(method.toString().indexOf(args[1]) != -1) {
						System.out.print(p.matcher(method.toString()).replaceAll(""));
						lines++;
					}
				for(Constructor ctor : ctors) 
					if(ctor.toString().indexOf(args[1]) != -1) {
						System.out.print(p.matcher(ctor.toString()).replaceAll(""));
						lines++;
				}
			}
		} catch(ClassNotFoundException e) {
			System.out.print("No such class: " + e);
		}
	}
}
