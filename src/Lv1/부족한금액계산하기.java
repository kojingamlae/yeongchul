package Lv1;

public class 부족한금액계산하기 {
    public long solution(int price, long money, int count) {
        for (int i=1; i<=count; i++) {
            money-=price*i;
        }
        if (money>=0) {
            return 0;
        } else {
            return money*-1;
        }
    }
}
