package DSA.DSAProblems.Graphs;

public class FloodFill {

	public int[][] flood(int[][] image,int src, int sc, int color){
		
		int oldColor=image[src][sc];
		int row=image.length;
		int col=image[0].length;
		
		if(color !=oldColor) {
			dfs(src,sc,row,col,image,color,oldColor);
				
			
		}
		
		return image;
	}

	private void dfs(int src, int sc, int row, int col, int[][] image, int color, int oldColor) {
		if (src < 0 || sc < 0 || sc >= row || sc >= col || image[src][sc] != oldColor) {
			return;
		}

		image[src][sc] = color;

		dfs(src - 1, sc, row, col, image, color, oldColor);
		dfs(src + 1, sc, row, col, image, color, oldColor);
		dfs(src, sc + 1, row, col, image, color, oldColor);
		dfs(src, sc - 1, row, col, image, color, oldColor);

	}

}
