package leetcode;

import java.util.HashSet;

public class leet2441 {

	public static int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxK = -1;

        for(int num : nums) {
        	if(num>0 && set.contains(-num)) {
        		maxK = Math.max(maxK, num);
        	}
        	else if (num<0 && set.contains(-num)) {
				maxK = Math.max(maxK, -num);
			}
        	set.add(num);
        }
        
        return maxK;
    }

	public static void main(String[] args) {
		int[] nums1 = {-1,2,-3,3};
		int[] nums2 = {-1,10,6,7,-7,1};
		int[] nums3 = {-10,8,6,7,-2,-3};
		
		System.out.println(findMaxK(nums1));
		System.out.println(findMaxK(nums2));
		System.out.println(findMaxK(nums3));
	}
}