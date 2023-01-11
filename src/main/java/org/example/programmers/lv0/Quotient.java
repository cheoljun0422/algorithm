package org.example.programmers.lv0;

/*
정수 num1, num2가 매개변수로 주어질 때,
num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
 */
public class Quotient {
    public int solution(int num1, int num2) {
        return num1/num2;
    }

    public static void main(String[] args) {
        Quotient q = new Quotient();
        System.out.println(q.solution(10,-8));
    }
}
