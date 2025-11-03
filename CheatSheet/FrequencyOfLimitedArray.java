package Own;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyOfLimitedArray {
	
	
	
	public static void main(String[] args) {
		
	}
	
	
	public static List<Integer> counts(int[] arr){
		
		
		List<Integer> result=new ArrayList<>();
		
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int a:arr) {
			
			map.put(a, map.getOrDefault(a, 0)+1);
		}
		
		for(int i=0; i<arr.length; i++) {
			
			result.add(map.getOrDefault(i, 0)+1);
		}
		
		return result;
	}

}
