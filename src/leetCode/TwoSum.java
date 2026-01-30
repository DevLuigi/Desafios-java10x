package leetCode;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int[] result = twoSum(nums, 6);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> iteratedNums = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int calc = target - nums[i];

            if (iteratedNums.containsKey(calc)) {
                return new int[]{i, iteratedNums.get(calc)};
            }

            iteratedNums.put(nums[i], i);
        }

        return null;
    }
}
