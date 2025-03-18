package leetcode;

public class leet1863 {

    // Helper function to recursively generate subsets and calculate their XOR total
    private static void calculateXORSum(int[] nums, int index, int currentXOR, int[] result) {
        if (index == nums.length) {
            result[0] += currentXOR;
            return;
        }

        // Include the current element in the subset and XOR
        calculateXORSum(nums, index + 1, currentXOR ^ nums[index], result);

        // Exclude the current element from the subset
        calculateXORSum(nums, index + 1, currentXOR, result);
    }

    public static int subsetXORSum(int[] nums) {
        int[] result = {0};
        calculateXORSum(nums, 0, 0, result);
        return result[0];
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {5, 1, 6};
        int[] nums3 = {3, 4, 5, 6, 7, 8};

        System.out.println(subsetXORSum(nums1)); // Output: 6
        System.out.println(subsetXORSum(nums2)); // Output: 28
        System.out.println(subsetXORSum(nums3)); // Output: 480
    }
}
