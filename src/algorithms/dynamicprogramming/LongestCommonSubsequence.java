package algorithms.dynamicprogramming;

public class LongestCommonSubsequence {

	public static int findLength(String s1, String s2) {
		//DP approach
		int[][] arr = new int[s1.length() + 1][s2.length() + 1];
		char[] firstString = s1.toCharArray();
		char[] secondString = s2.toCharArray();
		
		for(int i=0; i<=firstString.length;i++) {
			for(int j=0;j<=secondString.length;j++) {
				if(i==0 || j==0) {
					arr[i][j] = 0;
				}
				else if(firstString[i-1] == secondString[j-1]) {
					arr[i][j] = arr[i-1][j-1] + 1;
					System.out.println(firstString[i-1]);
				}
				else {
					if(arr[i-1][j] >= arr[i][j-1]) {
						arr[i][j] = arr[i-1][j];
					}
					else {
						arr[i][j] = arr[i][j-1];
					}
				}
			}
		}
		
		return arr[s1.length()][s2.length()];
	}
	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "cd";
		System.out.println(findLength(s1, s2));

	}

}
