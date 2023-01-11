package org.example.programmers.lv0;
/*
정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록
soltuion 함수를 완성해주세요.
 */
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
