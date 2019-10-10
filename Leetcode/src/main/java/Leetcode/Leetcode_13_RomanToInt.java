package Leetcode;
import	java.util.HashMap;

import java.util.Map;

/**
 * @Description: 罗马数字转整数
 * @Author: 欧阳能达
 * @Created: 2019年10月10日 17:44:00
 **/
public class Leetcode_13_RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("I") + " ： " + "1");
        System.out.println(romanToInt("V") + " ： " + "5");
        System.out.println(romanToInt("X") + " ： " + "10");
        System.out.println(romanToInt("L") + " ： " + "50");
        System.out.println(romanToInt("C") + " ： " + "100");
        System.out.println(romanToInt("D") + " ： " + "500");
        System.out.println(romanToInt("M") + " ： " + "1000");

        System.out.println(romanToInt("VI") + " ： " + "6");
        System.out.println(romanToInt("VIV") + " ： " + "9");
        System.out.println(romanToInt("IV") + " ： " + "4");
        System.out.println(romanToInt("IV") + " ： " + "4");
        System.out.println(romanToInt("IV") + " ： " + "4");
        System.out.println(romanToInt("MCMXCIV") + " ： " + "1994");
        System.out.println(romanToInt("LVIII") + " ： " + "58");
    }

    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Map<String, Integer> hashMap = new HashMap<> ();
        //建立hashMap集合
        hashMap.put("I", 1);
        hashMap.put("V", 5);
        hashMap.put("X", 10);
        hashMap.put("L", 50);
        hashMap.put("C", 100);
        hashMap.put("D", 500);
        hashMap.put("M", 1000);

        hashMap.put("IV", 4);
        hashMap.put("IX", 9);
        hashMap.put("XL", 40);
        hashMap.put("XC", 90);
        hashMap.put("CD", 400);
        hashMap.put("CM", 900);
        String[] a = s.split("");

        if (a.length == 1) {
            return hashMap.get(a[0]);
        }

        int result = 0;
        for (int i = 0; i < a.length; i++) {
            Integer zuhe = 0;
            if (i + 1 < a.length && (zuhe = hashMap.get(a[i] + a[i + 1])) != null) {
                a[i] = "0";
                a[i + 1] = "0";
                result += zuhe;
            }
            if (a[i] != "0") {
                result += hashMap.get(String.valueOf(a[i]));
            }
        }
        return result;
    }
}
