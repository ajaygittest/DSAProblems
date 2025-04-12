package dsaProblems;

public class QuickSort {

	
	public static void main(String args[]) {
		
		int[] array ={3,4,5,6,7,8,8,6,23,4,6,0};
		
		quickSort(array,0,array.length-1);
		 
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}

	private static void quickSort(int[] array, int startIndex, int endIndex) {
		
		if(endIndex <= startIndex)return;
		
		int pivot = partion(array, startIndex, endIndex);
		quickSort(array, startIndex, pivot-1);
		quickSort(array, pivot+1, pivot-1);
		
	}
	
	private static int partion(int array[], int start, int end) {
		
		int pivot =array[end];
		int i=start-1;
		
		for(int j=start; j<=end-1; j++) {
			if(array[j]<pivot) {
				i++;
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		i++;
		int temp=array[i];
		array[i]=array[end];
		array[end]=temp;
		
		return i;
		
	}
}
