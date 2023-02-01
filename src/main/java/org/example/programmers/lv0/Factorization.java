package org.example.programmers.lv0;

import java.util.*;

public class Factorization {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> tmp = new ArrayList<>();
        int i = 2;

        while (n >= 2) {
            if (n % i == 0) {
                tmp.add(i);
                n /= i;
            } else {
                i++;
            }
        }
        answer = tmp.stream().distinct().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    public static void main(String[] args) {
        Factorization f = new Factorization();
        System.out.println(Arrays.toString(f.solution(17)));
    }
}
