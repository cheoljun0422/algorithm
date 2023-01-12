package org.example.programmers.lv0;

import java.util.Arrays;

/*
정수가 담긴 리스트 num_list가 주어질 때,
num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록
solution 함수를 완성해보세요.
 */
public class CountOddEven {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int even = 0;
        int odd = 0;

        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                System.out.println("even :" + num_list[i]);
                answer[0] = ++even;
                System.out.println("answer[0] :" + answer[0]);
                System.out.println("even :" + even);
            } else {
                System.out.println("odd :" + num_list[i]);
                answer[1] = ++odd;
                System.out.println("answer[1] :" + answer[1]);
                System.out.println("odd :" + odd);
            }
        }
//        answer[0] = even;
//        answer[1] = odd;
        return answer;
    }

    public static void main(String[] args) {
        CountOddEven c = new CountOddEven();
        int[] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(c.solution(a)));
    }
}
