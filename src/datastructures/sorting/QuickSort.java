package datastructures.sorting;

public class QuickSort {

	public static void sort(int[] arr, int low, int high) {
		if(low < high) {
			int p = partition(arr, low, high);
			
			sort(arr, low, p-1);
			sort(arr, p+1, high);
		}
	}
	private static int partition(int[] arr, int low, int high) {
		int lowIndex=low;
		int pivot = arr[high];
		
		int i=low;
		while(i<arr.length) {
			if(arr[i] < pivot) {
				int temp = arr[i];
				arr[i] = arr[lowIndex];
				arr[lowIndex] = temp;
				lowIndex++;
			}
			i++;
		}
		int temp2 = arr[lowIndex];
		arr[lowIndex] = pivot;
		arr[high] = temp2;
		
		return lowIndex;
	}
	public static void main(String[] args) {
		int[] arr = {9,8,7,6,5,4,3,2};
		sort(arr, 0, arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
