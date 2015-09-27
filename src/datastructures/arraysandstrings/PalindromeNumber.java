package datastructures.arraysandstrings;

public class PalindromeNumber {

	public static boolean isPalindrome(int x) {
		String str = Integer.toString(x);
		System.out.println(x/2);
		StringBuilder sb = new StringBuilder(str);
		int start = 0;
		int end = str.length() - 1;
		while(start < end) {
			if (str.charAt(start) == str.charAt(end)) {
				start++;
				end--;
			}
			else {
				break;
			}
			
		}
		if(start >= end) {
			return true;
		}
        return false;
    }
	
	public static void checkValue(Integer test) {
		test = 5;
	}


	public static void main(String[] args) {
		System.out.println(isPalindrome(1234));
		
		Integer test = 4;
		checkValue(test);
		System.out.println(test);
	}

}
