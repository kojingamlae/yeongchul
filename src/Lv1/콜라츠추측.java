package Lv1;

public class 콜라츠추측 {
    public int solution(long num) {
        int answer = 0;
        if (num==1) {
            return 0;
        }
        while(num!=1) {
            if (num%2==0) {
                num/=2;
            }
            else {
                num*=3;
                num+=1;
            }
            answer++;
            if (answer>=500) {
                answer = -1;
                break;
            }
        }
        return answer;
    }
}
