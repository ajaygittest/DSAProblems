package Sample;

import java.util.HashMap;
import java.util.Map;

public class StringProgram {

	
	public static void main(String args[]) {
		//occurence("Rajaaa");
		//duplicateRemove("Rrsajs");
		//firstNonRepeating("jdkdlsadjdfj");
		//reverseWord("Maamey Podu");
		checkVowels("yrt");
	}
	
	public static void occurence(String input) {
		
		Map<Character,Integer> countChar = new HashMap<>();
		
		for(char c:input.toCharArray()) {
			countChar.put(c, countChar.getOrDefault(c, 0)+1);
		}
		System.out.println(countChar);
	}
	
	public static void duplicateRemove(String data) {
		
		StringBuilder sb = new StringBuilder();
		for(char c: data.toCharArray()) {
			if(sb.indexOf(String.valueOf(c))==-1) {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}
	
	public static void firstNonRepeating(String data) {
Map<Character,Integer> countChar = new HashMap<>();
		
		for(char c:data.toCharArray()) {
			countChar.put(c, countChar.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> n:countChar.entrySet()) {
			
			if(n.getValue()==1) {
				System.out.println(n.getKey());
				break;
			}
			
		}
	}
	
	public static void reverseWord(String word) {
	String[] news=word.split(" ");
	
	StringBuilder sb = new StringBuilder();
	
	for(String s:news) {
		sb.append(new StringBuilder(s).reverse().append(" "));
	}
	System.out.println(sb);
	
	}
	
	public static void checkVowels(String inputCheck) {
		
		System.out.println(inputCheck.toLowerCase().matches(".*[aeiou].*"));
	}
}
