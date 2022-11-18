package org.example.programmers;

import java.util.Arrays;

/*
첫 번째 분수의 분자와 분모를 뜻하는 denum1, num1,
두 번째 분수의 분자와 분모를 뜻하는 denum2, num2가 매개변수로 주어집니다.
두 분수를 더한 값을 기약 분수로 나타냈을 때
분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 */
public class AdditionOfFractions {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int n = num1 * num2;
        int de = denum1*num2 + denum2*num1;
        int max = 0;

        for(int i = 1; i <= n && i <=de; i++) {
            if(n%i == 0 && de%i ==0){
                max = i;
            }
        }
        answer[0] = de/max;
        answer[1] = n/max;
        return answer;
    }

    public static void main(String[] args) {
        AdditionOfFractions a = new AdditionOfFractions();
        System.out.println(Arrays.toString(a.solution(1, 2, 3, 4)));
    }
}

