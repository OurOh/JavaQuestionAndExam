package Chap02.Number06;

public class MaxCounter {

    private int count = 0;
    private int max;

    //생성자
    public MaxCounter(int max){
        this.max = max;
    }

    public void increment() {
        if(count >= max){
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;
    }

    public int getCount() {
        return count;
    }
}