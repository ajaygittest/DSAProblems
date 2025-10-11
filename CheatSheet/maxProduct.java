package Own;

public class maxProduct {
	int maxProduct(int[] arr) {
		// code here 1,2,3,4,-9,-10,-9
		
		int maxProduct=arr[0];
		int minProduct=arr[0];
		int result=arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<0) {
				int temp=maxProduct;
				maxProduct=minProduct;
				minProduct=temp;
			}
			maxProduct=Math.max(arr[i], arr[i]*maxProduct);
			minProduct=Math.min(arr[i], arr[i]*minProduct);
			result=Math.max(maxProduct, result);
		}
		return result;
	}
}
