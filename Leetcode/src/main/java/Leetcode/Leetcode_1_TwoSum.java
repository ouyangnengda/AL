package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月05日 22:59:00
 **/
public class Leetcode_1_TwoSum {
    public static void main(String[] args) throws IllegalAccessException {
        for (int i : twoSum(new int[] {1, 1}, 2)) {
            System.out.print(i + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target){
        if (nums == null || nums.length == 1) {
            return nums;
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int i;
        for (i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return nums;
    }
}
