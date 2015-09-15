package gx.ThinkInJava.Holding;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/*
 * holding.16
 * 创建一个元音字母set。计算并显示在每一个输入单词中的元音字母数量，
 * 并显示输入文件中的所有元音字母的数量总和。
 */
public class Vowels16 {
	static void vowelCounter(Set<String> st){
		Set<Character> vowels = new TreeSet<Character>();
		Collections.addAll(vowels, 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
		int allVowels = 0;
		for(String s : st){
			int count = 0;
			for(Character c : s.toCharArray()){
				if(vowels.contains(c)){
					count++;
					allVowels++;
				}
			}
			System.out.print(s + ": " + count + ",");
		}
		System.out.println();
		System.out.print("Total vowels: " + allVowels);
	}
	public static void main(String[] args) {
//		Set<String> words = new TreeSet<String>(new TextFile("SetOperations.java", "\\W+"));
//		System.out.println(words);
//		System.out.println();
//		vowelCounter(words);
	}
}
