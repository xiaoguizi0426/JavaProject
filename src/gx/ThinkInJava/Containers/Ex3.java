package gx.ThinkInJava.Containers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

/*
 * Containers.03
 */
public class Ex3 {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		Set<String> lhs = new LinkedHashSet<String>();
		Set<String> ts = new TreeSet<String>();
		System.out.println("HashSet hs = " + hs);
		System.out.println("LinkedHashSet lhs = " + lhs);
		System.out.println("TreeSet ts = " + ts);
		Map<String,String> hm = new HashMap<String,String>(0);
		Pattern p = Pattern.compile("Z[a-zA-Z]*");
		for(int i = 0; i < Countries.DATA.length; i++) {
			if(p.matcher(Countries.DATA[i][0]).matches())
			hm.put(Countries.DATA[i][0], Countries.DATA[i][0]);
		}
		System.out.println("hm.keySet() = " + hm.keySet());
		System.out.println("Adding hm.keySet()");
		hs.addAll(hm.keySet());
		lhs.addAll(hm.keySet());
		ts.addAll(hm.keySet());
		System.out.println("hs: " + hs);
		System.out.println("lhs: " + lhs);
		System.out.println("ts: " + ts);
		System.out.println("Adding 10 more times");
		for(int i = 0; i < 10; i++) {
			hs.addAll(hm.keySet());
			lhs.addAll(hm.keySet());
			ts.addAll(hm.keySet());
		}
		System.out.println("hs: " + hs);
		System.out.println("lhs: " + lhs);
		System.out.println("ts: " + ts);	
	}
}
