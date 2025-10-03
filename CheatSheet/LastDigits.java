package Own;

public class LastDigits {
	
	
	
	public static void main(String[] args) {
		
	}
	
	
	public static int lastDigits(String a, String b) {
		
		if(b.equals("0")) {
			return 1;
		}
		if(a.equals("1")) {
			return 1;
		}
		
		
		int exp= modulo(4,b)==0?4:modulo(4,b);
		int ans=1;
		int base=a.charAt(a.length()-1)-'0';
		for(int i=0; i<exp; i++) {
			
			ans=(base*ans);
		}
		return ans%10;
	}


	private static int modulo(int base, String b) {
	
		int res=0;
		
		for(int i=0; i<b.length(); i++) {
			
			res=(res*10+b.charAt(i)-'0')%4;
		}
		return res;
	}

}
