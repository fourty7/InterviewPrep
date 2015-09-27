package datastructures.sorting;

public class MergeSort {

	public static void sort(int[] arr, int low, int high) {
		if(low<high) {
		
			int mid = low + (high-low)/2;
			
			sort(arr, low, mid);
			sort(arr, mid+1, high);
			
			merge(arr, low, mid, high);
		}
	}	
	
	private static void merge(int[] arr, int low, int mid, int high) {
		int size1 = mid - low + 1;
		int size2 = high - mid;
		
		int[] tempArr1 = new int[size1];
		int[] tempArr2 = new int[size2];
		
		for(int i=0; i<size1; i++) {
			tempArr1[i] = arr[low+i];
		}
		
		for(int i=0; i<size2; i++) {
			tempArr2[i] = arr[mid+i+1];
		}
		
		int i = 0;
		int j = 0;
		int k = low;
		
		while(i<size1 && j<size2) {
			if(tempArr1[i] <= tempArr2[j]) {
				arr[k] = tempArr1[i];
				i++;
			}
			else {
				arr[k] = tempArr2[j];
				j++;
			}
			k++;
		}
		
		while(i<size1) {
			arr[k] = tempArr1[i];
			i++;
			k++;
		}
		
		while(i<size2) {
			arr[k] = tempArr2[j];
			j++;
			k++;
		}		
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,5,6,7,3,4};
		sort(arr, 0, arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
