package CyclicSort;

public class findDuplicateInArray {

	
	public static void main(String[] args) {
		
		int[] arr= {3,1,1,2};
		
		System.out.println(missingNumber(arr));
	}
	
	public static int missingNumber(int[] arr) {
		int i=0;
		
		while(i<arr.length) {
			
			if(arr[i] !=arr[i+1]) {
			int correct=arr[i]-1;
			
			if(arr[i] !=arr[correct]) {
				swap(arr,i,correct);
			}else {
				i++;
			}
		}else {
			return arr[i];
		}
		}
		return -1;
	}

	private static void swap(int[] arr, int i, int correct) {
		int temp=arr[i];
		arr[i]=arr[correct];
		arr[correct]=temp;
		
	}
}
