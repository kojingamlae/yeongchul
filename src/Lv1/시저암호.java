package Lv1;

public class 시저암호 {
    public String solution(String s, int n) {
        String answer = "";
        for (int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (ch<='Z') answer+=(char)('A'+(26+ch-'A'+n)%26);
            else if (ch<='z') answer+=(char)('a'+(26+ch-'a'+n)%26);
            else answer+=" ";
        }
        return answer;
    }
}
