package Leetcode;

/**
 * @Description: 判断一个数是否是回文数
 * @Author: 欧阳能达
 * @Created: 2019年09月21日 20:25:00
 **/
public class Leetcode_9_IsPalindrome {
    public static void main(String[] args) {
        System.out.println("-1 : " + isPalindrome(-1));
        System.out.println("-122 : " + isPalindrome(-122));
        System.out.println("0 : " + isPalindrome(0));
        System.out.println("12 : " + isPalindrome(12));
        System.out.println("121 : " + isPalindrome(121));
        System.out.println("2323 : " + isPalindrome(2323));
        System.out.println("23432 : " + isPalindrome(23432));
    }

    public static boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        int index = 0;
        while (sb.charAt(index) == sb.charAt(sb.length() - 1 - index)) {
            if (index >= (sb.length()/2 - 1)) {
                return true;
            }
            index = index + 1;
        }
        return false;
    }
}
