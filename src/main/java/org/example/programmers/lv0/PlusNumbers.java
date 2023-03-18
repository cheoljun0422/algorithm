package org.example.programmers.lv0;

public class PlusNumbers {
    public int solution(int n) {
        int answer = 0;
        while (n < 10) {
            answer += n % 10;
            n = n / 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        PlusNumbers p = new PlusNumbers();
        System.out.println(p.solution(1234));
    }
}
