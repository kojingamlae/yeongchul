package Lv2;

public class 최댓값과최솟값 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        int max=-2147000000;
        int min=2147000000;
        for (int i=0; i<str.length; i++) {
            max = Math.max(max, Integer.parseInt(str[i]));
            min = Math.min(min, Integer.parseInt(str[i]));
        }
        answer = Integer.toString(min)+" "+Integer.toString(max);
        return answer;
    }
}
