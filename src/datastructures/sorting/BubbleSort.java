package datastructures.sorting;

public class BubbleSort {

	public static void sort(int[] arr) {
		for(int i=0; i<arr.length-1;i++) {
			for(int j=0; j<arr.length - i -1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static void checkValue(Integer a, Integer b) {
		int temp = a.intValue(); 
		int bVal = b.intValue();
		//a. = b.;
		b = temp;
		System.out.println(a);
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,5,6,7,3,4};
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		Integer a = 3;
		Integer b = 4;
		checkValue(a,b);
		System.out.println(a);
		System.out.println(b);

	}

}
