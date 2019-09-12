package Leetcode.动态规划;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月12日 21:47:00
 **/
public class MaxSubArray {
    public static void main(String[] args) {
        maxSubArray(new int[]{1,2,3});
    }
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int res = 0;
        for (int i : nums) {
            if (res > 0) {
                res += i;
            } else {
                res = i;
            }
            max = Math.max(res, max);
        }
        return max;
    }
}
