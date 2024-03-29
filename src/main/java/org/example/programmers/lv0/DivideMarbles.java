package org.example.programmers.lv0;

import java.math.BigInteger;

/*
머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다.
머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때,
balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는
solution 함수를 완성해주세요.
 */
public class DivideMarbles {
    public int solution(int balls, int share) {
        BigInteger answer = method(balls).divide((method(balls-share).multiply(method(share))));
        return answer.intValue();
    }

    public BigInteger method(int num) {
        BigInteger b = new BigInteger("1");
        for (int i = 1; i <= num; i++) {
            b = b.multiply(new BigInteger(Integer.toString(i)));
        }
        return b;
    }

    public static void main(String[] args) {
        DivideMarbles d = new DivideMarbles();
        System.out.println(d.solution(3,2));
    }
}
