package org.example.programmers.lv0;

import java.util.Arrays;

/*
정수 배열 numbers가 매개변수로 주어집니다.
numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
인덱스가 배열의 크기보다 크거나 음수가 나온다면 예외를 발생시킨다. -> 배열 제대로 선언 line 12
 */
public class MakeArrayDouble {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        MakeArrayDouble m =new MakeArrayDouble();
        int[] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(m.solution(a)));
    }
}
