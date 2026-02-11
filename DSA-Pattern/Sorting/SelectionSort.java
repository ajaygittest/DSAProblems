package DSA.DSAProblems.sorting;

public class SelectionSort {
	
	
	public void selection(int[] arr) {
		
		int n=arr.length;
		
		for(int i=0; i<n; i++) {
			
			int minIndex=i;
			
			for(int j=i; j<n; j++) {
				
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
	}

}
