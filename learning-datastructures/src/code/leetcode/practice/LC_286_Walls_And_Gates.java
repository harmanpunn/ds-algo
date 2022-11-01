package code.leetcode.practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC_286_Walls_And_Gates {
	
	private static final int EMPTY = Integer.MAX_VALUE;
	private static final int GATE = 0;
	private static final int WALL = -1;
	private static final List<int[]> DIRECTIONS = Arrays.asList(
	        new int[] { 1,  0},
	        new int[] {-1,  0},
	        new int[] { 0,  1},
	        new int[] { 0, -1}
	);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] rooms = {{2147483647,-1,0,2147483647},{2147483647,2147483647,2147483647,-1},{2147483647,-1,2147483647,-1},{0,-1,2147483647,2147483647}};
		
		wallsAndGates2(rooms);
		
//		for(int i = 0; i < rooms.length; i++){
//            for(int j = 0; j < rooms[i].length; j++){
//                System.out.print(" " + rooms[i][j] + " ");
//            }
//            System.out.println();
//        }
		
		
	}
	
	public static void wallsAndGates(int[][] rooms) {
		if(rooms.length == 0) return;
		
		for(int row=0; row<rooms.length; row++) {
			for(int col=0; col<rooms[0].length; col++) {
				if(rooms[row][col] == EMPTY) {
					rooms[row][col] = distanceToNearestGate(rooms, row, col);
				}
			}
		}
		
	}
	
	// BFS from gates - to avoid TLE
	public static void wallsAndGates2(int[][] rooms) {
		int m = rooms.length;
		int n = rooms[0].length;
		Queue<int[]> q = new LinkedList<>();
		if(rooms.length == 0) return;
		
		for(int row=0; row<rooms.length; row++) {
			for(int col=0; col<rooms[0].length; col++) {
				if(rooms[row][col] == GATE) {
					q.add(new int[] {row, col});
				}
					
			}
		}
		
		while(!q.isEmpty()) {
			int[] curr = q.poll();
			int row = curr[0];
			int col = curr[1];
			
			for(int[] direction : DIRECTIONS) {
				 int r = row + direction[0];
		         int c = col + direction[1];
		         if(r<0 || c<0 || r>=m || c>=n || rooms[r][c] != EMPTY) {
		        	 continue;
		         }
		         rooms[r][c] =  rooms[row][col] + 1;
		         q.add(new int[] { r, c });
			}
			
			
 		}
		for(int i = 0; i < rooms.length; i++){
            for(int j = 0; j < rooms[i].length; j++){
                System.out.print(" " + rooms[i][j] + " ");
            }
            System.out.println();
        }
	}

	private static int distanceToNearestGate(int[][] rooms, int startRow, int startCol) {
		int m = rooms.length;
		int n = rooms[0].length;
		int[][] distance = new int[m][n];
		Queue<int[]> q = new LinkedList<>();
		
		q.add(new int[] {startRow, startCol});
		
		while(!q.isEmpty()) {
			int[] curr = q.poll();
			int row = curr[0];
			int col = curr[1];
			
			for(int[] direction : DIRECTIONS) {
				 int r = row + direction[0];
		         int c = col + direction[1];
		         if (r < 0 || c < 0 || r >= m || c >= n || rooms[r][c] == WALL || distance[r][c] != 0) {
		        	 continue;
		         }
		         distance[r][c] = distance[row][col] + 1;
		         if (rooms[r][c] == GATE) {
		        	 return distance[r][c];
		         }
		         
		         q.add(new int[] { r, c });
			}
			
		}
		return Integer.MAX_VALUE;
	}

}
