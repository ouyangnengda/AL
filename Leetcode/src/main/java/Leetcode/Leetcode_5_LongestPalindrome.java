package Leetcode;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月09日 22:43:00
 **/
public class Leetcode_5_LongestPalindrome {
    public static void main(String[] args) {

    }
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        String maxLength = "";
        for (int i = 0; i < s.length(); i++) {
            String left = leftPalindrome(s, i);
            if (maxLength.length() < left.length()) {
                maxLength = left;
            }
        }
        return maxLength;
    }

    public static String leftPalindrome(String s, int i) {
         return "";
    }
}
