package org.example.programmers.lv0;

import java.util.Arrays;

/*
정수 배열 num_list와 정수 n이 매개변수로 주어집니다.
num_list를 다음 설명과 같이 2차원 배열로 바꿔 return하도록 solution 함수를 완성해주세요.
 */
public class Make2D {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int tmp = 0;
        for (int i = 0; i < num_list.length / n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[tmp];
                tmp++;
            }
        }
        return answer;
    }
    // int[4][2] -> [[ㅁ,ㅁ],[ㅁ,ㅁ],[ㅁ,ㅁ],[ㅁ,ㅁ]]

    public static void main(String[] args) {
        Make2D m = new Make2D();
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println((Arrays.deepToString(m.solution(a, 2))));
        // 1차원 배열은 Arrays.toString 다른 차원은 deepToString
    }
}
