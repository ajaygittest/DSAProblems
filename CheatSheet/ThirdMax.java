package Own;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class ThirdMax {
	
	public static void main(String[] args) {
		int[] arr= {5,3,11,22,1,99};
		
		int a=Arrays.stream(arr).distinct().sorted().skip(3).findFirst().getAsInt();
		System.out.println(a);
		System.out.println(thirdLargest(arr));
		
	}
	static  int thirdLargest(int arr[]) {
	        // Your code here
	        int thirdLarge=arr[0];
	int max=0;
	int second=0;
	int third=0;
	        
	        for(int a:arr){
	            
	            
	            if(max<a){
	            	third=second;
	            	second=max;
	                max=a;
	            }else if(max>second && a>second){
	            	third=second;
	                second=a;
	            }
	            if(a<second && a>third){
	            	third=a;
	            }
	            
	        }
	        
	        return third;
	    }

}
