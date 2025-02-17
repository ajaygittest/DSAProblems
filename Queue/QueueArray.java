package Queue;

public class QueueArray {

	int[] arr;
	int topOfQueue;
	int beginningOfQueue;
	
	public QueueArray(int size) {
		this.arr=new int[size];
		this.topOfQueue=-1;
		this.beginningOfQueue=-1;
		
		System.out.println("Queue is SucessFully created with size of: "+size);
	}
	
	public boolean isFull() {
		if(topOfQueue == arr.length-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if((beginningOfQueue ==-1) || (beginningOfQueue == arr.length)){
			return true;
		}else {
			return false;
		}
	}
	
	public void enQueue(int value) {
		if(isFull()) {
			System.out.println("Queue is Full");
		}else if(isEmpty()){
			beginningOfQueue=0;
			topOfQueue++;
			arr[topOfQueue]=value;
			System.out.println("SucessFully inserted value in the Queue "+value);
			
		}else {
			topOfQueue++;
			arr[topOfQueue]=value;
			System.out.println("SucessFully inserted value in the Queue "+value);
			
		}
	}
	
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}else {
			int result=arr[beginningOfQueue];
			beginningOfQueue++;
			if(beginningOfQueue > topOfQueue) {
				beginningOfQueue=topOfQueue=-1;
			}
			return result;
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}else {
			
			return arr[beginningOfQueue];
		}
	}
	
	public void deleteQueue() {
		arr=null;
		System.out.println("Queue is SuccessFully deleted");
	}
}
