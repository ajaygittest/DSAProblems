package Recurrsion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
	
	public static void main(String[] args) {
		System.out.println(permutation("abc",""));
	}
	
	
	public static List<String> permutation(String p, String up) {
		
		if(p.length()==0) {
			List<String> ans=new ArrayList<>();
			ans.add(up);
			return ans;
		}
		
		List<String> res=new ArrayList<>();
		
		for(int i=0; i<p.length(); i++) {
			
			char c=p.charAt(i);
			String result=p.substring(0,i)+p.substring(i+1);
			res.addAll(permutation(result,up+c));
		}
		return res;
	}

}
