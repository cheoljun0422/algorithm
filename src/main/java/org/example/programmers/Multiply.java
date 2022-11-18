package org.example.programmers;

/*
    정수 num1과 num2가 주어질 때,
    num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
     */
public class Multiply {
    public int solution(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        Multiply m = new Multiply();
        System.out.println(m.solution(3,4));
    }
}
