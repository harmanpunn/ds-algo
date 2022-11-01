package code.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class LC_529_Minesweeper {
	
	public static final List<int[]> DIRECTIONS  = Arrays.asList(
			new int[]{1,0},
	        new int[]{-1,-1},
	        new int[]{-1,1},    
	        new int[]{1,-1},
	        new int[]{1,1},
	        new int[]{-1,0},
	        new int[]{0,1},
	        new int[]{0,-1}
	    );

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] board = {	{'E','E','E','E','E'},
							{'E','E','M','E','E'},
							{'E','E','E','E','E'},
							{'E','E','E','E','E'}
						};
		int[] click = {3,0};
		
		System.out.println(Arrays.deepToString(updateBoard(board, click)));

	}
	
	public static char[][] updateBoard(char[][] board, int[] click) {
        int rows = board.length;
        int cols = board[0].length;

        Stack<int[]> s = new Stack<>();
       
        
        s.push(click);
        // Click Coordinates
        int a=click[0];
        int b=click[1];
        
        if (board[a][b] == 'B') {
            return board;
        }

        //Game over
        if(board[a][b] == 'M') {
            board[a][b] = 'X';
            return board;
        }

        while(!s.isEmpty()) {
        	List<int[]> list = new ArrayList<>();
            int[] curr = s.pop();
            
            int r = curr[0];
            int c = curr[1];
            int mineCount = 0;
            if(board[r][c] == 'M' || board[r][c] != 'E') {
            	continue;
            } else {
            	for(int[] adj : DIRECTIONS) {
                    int m = r + adj[0];
                    int n = c + adj[1];
                    if(m<0 || n<0 || m>=rows || n>=cols) {
                        continue;
                    }
                    
                    if(board[m][n] == 'M') {
                        mineCount++;
                    } 
                    if(mineCount == 0){
                    	list.add(new int[]{m,n});
                    }
                }
                if(mineCount > 0) {
                    board[r][c] = String.valueOf(mineCount).charAt(0);
                } else {
                    board[r][c] = 'B';
                    s.addAll(list);
                }
            }
            
        }

        return board;
        
    }

}
