package Lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class 수포자 {
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
            Arrays.sort(cnt);
            ArrayList<Integer> answer = new ArrayList<Integer>();
            for (int i=0; i<3; i++) {
                if (cnt[i]==cnt[2]) answer.add(i+1);
            }
            // 0 -> 1, 1 -> 2, 2 -> 3
            // m1 -> 3, m2 -> 2, m3 -> 1
            int[] end = answer.stream().mapToInt(i -> i).toArray();
            return end;
    }
}
