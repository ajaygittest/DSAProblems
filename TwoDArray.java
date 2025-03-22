package dsaProblems;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		TwoDArray();

	}
	
	public static void TwoDArray() {
		
		int[][] arr=new int[3][3];
		System.out.println(Arrays.toString(arr));
		
		Scanner sc = new Scanner(System.in);
		
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				arr[row][col]=sc.nextInt();
			}
		}
		
		for(int[] a:arr) {
			System.out.println(Arrays.toString(a));
		}
		
		
	}

}
