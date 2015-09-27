package algorithms.dynamicprogramming;

public class KnapSack {

	public static int findMaxValueRecursive(int weight, int[] weightArray, int[] value, int size) {
		if(size ==0 || weight == 0) {
			return 0;
		}
		
		if(weightArray[size-1] > weight) {
			return findMaxValueRecursive(weight, weightArray, value, size-1);
		}
		
		return Math.max(findMaxValueRecursive(weight-weightArray[size-1], weightArray, value, size-1) + value[size-1], findMaxValueRecursive(weight, weightArray, value, size-1));
		
	}
	
	public static int findMaxValueDP(int weight, int[] weightArray, int[] value, int size) {
		int[][] arr = new int[size+1][weight+1];
		
		for(int i=0; i<=size; i++) {
			for(int w=0; w<=weight;w++) {
				if(i==0 || w==0) {
					arr[i][w] = 0;
				}
				else if(weightArray[i-1] > w) {
					arr[i][w] = arr[i-1][w];
				}
				else {
					arr[i][w] = Math.max(value[i-1] + arr[i-1][w-weightArray[i-1]], arr[i-1][w]);
				}
			}
		}
		return arr[size][weight];
	}
	public static void main(String[] args) {
		int val[] = {60, 100, 120};
	    int wt[] = {10, 20, 30};
	    int  W = 50;
	    System.out.println(findMaxValueRecursive(W, wt, val, val.length));
	    System.out.println(findMaxValueDP(W, wt, val, val.length));

	}

}
