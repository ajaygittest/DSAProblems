package Sample;

import java.util.Arrays;

public class ArrayProblems {
	
	public static void main(String args[]) {
		
		int[] arr = { 1, 2,3, 3, 4, 5 };
		
		System.out.println(uniqueArray
				(arr));
	}
	
public static int[] middle(int[] array) {
        
        int[] result = new int[5];
        
        if(array.length==0){
            return result;
        }
        
        result[0]=array[0];
        int size=array.length-1;
        for(int i=1; i<array.length;i++){
            if(i==size){
                result[i]=array[i];
            }
        }
        
        return result;
      
    }

public static int diagonalElement(int[][] arr){
	
	int size=arr.length;
	int sum=0;
	
	for(int i=1; i<size;i++) {
		sum+=arr[i][i];
	}
	return sum;
}

	public static int[] findBestScore(int[] arr) {
		
		int[] result = null;
		 int max = 0;
		 int min=0;
		 
		 for(int score:arr) {
			 if(score>max) {
				 min=max;
				 max=score;
			 }else if(score >min && score<max) {
				 min=score;
			 }
			 
		 }
		 return new int[]{min,max};

	}
	
	public static int missingNumber(int[] arr) {
		int result = 0;
		int n=arr.length;
		int expectedSum=(n*(n+1))/2;
		
		for(int sum:arr) {
			result+=sum;
		}
		return result-expectedSum;
		
	}
	
	
	public static int[] duplicateArray(int[] arr) {
		int n=arr.length;	
		int[] result=new int[n];
		int index=0;
		
		for(int i=0; i<arr.length; i++) {
			boolean duplicate=false;
			
			for(int j=i+1; j<n; j++) {
				if(arr[i]==arr[j]) {
					duplicate=true;
					break;
				}
			}
			if(!duplicate) {
				result[index++]=arr[i];
			}
			
		}
		return result;
	}
	
	public static int removeDuplicateCount(int[]arr) {
		if(arr.length==0) {
			return 0;
		}
		
		int i=0;
		
		for(int j=1; j<arr.length; j++) {
			
			if(arr[j] !=arr[i]) {
				i++;
				arr[i]=arr[j];
			}
		}
		return i+1;
	}
	
	
	public static int maxProfit(int[] arr) {
		int minPrice=0;
		int maxPrice=0;
		
		for(int temp:arr) {
			if(temp<minPrice) {
				minPrice=temp;
			}else if(temp-minPrice>maxPrice) {
				maxPrice=temp-minPrice;
			}
		}
		return maxPrice;
	}
	
	public static int[] twoSum(int[] num, int target) {
		int n=num.length;
		
		int[] result;
		for(int i=0; i<n; i++) {
			
			for(int j=1+1; j<n;j++) {
				
				if(num[i]+num[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		 throw new IllegalArgumentException("No two sum solution found");
	}
	
	public static boolean searchArry(int[] num,int search) {
		
		for(int i=0; i<num.length; i++) {
			
			if(num[i]==search) {
				return true;
			}
		}
		return false;
	}
	
	public static String maxTwoProducts(int[] product) {
		
		int max=0;
		String pairs="";
		
		for(int i=0; i<product.length; i++) {
			for(int j=i+1; j<product.length; j++) {
				if(product[i]*product[j]>max) {
					max=product[i]*product[j];
					pairs=Integer.toString(product[i])+","+Integer.toString(product[j]);
				}
			}
		}
		return pairs;
		

	}
	
	public static boolean uniqueArray(int[] arr) {
		boolean unique;
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] ==arr[j]) {
					return unique=false;
				}
			}
		}
		return true;
	}
	
	public static boolean premutation(int[]arr1,int[]arr2) {
		
		if(arr1.length != arr2.length) {
			return false;
		}
		
		int sum1=0;
		int sum2=2;
		
		int product1=0;
		int product2=0;
		
		for(int i=0; i<arr1.length; i++) {
			
			sum1+=arr1[i];
			sum2+=arr2[i];
			product1*=arr1[i];
			product2*=arr2[i];
			
		}
		
		if(sum1==sum2 && product1==product2) {
			return  true;
		}else {
			return false;
		}
	}
	
	public static void spofArray(int[] arr) {
		int sum=0;
		int  product=1;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		for(int i=0; i<arr.length; i++) {
			product*=arr[i];
		}
	}
	
	public static void pairsArray(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.println(arr[i]+","+arr[j]);
			}
		}
	}

}
