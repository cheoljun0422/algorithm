package org.example.programmers.lv0;

public class JudgeSquare {
    public int solution(int n) {
        int answer;
        double sqrt = Math.sqrt(n);
        if (sqrt == (int) sqrt) {
            answer = 1;
        } else answer = 2;
        return answer;
    }

    public static void main(String[] args) {
        JudgeSquare j = new JudgeSquare();
        System.out.println(j.solution(144));
        System.out.println(Math.sqrt(3) * Math.sqrt(3));
        System.out.println(Math.pow(3,2));
    }
}
