package DSA.DSAProblems.binarySearch;

public class searchInRotatedSortedArray {

	public int searchArray(int[] arr,int target) {

		int start = 0;

		int end = arr.length;

		while (start < end) {

			int mid = (start + end) / 2;
			
			if(target==arr[mid]) {
				return -1;
			}
			if (arr[start] <= arr[mid]) {
				
				if(arr[start]<=target && target<=arr[mid]) {
					end=mid-1;
				}else {
					start=mid+1;
				}

			} else {
				if(arr[mid]<=target && target<=arr[end]) {
					start=mid+1;
				}else if(target==arr[mid]) {
					return mid;
				}else {
					end=mid-1;
				}

			}

		}
		return -1;
	}

}
