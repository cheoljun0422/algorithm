package org.example.programmers.lv0;

public class Decode {
    public String solution(String cipher, int code) {
        String answer = "";
        for (int i =0; i < cipher.length(); i++) {
            if((i + 1) % code == 0) {
                answer += cipher.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Decode a = new Decode();
        System.out.println(a.solution("dfjardstddetckdaccccdegk",4));
    }
}
