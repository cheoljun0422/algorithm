package org.example.programmers.lv0;

/*
정수 num1과 num2가 매개변수로 주어질 때,
num1을 num2로 나눈 값에 1,000을 곱한 후
정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
 */
public class Divide {
    public int solution(int num1, int num2) {
        return num1*1000/num2;
    }

    public static void main(String[] args) {
        Divide d = new Divide();
        System.out.println(d.solution(3,2));
    }
}
