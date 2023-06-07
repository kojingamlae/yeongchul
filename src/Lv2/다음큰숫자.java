package Lv2;

public class 다음큰숫자 {
    public int solution(int n) {
        int answer = 0;
        for (int i=n+1; i<1000000; i++) {
            if (Integer.bitCount(i)==Integer.bitCount(n)) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
