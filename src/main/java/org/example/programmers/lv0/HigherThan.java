package org.example.programmers.lv0;


public class HigherThan {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (height < array[i]) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        HigherThan h = new HigherThan();
        int[] a = {149,180,192,170};
        int n = 167;
        System.out.println(h.solution(a, n));
    }
}
