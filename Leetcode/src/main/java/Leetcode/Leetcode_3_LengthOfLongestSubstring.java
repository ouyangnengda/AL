package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月06日 22:40:00
 **/
public class Leetcode_3_LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcd"));
        System.out.println(lengthOfLongestSubstring("aaaa"));
        System.out.println(lengthOfLongestSubstring("aabb"));
        System.out.println(lengthOfLongestSubstring("accb"));
        System.out.println(lengthOfLongestSubstring("a"));
        System.out.println(lengthOfLongestSubstring("aa"));
        System.out.println(lengthOfLongestSubstring("ab"));
        System.out.println(lengthOfLongestSubstring("abac"));
        System.out.println(lengthOfLongestSubstring(""));
        System.out.println(lengthOfLongestSubstring("abba"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

}
