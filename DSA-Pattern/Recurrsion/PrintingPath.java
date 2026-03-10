package Recurrsion;

public class PrintingPath {
	
	public static void main(String[] args) {
		diagonalPath("",3,3);
	}
	
	
	public static void path(String p, int r,int c) {
		
		if(r==1 && c==1) {
			System.out.println(p);
			return;
		}
		
		if(r>1) {
			path('D'+p,r-1,c);
		}
		
		if(c>1) {
			path('R'+p,r,c-1);
		}
	}
	
	
	public static void diagonalPath(String p,int r,int c) {
		
		if(r==1 && c==1) {
			System.out.println(p);
			return;
		}
		
		if(r>1 && c>1) {
			diagonalPath(p+'D', r-1, c-1);
		}
		
		if(r>1) {
			diagonalPath(p+'V', r-1, c);
		}
		if(c>1) {
			diagonalPath(p+'H', r, c-1);
		}
	}

}
