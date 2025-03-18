package leetcode;

public class leet523 {
	public static boolean checkSubarraySum(int[] nums, int k) {
		for(int i=0; i<nums.length; i++) {
			for(int j=nums.length; j>i; j--) {
				int sum = 0;
				while(j>=i) {
					sum = sum+nums[j];
					j--;
				}
				if(sum%k == 0) {
					return true;
				}
			}
		}
		// i=2 .. j=5
		return false;
	}

	public static void main(String[] args) {
		int[] nums1 = { 23, 2, 4, 6, 7 };
		int[] nums2 = { 23, 2, 6, 4, 7 };
		int[] nums3 = { 23, 2, 6, 4, 7 };

		System.out.println(checkSubarraySum(nums1, 6));
		System.out.println(checkSubarraySum(nums2, 6));
		System.out.println(checkSubarraySum(nums3, 13));
	}
}
