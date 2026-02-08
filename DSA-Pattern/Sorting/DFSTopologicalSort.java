import java.util.List;
import java.util.Stack;

public class DFSTopologicalSort {
	
	
	public void topoSort(int v, List<List<Integer>>adj) {
		
		Stack<Integer> stack=new Stack<>();
		
		boolean[] visited=new boolean[v];
		
		for(int i=0; i<v; i++) {
			if(!visited[i]) {
				dfs(i,visited,adj,stack);
			}
		}
		
	}

	private void dfs(int i, boolean[] visited, List<List<Integer>> adj, Stack<Integer> stack) {
		
		
		visited[i]=true;
		for(int neigh:adj.get(i)) {
			
			if(!visited[neigh]) {
				dfs(neigh,visited,adj,stack);
			}
		}
		stack.push(i);
		
	}

}
