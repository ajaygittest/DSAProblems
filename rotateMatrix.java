package Sample;

public class rotateMatrix {
	
	
	public static void main(String args[]) {
		
		
	}
	
	public static boolean rotateArray(int[][] arr) {
		if(arr.length == 0 || arr.length !=arr[0].length)return false;
		
		int n = arr.length;
		for(int layer=0; layer<n/2;layer++) {
			int first=layer;
			
			int last=n-1-layer;
			
			for(int i=first; i<last;i++) {
				int offset=i-first;
				
				int top=arr[first][i];
				arr[first][i]=arr[last-offset][i];
				arr[last-offset][i]=arr[last][last-offset];
				arr[last][last-offset]=arr[i][last];
				arr[i][last]=top;
			}
		}
		return true;
		
		
	}

}
