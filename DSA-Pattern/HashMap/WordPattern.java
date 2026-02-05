package InterviewProblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WordPattern {

	public static void main(String[] args) {

		wordPattern("abba", "dog cat cat dog");
	}

	public static boolean wordPattern(String pattern, String s) {
		String[] name = s.split(" ");
		if(pattern.length() != name.length) {
			return false;
		}
		Map<String, Character> map1 = new HashMap<>();
		Map<Character, String> map2 = new HashMap<>();
		

		for (int i = 0; i < name.length; i++) {
			
			char ch = pattern.charAt(i);
            String word = name[i];
			if(!map1.containsKey(word) && !map2.containsKey(ch)) {
				map1.put(word, ch);
				map2.put(ch, word);
			}
			else {
				if(!word.equals(map2.get(ch)) || ch !=map1.get(word)) {
					return false;
				}
			}

		}

		return true;

	}

}
