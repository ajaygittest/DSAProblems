package Own2;

public class DutchNationFlag {
	
	
	public static void sortColor(int[] arr) {
		
		int start=0;
		int mid=0;
		int end=arr.length-1;
		
		while(start<=end) {
			
			switch(arr[mid]) {
			
			case 0:
				swap(arr,start,mid);
				start++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				swap(arr,mid,end);
				end--;
				break;
			}
			
		}
	}

	private static void swap(int[] arr, int start, int end) {
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		
	}

}
