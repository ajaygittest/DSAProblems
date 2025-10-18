package Own;

public class KthElementOfTwoArray {
	
	public int kthElement(int a[], int b[], int k) {
        // code here
		
		
		int i=0;
		int j=0;
		int count=0;
		while(i<a.length && j<b.length) {
			int val=0;
			if(a[i]<b[j]) {
				val=a[i++];
			}else {
				val=b[j++];
			}
			count++;
			
			if(count==k) {
				return val;
			}
			
			
		}
		
		while(i<a.length) {
			count++;
			if(count==k) {
				return a[k];
			}
			i++;
		}
		while(j<b.length) {
			count++;
			if(count==k) {
				return a[k];
			}
			j++;
		}
        return -1;
    }

}
