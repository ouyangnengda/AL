package Leetcode;

/**
 * @Description: 整数反转
 * @Author: 欧阳能达
 * @Created: 2019年09月21日 21:20:00
 **/
public class Leetcode_7_Reverse {
    public static void main(String[] args) {
        System.out.println("-12 : " + reverse(-12));
        /*System.out.println("-1 : " + reverse(-1));
        System.out.println("0 : " + reverse(0));
        System.out.println("1 : " + reverse(1));
        System.out.println("12 : " + reverse(12));
        System.out.println("123 : " + reverse(123));*/
        System.out.println("1534236469 : " + reverse(1534236469));

    }

    public static int reverse(int x) {
        if (-9 <= x && x <= 9) {
            return x;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(x));

        try {
            int i = sb.length();
            while (sb.charAt(i - 1) == '0') {
                sb.deleteCharAt(i - 1);
                i = i - 1;
            }

            char f = ' ';
            if (sb.charAt(0) == '-') {
                f = '-';
                sb.deleteCharAt(0);
            }

            sb.reverse();
            if (f == '-') {
                sb.insert(0, f);
            }

            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
