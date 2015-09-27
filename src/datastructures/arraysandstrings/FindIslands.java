package datastructures.arraysandstrings;

public class FindIslands {

	public static int countRectangularIslands(int[][] arr) {
		int count = 0;
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j] == 1) {
					if((i==0 || arr[i-1][j] == 0) && (j==0 || arr[i][j-1] == 0)) {
						count++;
					}
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[][] arr ={{1, 1, 0, 0, 0},
		        	  {1, 1, 0, 0, 0},
		        	  {0, 0, 0, 1, 1},
		        	  {0, 0, 0, 0, 0},
		        	  {1, 0, 1, 1, 1}
		    };
		
		System.out.println(countRectangularIslands(arr));

	}

}
