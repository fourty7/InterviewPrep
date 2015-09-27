package datastructures.arraysandstrings;

public class ReverseInteger {

	public static int reverse2(int x) {
		String str = Integer.toString(x);
		char[] arr = str.toCharArray();
		int start = 0;
		int end = str.length() - 1;
		while(start < end) {
			char temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			end--;
			start++;
		}
		
        return Integer.parseInt(new String(arr));
    }
	
	public static int reverse(int x) {
		int negFlag = 0;
		if(x < 0) {
			negFlag = 1;
			x *= -1;
		}
		String str = Integer.toString(x);
		StringBuilder sb = new StringBuilder(str);
		char[] arr = str.toCharArray();
		int start = 0;
		int end = str.length() - 1;
		while(start < end) {
			char temp = sb.charAt(end);
			sb.setCharAt(end, sb.charAt(start));
			sb.setCharAt(start, temp);
			end--;
			start++;
		}
		try {
			if(negFlag == 0) {	
				return Integer.parseInt(sb.toString());
			}
			else {
				return -1 * Integer.parseInt(sb.toString());
			}
		} catch(NumberFormatException e) {
			return 0;
		}
    }
	public static void main(String[] args) {
		int result = reverse(1534236469);
		int test = 00000001;
		System.out.println(test);
		System.out.println(result);

	}

}
