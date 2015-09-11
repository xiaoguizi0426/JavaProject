package gx.ThinkInJava.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/*
 * holding.12
 */
public class Ex12 {
	public static void main(String[] args) {
		List<Integer> li1 = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4));
		List<Integer> li2 = new ArrayList<Integer>(Arrays.asList(5,6,7,8,9));
		ListIterator<Integer> lt1 = li1.listIterator();
		ListIterator<Integer> lt2 = li2.listIterator();
		System.out.println("li1: " + li1);
		System.out.println("li2: " + li2);
		// move it1 to end:
		while(lt1.hasNext()){
			lt1.next();
		}
		// now use it2 to re-set li2:
		while(lt2.hasNext()){
			lt2.next();
			lt2.set(lt1.previous());
		}
		System.out.println("li1: " + li1);
		System.out.println("li2: " + li2);
	}
}
