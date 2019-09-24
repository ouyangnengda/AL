package Leetcode;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月24日 21:05:00
 **/
public class Leetcdoe_58_LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(""));
        System.out.println(lengthOfLastWord(""));
        System.out.println(lengthOfLastWord(" a "));
        System.out.println(lengthOfLastWord(" a b "));
        System.out.println(lengthOfLastWord("ab"));
        System.out.println(lengthOfLastWord(" a"));
        System.out.println(lengthOfLastWord("a "));
        System.out.println(lengthOfLastWord(" a"));
    }
    public static int lengthOfLastWord(String s) {
        if (s.isEmpty() || s == null) {
            return 0;
        }
        String ss = s.trim();
        String[] w = ss.split(" ");
        return w[w.length-1].length();
    }
}
