package Lv1;

import java.util.ArrayList;

public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] cnt = {0,0,0};
        int[] m1 = {1,2,3,4,5};
        int[] m2 = {2,1,2,3,2,4,2,5};
        int[] m3 = {3,3,1,1,2,2,4,4,5,5};
        for (int i=0; i<answers.length; i++) {
            if (answers[i]==m1[i%5]) cnt[0]++;
            if (answers[i]==m2[i%8]) cnt[1]++;
            if (answers[i]==m3[i%10]) cnt[2]++;
        }
        int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i=0; i<3; i++) {
            if (cnt[i]==max) answer.add(i+1);
        }
        int[] end = answer.stream().mapToInt(i -> i).toArray();
        return end;
    }
}
