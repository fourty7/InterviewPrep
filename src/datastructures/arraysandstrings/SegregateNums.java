package datastructures.arraysandstrings;

public class SegregateNums {

	public static void segregate(int[] arr) {
		int low=0, high = arr.length-1;
		while(low<high) {
			while(arr[low] == 0) {				
				low++;
			}
			
			while(arr[high] == 1) {
				high--;
			}
			if(low < high) {			
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				
				low++;
				high--;
			}
			
		}
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,0,2,0,1,2,1,2,0,1,0,2,0,0,1,1,2,2};
		segregate(arr);
		

	}

}
