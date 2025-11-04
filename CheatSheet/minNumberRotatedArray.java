package Own;

public class minNumberRotatedArray {
	static int minNumber(int arr[], int low, int high) {
	while(low<high) {
			
			int mid=low+(high-low)/2;
			
			if(arr[mid]>arr[high]) {
				low=mid+1;
			}else {
				high=mid;
			}
		}
		return arr[low];
    

	}
}
