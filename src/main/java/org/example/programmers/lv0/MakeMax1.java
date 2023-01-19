package org.example.programmers.lv0;

import java.util.Arrays;

/*
정수 배열 numbers가 매개변수로 주어집니다.
numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
 */
public class MakeMax1 {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer = numbers[numbers.length -1] * numbers[numbers.length -2];
        return answer;
    }

    public static void main(String[] args) {
        MakeMax1 m = new MakeMax1();
        int[] a = {1,2,3,4,5};
        System.out.println(m.solution(a));
    }
}
