package Kunal;

import java.util.Arrays;
import java.util.Iterator;

public class CustomArray<T> {
	
	private Object[] data;
	
	private int size=0;
	
	private int DEFAULT_SIZE=10;
	
	
	public CustomArray() {
		this.data=new Object[DEFAULT_SIZE];
	}
	
	
	public void add(T num) {
		
		if(isFull()) {
			resize();
		}
		data[size++]=num;
	}


	private void resize() {
		Object[] temp= new Object[data.length*2];
		
		for(int i=0; i<data.length; i++) {
			
			temp[i]=data[i];
		}
		
	}
	
	public T remove() {
		
		T remove=(T)data[size--];
		return remove;
	}


	@Override
	public String toString() {
		return "CustomArray [data=" + Arrays.toString(data) + ", size=" + size + ", DEFAULT_SIZE=" + DEFAULT_SIZE + "]";
	}


	private boolean isFull() {
		
		return size==data.length;
	}

}
