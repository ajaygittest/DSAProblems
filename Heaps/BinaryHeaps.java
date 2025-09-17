package Heaps;

public class BinaryHeaps {

	int arr[];
	int sizeOfTree;

	public BinaryHeaps(int size) {
		arr = new int[size + 1];
		this.sizeOfTree = 0;
		System.out.println("Binary Heap has been created");
	}

	public boolean isEmpty() {

		return sizeOfTree == 0;
	}

	public int peek() {

		if (isEmpty()) {
			System.out.println("Binary Heap is Empty");
			return -1;

		}
		return arr[1];

	}

	public int sizeOfBP() {
		return sizeOfTree;
	}

	public void levelOrder() {
		
		if(isEmpty()) {
			System.out.println("Heap is Empty");
			return;
		}
		
		for (int i = 1; i <= sizeOfTree; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}

	public void heapifyBottomToTop(int index, String heapType) {
		int parent = index / 2;
		if (index <= 1) {
			return;
		}

		if (heapType.equals("Min")) {
			if (arr[index] < arr[parent]) {
				Swap(index, parent);
				heapifyBottomToTop(parent, heapType);
			}
		} else if (heapType.equals("Max")) {
			if (arr[index] > arr[parent]) {
				Swap(index, parent);
				heapifyBottomToTop(parent, heapType);

			}
		}

	}

	public void heapifyTopToBottom(int index, String heapType) {
		int left = index * 2;
		int right = index * 2 + 1;
		int swapChild = 0;
		if (sizeOfTree < left) {
			return;
		}

		if (heapType == "Max") {
			if (sizeOfTree == left) {
				if (arr[index] < arr[left]) {
					Swap(index, left);
				}
				return;
			} else {
				if (arr[left] > arr[right]) {
					swapChild = left;
				} else {
					swapChild = right;
				}

				if (arr[index] < arr[swapChild]) {
					Swap(index, swapChild);
				}
			}
		} else if (heapType == "Min") {
			if (sizeOfTree == left) {
				if (arr[index] > arr[left]) {
					Swap(index, left);
				}
				return;
			} else {
				if (arr[left] < arr[right]) {
					swapChild = left;
				} else {
					swapChild = right;
				}

				if (arr[index] > arr[swapChild]) {
					Swap(index, swapChild);
				}
			}
		}
		heapifyTopToBottom(swapChild, heapType);
	}
	
	public int extractHeap(String heapType) {
		if(isEmpty()) {
			return -1;
		}
		else {
			int extractedValue=arr[1];
			arr[1]=arr[sizeOfTree];
			sizeOfTree--;
			heapifyTopToBottom(1, heapType);
			return extractedValue;
		}
		
	}

	public void insert(int value, String typeHeap) {
		arr[sizeOfTree + 1] = value;
		sizeOfTree++;
		heapifyBottomToTop(sizeOfTree, typeHeap);
		System.out.println("Inserted " + value + " Successfully in Heap");
	}
	
	public void deleteHeap() {
		arr=null;
		sizeOfTree=0;
		System.out.println("Binary Heaps has been deleted");
	}

	private void Swap(int index, int parent) {
		int temp = arr[index];

		arr[index] = arr[parent];
		arr[parent] = temp;
	}

}
