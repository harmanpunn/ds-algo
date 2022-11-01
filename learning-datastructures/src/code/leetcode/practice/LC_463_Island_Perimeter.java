package code.leetcode.practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC_463_Island_Perimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		int[][] grid1 = {{1,1}};
		
		System.out.print("Perimeter:"+ islandPerimeter(grid1));

	}
	
	
	public static final List<int[]> DIRECTIONS  = Arrays.asList(
	        new int[]{1,0},
	        new int[]{-1,0},
	        new int[]{0,1},
	        new int[]{1,0}
	    );

	    public static int islandPerimeter(int[][] grid) {
	        int rows = grid.length;
	        int cols = grid[0].length;
	        int p = 0;
	        Queue<int[]> q = new LinkedList<>();

	        if(rows == 0) return 0;

	        for(int i=0; i<rows; i++) {
	            for(int j=0; j<cols; j++) {
	                if(grid[i][j] == 1) {
	                    q.add(new int[]{i,j});
	                }
	            }
	        }

	        while(!q.isEmpty()) {
	            int[] curr = q.poll();
	            int r = curr[0];
	            int c = curr[1];

	            for(int[] direction : DIRECTIONS) {
	                int m = r + direction[0];
	                int n = c + direction[1];
	                if(m<0) p+=1;
	                else if(n<0) p+=1;
	                else if(m>=rows) p+=1;
	                else if(n>=cols) p+=1;
	                else if(grid[m][n] == 1) continue;
	                else if(grid[m][n] == 0) p+=1;

	            }
	        }
	        return p;
	    }

}
