package Lv1;

public class 핸드폰번호가리기 {
    public String solution(String phone_number) {
        String answer = "";
        int a = phone_number.length()-4;
        int b = phone_number.length();
        String c = phone_number.substring(a,b);
        for (int i=0; i<phone_number.length()-4; i++) {
            answer+="*";
        }
        return answer+c;
    }
}
