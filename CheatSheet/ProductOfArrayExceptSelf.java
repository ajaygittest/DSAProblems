package DSA.DSAProblems;

public class ProductOfArrayExceptSelf {

	
	
	
	public int[] productOfArray(int[] arr) {
		
		int[] left=new int[arr.length];
		
		int[] right=new int[arr.length];
		
		left[0]=1;
		
		for(int i=1; i<arr.length; i++) {
			left[i]=left[i-1]*arr[i-1];
		}
		
		right[arr.length-1]=1;
		
		for(int j=arr.length-2; j>=0; j++) {
			right[j]=right[j+1]*arr[j+1];
		}
		
		int[] ans=new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			ans[i]=right[i]*left[i];
		}
		
		return ans;
		
		
	}
}
