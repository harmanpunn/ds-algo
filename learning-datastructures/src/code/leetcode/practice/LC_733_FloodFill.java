package code.leetcode.practice;


public class LC_733_FloodFill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] image = {{1,1,1}, {1,1,0}, {1,0,1}};
		int sr=1, sc=1;
		int newColor = 2;
		
		floodFill(image, sr, sc, newColor);
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(image[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        fill(image, sr, sc, image[sr][sc], newColor);
        
        return image;
    }
    
    private static void fill(int[][] image, int sr, int sc, int color, int newColor) {
        
        if( sr < 0 || sc < 0  || sr >= image.length || sc >= image[0].length || image[sr][sc] != color) {
            return;
        }
        
        image[sr][sc] = newColor;
        fill(image, sr+1, sc, color, newColor);
        fill(image, sr-1, sc, color, newColor);
        fill(image, sr, sc+1, color, newColor);
        fill(image, sr, sc-1, color, newColor);
            
    }

}
