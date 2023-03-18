package org.example.programmers.lv0;

public class StringArrayInSA {
    public int solution(String str1, String str2) {
        int answer;
        if (str1.contains(str2)) {
            answer = 1;
        } else answer = 2;
        return answer;
    }

    public static void main(String[] args) {
        StringArrayInSA s = new StringArrayInSA();
        System.out.println(s.solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
    }
}