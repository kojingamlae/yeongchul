package Lv1;

public class 하샤드수 {
        public boolean solution1(int x) {
            boolean answer = true;
            int sum=0;
            int n=x;
            for (int i=10000; i>0; i/=10) {
                sum+=x/i;
                x%=i;
            }
            if (n%sum!=0) {
                answer = false;
            }
            return answer;
        }

    public boolean solution2(int x) {
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
