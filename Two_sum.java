import java.util.HashMap;
import java.util.Map;

public class Two_sum {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store elements and their indices
        HashMap<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                // Found a valid pair
                return new int[]{numToIndex.get(complement), i};
            }
            numToIndex.put(nums[i], i);
        }

        // No valid pair found
        return null;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        Two_sum solution = new Two_sum();
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Output for nums1: [" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Output for nums2: [" + result2[0] + ", " + result2[1] + "]");
    }
}
