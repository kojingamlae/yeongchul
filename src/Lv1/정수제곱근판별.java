package Lv1;

public class 정수제곱근판별 {
    public long solution(long n) {
        long answer = 0;
        if(Math.pow((int)Math.sqrt(n), 2)==n) {
            answer = (long)Math.pow(Math.sqrt(n)+1, 2);
        } else return -1;
        return answer;
    }
}
