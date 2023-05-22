package Lv1;

public class 하샤드수 {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        String a = Integer.toString(x);
        String [] b = a.split("");
        for (String c : b) {
            sum+=Integer.parseInt(c);
        }
        if (x%sum!=0) {
            answer = false;
        }
        return answer;
    }
}
