package datastructures.arraysandstrings;

import java.util.HashSet;

public class RemoveChars {

	public static String removeChars(String origString, String charsToRemove) {
		HashSet charSet = new HashSet<>();
		for(int i = 0; i < charsToRemove.length(); i++) {
			charSet.add(charsToRemove.charAt(i));
		}
		StringBuilder origStringBuilder = new StringBuilder();
		for(char c : origString.toCharArray()) {
			if(!charSet.contains(c)) {
				origStringBuilder.append(c);
			}
		}
		return origStringBuilder.toString();
	}
	public static void main(String[] args) {
		System.out.println(removeChars("Battle of the Vowels: Hawaii vs. Grozny", "aeiou"));
		int r = 3/2;
		System.out.println(r);
		int x =12;
		int m=1;
		while( (x&m) != 0)
		  {
		    x = x^m;
		    m <<= 1;
		  }
		 
		  /* flip the rightmost 0 bit */
		  x = x^m;
		  int k=0;
		  int res= x&0;
		  System.out.println(res);

	}


}
