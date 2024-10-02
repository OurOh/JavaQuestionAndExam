package Chap01.number05;

public class ForEx03 {

    public static void main(String[] args) {

        int max = 100;

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("합계:" + sum);
    }
}
