package org.example.programmers;

class Minus {
    public int solution(int num1, int num2) {
        int answer;
        answer = num1 - num2;
        return answer;
    }

    public static void main(String[] args) {
        Minus n = new Minus();

        System.out.println(n.solution(1,2));
    }
}
