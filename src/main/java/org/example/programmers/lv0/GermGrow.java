package org.example.programmers.lv0;

public class GermGrow {
    public int solution(int n, int t) {
        return (int) Math.pow(2, t) * n;
    }

    public static void main(String[] args) {
        GermGrow a = new GermGrow();
        System.out.println(a.solution(7,15));

    }
}
