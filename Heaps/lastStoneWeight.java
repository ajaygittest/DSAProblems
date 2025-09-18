package Heaps;

import java.util.PriorityQueue;

public class lastStoneWeight {
    
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((a,b)->b-a);

        for(int n:stones){
            maxHeap.add(n);
        }


        while(maxHeap.size()>1){
            int y=maxHeap.poll();
            int x=maxHeap.poll();

            if(x!=y){
                maxHeap.add(y-x);
            }
        }
        return maxHeap.isEmpty()?0:maxHeap.poll();
        
    }
}