package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode {
    public static void main(String[] args) {
        int[] nums = { 3,2,3 };
        int[] resp = twoSum(nums, 6);

        for (int i = 0; i <= resp.length; i++) {
            System.out.println(resp[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complemento = target - nums[i];

            if (map.containsKey(complemento)) {
                return new int[]{ map.get(complemento), i };
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("Nenhuma solução encontrada");
    }
}