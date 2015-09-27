package datastructures.arraysandstrings;

public class MinimumPathSum {
	
	public static int minPathSum(int[][] grid) {
		if(grid == null) {
			return 0;
		}
		
		int numRows = grid.length;
		int numCols= grid[0].length;
		
		int[][] sumArray = new int[numRows][numCols];
		
		for(int i = 0; i<numRows; i++) {
			for(int j = 0; j<numCols; j++) {
				if(i >0 && j > 0) {
					sumArray[i][j] = Math.min(sumArray[i-1][j], sumArray[i][j-1]) + grid[i][j];
				}
				else if(i ==0 && j==0) {
					sumArray[i][j] = grid[i][j];
				}
				else if(i==0 && j>0) {
					sumArray[i][j] = sumArray[i][j-1] + grid[i][j];
				}
				else {
					sumArray[i][j] = sumArray[i-1][j] + grid[i][j];
				}
			}
		}
        return sumArray[numRows-1][numCols-1];
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] grid = new int[][] {
		        new int[] { 5, 2, 10 },
		        new int[] { 4, 11, 3 },
		        new int[] { 1, 8, 2 },
		    };
		
		System.out.println(minPathSum(grid));

	}

}
