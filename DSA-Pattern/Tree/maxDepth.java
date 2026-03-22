package Tree;

import java.util.LinkedList;
import java.util.Queue;



public class maxDepth {
	
	//DFS
	
	public static int maxDepth(TreeNode root) {
		
		if(root==null) {
			return 0;
		}
		
		
		int left=maxDepth(root.left);
		int right=maxDepth(root.right);
		
		return Math.max(left, right)+1;
	}
	
	
	//BFS
	
	public static int maxDepthBFS(TreeNode root) {
		
		if(root==null) {
			return 0;
		}
		
		
		Queue<TreeNode> queue=new LinkedList<>();
		
		queue.add(root);
		
		int max=0;
		
		while(!queue.isEmpty()) {
			
			int size=queue.size();
			
			
			
			for(int i=0; i<size; i++) {
				
				TreeNode node=queue.poll();
				
				if(node.right !=null) {
					queue.add(node.right);
				}
				if(node.left !=null) {
					queue.add(node.left);
				}
			}
			max++;
			
			
			
			
		}
		
		return max;
		
		
	}

}
