package datastructures.arraysandstrings;

public class MajorityElement {
	
	public static int findMajorityElement(int[] arr) {
		//Moores Voting Algorithm
		int maj_index = 0, count = 1;
		for(int i=1;i<arr.length;i++) {
			if(arr[maj_index] == arr[i]) {
				count++;
			}
			else {
				count--;
			}
			if(count == 0) {
				maj_index = i;
				count = 1;
			}
		}
		
		count = 0;
		
		//check if this element is the majority element
		for(int i=0; i<arr.length;i++) {
			if(arr[maj_index] == arr[i]) {
				count++;
			}
		}
		
		if(count > arr.length/2) {
			System.out.println("Found Majority Element");
			return arr[maj_index];
		}
		System.out.println("Did not find Majority Element");
		return 0;
		
	}

	
	public static void main(String[] args) {
		int[] arr = {1,3,3,1,2};
		System.out.println(findMajorityElement(arr));

	}

}
