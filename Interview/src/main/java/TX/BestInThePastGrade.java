package TX;

import java.util.Scanner;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月02日 15:40:00
 **/
public class BestInThePastGrade {
    public static void main(String[] args) {

    }

    private static void test() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] day = new int[n];
        for (int i = 0; i < n; i++) {
            day[i] = input.nextInt();
        }
        System.out.println(bestInThePastGrade(day));
    }

    private static int bestInThePastGrade(int[] day) {

        //历史最好学习成绩
        int maxGrade = day[0];

        for (int i = 0; i < day.length; i++) {
            int nowGrade = 0;
            int min = 0;
            int sum = 0;
            for (int j = i; j >= 0; j--) {
                if (day[j] <= day[i]) {
                    min = day[j];
                }
                sum = sum + day[j];
                int grade = min * sum;
                if(grade > nowGrade) {
                    nowGrade = grade;
                }
            }

            if(nowGrade >= maxGrade) {
                maxGrade = nowGrade;
            }
        }
        return maxGrade;
    }
}
