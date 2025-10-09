package Own;

public class maxWater {
	
	public int maxWater(int arr[]) {
		int leftMax=arr[0];
		int rightMax=arr[arr.length-1];
		int count=0;
		for(int i=0; i<arr.length; i++) {
			
			if(leftMax<rightMax) {
				int max=Math.max(leftMax, rightMax);
				count+=max;
			}
			leftMax++;
			rightMax++;
			
		}
		return count;

	}
}
