package TX;

import javax.swing.plaf.basic.BasicTabbedPaneUI;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description: 第i个人的满意度为ai*(i-1)+bi(n-i).n为最后那一个人的下标。求总的满意度最大为多少？
 * @Author: 欧阳能达
 * @Created: 2019年09月01日 21:29:00
 **/
public class WaitCoffee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger n = new BigInteger(input.next());

        BigInteger[] c = new BigInteger[n.intValue()];
        BigInteger sum = new BigInteger("0");
        for (BigInteger i = new BigInteger("0"); i.compareTo(n) < 0; i = i.add(new BigInteger("1"))) {
            BigInteger a = new BigInteger(input.next());
            BigInteger b = new BigInteger(input.next());
            sum = sum.add(b.multiply(n).subtract(a));
            c[i.intValue()] = a.subtract(b);
        }
        Arrays.sort(c);
        for (BigInteger i = new BigInteger("0"); i.compareTo(n) < 0; i = i.add(new BigInteger("1"))) {
            sum = sum.add(c[i.intValue()].multiply(i.add(new BigInteger("1"))));
        }
        System.out.println(sum);
    }


}
