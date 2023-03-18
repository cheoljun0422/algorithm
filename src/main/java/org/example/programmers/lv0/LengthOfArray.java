package org.example.programmers.lv0;

import java.util.Arrays;

public class LengthOfArray {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }

    public static void main(String[] args) {
        LengthOfArray l = new LengthOfArray();
        String[] a = {"We", "are", "the", "world!"};
        System.out.println(Arrays.toString(l.solution(a)));
    }
}
