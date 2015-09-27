package datastructures.arraysandstrings;

public class RotateArray {

	public static void rotate(int[] arr, int d) {
		int size = arr.length;
		reverse(arr, 0, d-1);
		reverse(arr, d, size-1);
		reverse(arr, 0, size-1);
	}

	public static void reverse(int[] arr, int low, int high) {
		while(low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,1,2};
		rotate(arr, 4);
		int result = arr[0];
		for(int i=1; i<arr.length; i++) {
			result ^= arr[i];
		}
		System.out.println(result);
	}
	
}

