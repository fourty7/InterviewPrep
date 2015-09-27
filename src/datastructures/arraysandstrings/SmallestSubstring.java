package datastructures.arraysandstrings;

import java.util.HashMap;
import java.util.Map;

public class SmallestSubstring {

	public String findSubstring(String text, char[] arr) {
		int startIndex = 0, endIndex=0;
		Map<Character, Integer> charMap = new HashMap();
		int value = 0;
		for(Character c : arr) {
			if(charMap.containsKey(c)) {
				value = charMap.get(c);
			}
			charMap.put(c, value+1);
		}
		
		
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
