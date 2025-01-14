package dsaProblems;

public class selectionSort {
	
	public static void main(String args[]) {
		int array[]= {2,3,4,5,6,7,7,4,6,67,45};
		selectionSort(array);
		for(int i:array) {
			System.out.println(i);
		}
	}

	private static void selectionSort(int[] array) {
		
		for(int i=0; i<array.length-1;i++) {
			int min=i;
			for(int j=i+1;j<array.length-1;j++) {
				if(array[min]>array[j]) {
					min=j;
				}
			}
			int temp=array[i];
			array[i]=array[min];
			array[min]=temp;
		}
		
	}

}
