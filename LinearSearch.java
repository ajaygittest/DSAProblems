package dsaProblems;

public class LinearSearch {
	
	public static void main(String args[]) {
		int[] array= {9,5,6,7,44,6,4,6,7,5};
		
		int index=linearSearch(array,1);
		System.out.println(index);
	}

	private static int linearSearch(int[] array, int value) {
		
		for(int i=0; i<array.length;i++) {
			if(array[i]==value) {
				return 1;
			}
		}
		
		return -1;
	}

}
