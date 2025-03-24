package BinarySearch;

public class CelingOfNumber {

	public static void main(String[] args) {
		int [] arr= {1,2,4,5,6,9,11};
		System.out.println(CelingNumber(arr,10));

	}
	
	public static int CelingNumber(int[] arr,int target) {
		
		int start =0;
		int end=arr.length-1;

		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target<arr[mid]) {
				end=mid-1;
			}else if(target>arr[mid]) {
				start=mid+1;
			}else {
			return arr[mid];
			}
			
		}
		return arr[start];
	}

}
