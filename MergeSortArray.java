package dsaProblems;

public class MergeSortArray {
	
	public static void main(String args[]) {
		int[] array = {2,3,4,5,6,7,8,7};
		
		mergerSort(array);
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]+" ");
			
		}
	}

	private static void mergerSort(int[] array) {
		int length=array.length;
		if(length <=1) return;
		
		int middle=length/2;
		int leftArray[]=new int[middle];
		int rightArray[]= new int[length -middle];
		
		int i=0;
		int j=0;
		for(; i<length; i++) {
			if(i<middle) {
				leftArray[i]=array[i];
			}else {
				rightArray[j]=array[i];
				j++;
			}
		}
		mergerSort(leftArray);
		mergerSort(rightArray);
		merge(leftArray, rightArray, array);
		
	}
	
	private static  void merge(int leftArray[], int rightArray[], int array[]) {
		int leftSize=array.length/2;
		int rightSize=array.length-leftSize;
		int i=0, l=0, r=0;
		while(l<leftSize && r< rightSize) {
			if(leftArray[l]<rightArray[r]) {
				array[i]=leftArray[l];
				i++;
				l++;
			}else {
				array[i]=rightArray[r];
				r++;
				i++;
			}
		}
		while(l<leftSize) {
			array[i]=leftArray[l];
			i++;
			l++;
		}
		while(r<rightSize) {
			array[i]=rightArray[r];
			i++;
			r++;
		}
		
	}

}
