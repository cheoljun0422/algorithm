package org.example.programmers.lv0;

import java.util.Arrays;

/*
정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다.
배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록
solution 함수를 완성해주세요.
 */
public class RotateArray {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if (direction.equals("right")) {
            for (int i = 1; i < numbers.length; i++) {
                answer[i] = numbers[i-1];
            }
            answer[0] = numbers[numbers.length-1];
        } else if (direction.equals("left")) {
            for (int i = 0; i < numbers.length-1; i++) {
                answer[i] = numbers[i+1];
            }
            answer[numbers.length-1] = numbers[0];
        }
        return answer;
    }

    public static void main(String[] args) {
        RotateArray r = new RotateArray();
        int[] numbers = {4, 455, 6, 4, -1, 45, 6};
        System.out.println(Arrays.toString(r.solution(numbers, "left")));
    }
}
