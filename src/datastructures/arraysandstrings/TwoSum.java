package datastructures.arraysandstrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int[] result = new int[2];
        for(int i= 0; i<nums.length; i++) {
            if(hashMap.containsKey((target - nums[i]))) {
            	result[0] = hashMap.get((target - nums[i])) + 1;
            	result[1] = i+1;
            	return result;
            }
            else {
            	hashMap.put(nums[i], i);
            }
        }
        return result;
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 18;
		TwoSum newSum = new TwoSum();
		int[] result = newSum.twoSum(nums, target);
		for(int i = 0; i<result.length; i++) {
			System.out.println(result[i]);
		}

	}

}
