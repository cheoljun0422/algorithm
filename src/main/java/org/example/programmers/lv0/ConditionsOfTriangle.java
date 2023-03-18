package org.example.programmers.lv0;

import java.util.Arrays;

public class ConditionsOfTriangle {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        System.out.println(Arrays.toString(sides));
        if (sides[2] < sides[1] + sides[0]) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        ConditionsOfTriangle c = new ConditionsOfTriangle();
        int[] a = {1,2,3};
        System.out.println(c.solution(a));
    }
}
