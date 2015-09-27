package algorithms.dynamicprogramming;

public class MinimumCostPath {

	public static int findMinPathRecursive(int[][] arr, int m, int n) {
		if(m < 0 || n < 0) {
			return Integer.MAX_VALUE;
		}
		if(m ==0 && n==0) {
			return arr[0][0];
		}		
		
		int leftCost = findMinPathRecursive(arr, m, n-1) ;
		int topCost = findMinPathRecursive(arr, m-1, n) ;
		int diagonalCost = findMinPathRecursive(arr, m-1, n-1);
		
		return Math.min(Math.min(leftCost, topCost), diagonalCost) + arr[m][n];
	}
	
	public static int findMinPathDP(int[][] costArray, int m, int n) {
		int[][] arr = new int[costArray.length][costArray.length];
		
		arr[0][0] = costArray[0][0];
		
		for(int i=1;i<arr.length;i++) {
			arr[i][0] = arr[i-1][0] + costArray[i][0];
		}
		
		for(int i=1;i<arr.length;i++) {
			arr[0][i] = arr[0][i-1] + costArray[0][i];
		}
		
		for(int i=1;i<arr.length;i++) {
			for(int j=1;j<arr.length; j++) {
				arr[i][j] = Math.min(arr[i-1][j], Math.min(arr[i][j-1], arr[i-1][j-1])) + costArray[i][j];
			}
		}
		
		return arr[m][n];
	}
	public static void main(String[] args) {
		int[][] arr = {{1,2,3}, {4,8,2}, {1,5,3}};
		System.out.println(findMinPathRecursive(arr, 2, 2));
		System.out.println(findMinPathDP(arr, 2, 2));

	}

}
