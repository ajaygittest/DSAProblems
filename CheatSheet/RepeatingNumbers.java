package Own;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatingNumbers {
	
	
	public static void main(String[] args) {
		int[] arr= {1,3,3,3,4,5,6,6,9};
		System.out.println(getDuplicates(arr));
	}
	
	
	public static Set<Integer> getDuplicates(int[] arr){
		
		
		Set<Integer> result=new HashSet<>();
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			for(int j=i+1; j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					result.add(arr[j]);
				}
			}
		}
		
		for(Entry<Integer, Integer> m:map.entrySet()) {
			
			if(m.getValue()>1) {
				System.out.println(m.getKey());
			}
		}
		
		System.out.println(map);
		return result;
	}

}
