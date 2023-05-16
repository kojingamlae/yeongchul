package Lv1;

public class 최대공약수와최소공배수 {
    public int[] solution(int n, int m) {
        int gcd;
        int lcm = (n*m);
        while(true) {
            int r = n % m;
            n = m;
            m = r;
            if (m==0) {
                gcd = n;
                break;
            }
        }
        lcm/=gcd;
        int[] answer = {gcd, lcm};
        return answer;
    }
}
