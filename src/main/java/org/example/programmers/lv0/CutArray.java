package org.example.programmers.lv0;

import java.util.Arrays;
import java.util.stream.Stream;

/*
정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록
solution 함수를 완성해보세요.
 */
public class CutArray {
    public int[] solution(int[] numbers, int num1, int num2) {
//        int[] answer = new int[num2 - num1 + 1];
//        int tmp = 0;
//        for (int i = num1; i <= num2; i++) {
//            answer[tmp] = numbers[i];
//            tmp++;
//        }
//        return answer;
        return Arrays.stream(numbers, num1, num2+1).toArray();
    }

    public static void main(String[] args) {
        CutArray c = new CutArray();
        int[] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(c.solution(a, 1, 3)));
    }
}
