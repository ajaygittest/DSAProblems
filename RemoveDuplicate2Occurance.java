package Sample;

public class RemoveDuplicate2Occurance {
	
	public static void main(String args[]) {
	reverseString("Madam0l:{}");
	}
	
	
	  public int removeDuplicates(int[] nums) {
	        
	      if (nums.length <= 2) return nums.length;
	       int index = 2;

	        for (int i = 2; i < nums.length; i++) {
	            
	            if (nums[i] != nums[index - 2]) {
	                nums[index] = nums[i];
	                index++;
	            }
	        }
	        return index;
	    }
	  
	  public static void reverseString(String input)
	  {
		  String reverse="";
		  input = input.replaceAll("[^A-Za-z0-9]", "");
		  System.out.println(input);
		  for(int i=input.length()-1; i>=0; i--) {
			  reverse+=input.charAt(i);
			  
		  }
		  
		  System.out.println(reverse.equalsIgnoreCase(input));
		  System.out.println(reverse);
	  }
}
