package DSA.DSAProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupOfAnagram {
	
	public static void main(String[] args) {
		groupofAnagram();
	}
	public static List<List<String>> groupofAnagram(){
		
		String[] input={"eat", "tea", "tan", "ate", "nat", "bat"};
		
		
		
		Map<String,List<String>> result=new HashMap<>();
		
		for(String str:input) {
			
			char[] charArray=str.toCharArray();
			
			Arrays.sort(charArray);
			
			String newStr=new String(charArray);
			if(!result.containsKey(newStr)) {
				
				result.put(newStr, new ArrayList<>());
			}
			
			result.get(newStr).add(str);
		
		}
		System.out.println(result);
		return new ArrayList<>(result.values());
		
	}

}
