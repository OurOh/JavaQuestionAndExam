package Chap01.number05;

public class ForEx02 {

    public static void main(String[] args) {

        int count = 0;

        for (int num = 0; count <= 10; num ++ ) {
            if (num % 2 == 0) {
                System.out.println(num);
                count++;
            }
        }
    }
}
