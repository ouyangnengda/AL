package Leetcode;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月11日 18:55:00
 **/
public class Leetcode_6_Convert {
    public static void main(String[] args) {
        System.out.println(convert("1", 3));
        System.out.println(convert("12", 3));
        System.out.println(convert("123", 3));
        System.out.println(convert("1234", 3));
        System.out.println(convert("12345", 3));
        System.out.println(convert("123456", 3));
        System.out.println(convert("1234567", 3));
        System.out.println(convert("12345678", 3));
        System.out.println(convert("123456789", 3));
    }

    public static  String convert(String s, int numRows) {

        if (numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                ret.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
                    ret.append(s.charAt(j + cycleLen - i));
            }
        }
        return ret.toString();
    }
}
