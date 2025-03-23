package Kunal;

public class Patterns {
	
	public static void main(String args[]) {
		Pattern9	(5);
	}
	
	public static void Pattern(int n) {
		
		for(int row=0; row<=n; row++) {
			
			for(int col=1; col<=row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void Pattern2(int n) {
		
		for(int row=0; row<=n; row++) {
			
			for(int col=1; col<=n; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void Pattern3(int n) {
		
		for(int row=0; row<=n; row++) {
			
			for(int col=1; col<=n-row+1; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void PatternNumber(int n) {
		
		for(int row=0; row<=n; row++) {
			
			for(int col=1; col<=row+1; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
	
public static void Pattern5(int n) {
		
		for(int row=0; row<2*n; row++) {
			int totalRow=row>n?2*n-row:row;
			for(int col=1; col<=totalRow; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

public static void Pattern6(int n) {
	
	for(int row=0; row<2*n; row++) {
		int totalRow=row>n?2*n-row:row;
		int space=n-totalRow;
		
		for(int i=0; i<space; i++) {
			System.out.print(" ");
		}
		for(int col=1; col<=totalRow; col++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}


public static void Pattern7(int n) {
	
	for(int row=1; row<=n; row++) {
		
		for(int i=1; i<n-row; i++) {
			System.out.print(" ");
		}
		for(int col=row; col>=1; col--) {
			System.out.print(col);
		}
		
		for(int col=2; col<=row; col++) {
			System.out.print(col);
		}
		System.out.println();
	}
}


public static void Pattern9(int n) {
	
	for(int row=0; row<=2*n; row++) {
		for(int col=0; col<=2*n; col++) {
		
			int value=n-Math.min(Math.min(row, col), Math.min(2*n-row, 2*n-col));
			
			System.out.print(value+" ");
			
		}
		System.out.println();
	}
}

}
