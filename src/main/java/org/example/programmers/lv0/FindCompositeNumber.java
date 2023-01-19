package org.example.programmers.lv0;
/*
약수의 개수가 세 개 이상인 수를 합성수라고 합니다.
자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.
 */
public class FindCompositeNumber {
    public int solution(int n) {
        int answer = 0;
        int tmp = 0;
        for (int i = 1; i <= n; i++) {
            tmp = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    tmp++;
                }
            }
            if (tmp >= 3) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FindCompositeNumber f = new FindCompositeNumber();
        System.out.println(f.solution(10));
    }
}
