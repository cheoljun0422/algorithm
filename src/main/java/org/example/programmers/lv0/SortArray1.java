package org.example.programmers.lv0;

import java.util.Arrays;

public class SortArray1 {
    public int[] solution(String my_string) {
        // 정규식으로 문자열의 문자들을 다 지우고 남은 숫자들을 answer으로
        String tmp = my_string.replaceAll("[^\\d]", "");
        int[] answer = new int[tmp.length()];
        for (int i = 0; i < tmp.length(); i++) {
            answer[i] = Integer.parseInt(tmp.split("")[i]);
        }

        return Arrays.stream(answer).sorted().toArray();
    }

    public static void main(String[] args) {
        SortArray1 s = new SortArray1();
        System.out.println(Arrays.toString(s.solution("hi12392")));
    }
}
