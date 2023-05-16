package Lv1;

public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        for (int i=100000000; i>0; i/=10) {
            answer+=n/i;
            n=n%i;
        }
        return answer;
    }
}
