package Lv1;

public class 없는숫자더하기 {
    public int solution(int[] numbers) {
        int answer = 45;
        for (int i=0; i<numbers.length; i++) {
            for (int j=0; j<10; j++) {
                if (numbers[i]==j) answer-=j;
            }
        }
        return answer;
    }
}
