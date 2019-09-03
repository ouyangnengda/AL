package TX;

import java.util.Scanner;

/**
 * @Description: 搬运工搬箱子。搬运工需要把同一楼层中每个房间的若干箱子搬出去，搬运工每一步只能做两个操作，
 * 要不向前移动一步，要不把当前房间的一个箱子搬走。第一行两个数：房间个数，搬运工个数。第二行表示每个房间的箱子数量。
 * 求搬运工把箱子全部搬走所需要的最少步数？
 * @Author: 欧阳能达
 * @Created: 2019年09月02日 15:50:00
 **/
public class CarryingBox {
    public static void main(String[] args) {
        test();
    }
    private static void test() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        int[] room = new int[n+1];
        room[0] = 0;
        for (int i = 1; i < n+1; i++) {
            room[i] = input.nextInt();
        }

        System.out.println(carryingBox(room, m));
    }

    private static int carryingBox(int[] room, int m) {
        int[] step = new int[room.length];
        step[0] = m;
        int sumStep = 0;
        int left = 0;
        int right = 0;
        while (true) {
            for (int i = left; i <= right; i++) {


                //如果这是第一步
                if (room[i] == 0) {
                    step[i+1] = step[i];
                    step[i] = 0;
                    left = 1;
                    right = 1;
                    ++sumStep;
                    break;
                } else {
                    if (step[i] <= room[i]) {
                        room[i] = room[i] - step[i];
                    } else {
                        room[i] = 0;
                        step[i+1] = step[i] - room[i];
                    }
                }
            }
            if (room[room.length-1] == 0) {
                return sumStep;
            }
        }
    }
}
