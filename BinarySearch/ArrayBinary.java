package BinarySearch;

public class ArrayBinary {

	public static void main(String[] args) {
		int[] arr= {2,4,5,7,8,9};
		//System.err.println(Binary(arr,5));
		SubString("ajay");

	}
	
	
	public static void SubString(String input) {
		System.out.println(input.substring(0, 1).toUpperCase()+input.substring(1));
	}
	
	public static int Binary(int[] arr,int target) {
		
		int start=0;
		int end=arr.length-1;
		int result;
		
		while(start<=end) {
			int mid=start +(end -start)/2;
			if(target<arr[mid]) {
				
				end=mid-1;
			}else if(target>arr[mid]){
				start=mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}

}
