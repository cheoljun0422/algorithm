package org.example.programmers.lv0;

public class Letter {
    public int solution(String message) {
        return message.length() * 2;
    }

    public static void main(String[] args) {
        Letter l = new Letter();
        System.out.println(l.solution("happy birthday!"));
    }
}
