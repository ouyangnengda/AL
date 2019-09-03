package TX;

import java.util.Scanner;

/**
 * @Description: 宝箱和钥匙。每一个宝箱上有一个数字，每一个钥匙上有一个整数，
 * 只有宝箱上的数字与钥匙上的数字相加之和为奇数这把钥匙才能打开宝箱，而且每个钥匙只能使用一次。
 * 第一行输入两个数字中间用空格隔开，第一个数字表示宝箱的数量，第二个数字表示钥匙的数量。
 * 接下来每一行都是这样的格式，求能打开宝箱的最大数目。
 * @Author: 欧阳能达
 * @Created: 2019年09月02日 15:01:00
 **/
public class BoxAndKey {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        Scanner input = new Scanner(System.in);
        long sumA = input.nextInt();
        long sumB = input.nextInt();

        long a1 = 0;
        long a2 = 0;
        for (long i = 0; i < sumA; i++) {
            if (input.nextInt() % 2 == 1) {
                ++a1;
            } else {
                ++a2;
            }
        }

        long b1 = 0;
        long b2 = 0;
        for (long i = 0; i < sumB; i++) {
            if (input.nextInt() % 2 == 1) {
                ++b1;
            } else {
                ++b2;
            }
        }
        System.out.println(Math.min(a1, b2) + Math.min(a2, b1));

    }
}
