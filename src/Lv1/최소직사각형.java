package Lv1;

public class 최소직사각형 {

    public int solution(int[][] sizes) {
        int wmax = -1;
        int hmax = -1;
        for (int i=0; i<sizes.length; i++) {
            if (sizes[i][0]<sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        for (int i=0; i<sizes.length; i++) {
            if(wmax<sizes[i][0]) {
                wmax = sizes[i][0];
            }
            for(int j=0; j<sizes[i].length; j++) {
                if(hmax<sizes[i][1]) {
                    hmax = sizes[i][1];
                }
            }
        }
        int answer = wmax * hmax;
        return answer;
    }
}
