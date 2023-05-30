package Lv1;

public class 푸드파이트대회 {
    public String solution(int[] food) {
        String answer = "";
        for (int i=1; i<food.length; i++)
        {
            for (int j=0; j<food[i]/2; j++)
            {
                answer+= Integer.toString(i);
            }
        }
        StringBuffer sb = new StringBuffer();
        sb.append(answer);
        answer+='0';
        answer+=sb.reverse();
        return answer;
    }
}
