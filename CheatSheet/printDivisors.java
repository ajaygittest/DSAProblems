package Own;

import java.util.ArrayList;
import java.util.List;

public class printDivisors {
	
	
	public static void main(String[] args) {
		System.out.println(printDivisors(9));
	}
	
	public static List<Integer> printDivisors(int n) {
		// Write your code here
		int temp = 1;
		List<Integer> result = new ArrayList<>();
		while (temp < n+1) {

			if (n % temp == 0) {
				result.add(temp);
			}
			temp++;

		}
		return result;
	}
}
