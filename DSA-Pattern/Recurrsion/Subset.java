package Recurrsion;

public class Subset {
	
	
	
	public static void main(String[] args) {
		skipApple("ajaapplekd","");
	}
	
	
	
	public static void skipApple(String s, String p) {
		
		if(s.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		
		if(s.startsWith("apple")) {
			skipApple(s.substring(5), p);
		}else {
			skipApple(s.substring(1),p+s.charAt(0));
		}
	}

}
