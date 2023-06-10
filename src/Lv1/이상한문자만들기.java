package Lv1;

public class 이상한문자만들기 {
    public String solution(String s) {
        String answer = "";
        String[] a = s.split("");
        int cnt = 0;
        for (int i=0; i<a.length; i++) {
            if (a[i].equals(" ")) cnt = 0;
            else if (cnt%2==0) {
                a[i] = a[i].toUpperCase();
                cnt++;
            }
            else {
                a[i] = a[i].toLowerCase();
                cnt++;
            }
            answer+=a[i];
        }
        return answer;
    }
}
