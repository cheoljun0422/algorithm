package org.example.programmers;

import java.util.Arrays;

/*
정수 n이 매개변수로 주어질 때,
n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class NotEven {
    public int[] solution(int n) {
        int[] answer;
        int j = 0;

        if(n % 2 == 0) {
            answer = new int[n/2];
        } else {
            answer = new int[n/2 + 1];
        }
        for(int i = 0; i <= n; i++) {
            if(i % 2 == 1) {
                answer[j] = i;
                j++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        NotEven n = new NotEven();
        System.out.println(Arrays.toString(n.solution(13)));
    }
}
