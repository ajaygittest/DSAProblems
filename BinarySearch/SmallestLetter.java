package BinarySearch;

public class SmallestLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] arr= {'c','d','e'};
		System.out.println(smallestLetter(arr,'e'));

	}
	
public static char smallestLetter(char[] arr,char target) {
		
		int start =0;
		int end=arr.length-1;

		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target<arr[mid]) {
				end=mid-1;
			}else{
				start=mid+1;
			}
			
		}
		return arr[start%arr.length];
	}


}
