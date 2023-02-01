package org.example.programmers.lv0;

public class RemoveVowels {
    public String solution(String my_string) {
        String answer = my_string.replaceAll("[aeiou]","");

        return answer;
    }

    public static void main(String[] args) {
        RemoveVowels r = new RemoveVowels();
        System.out.println(r.solution("bus"));
    }
}
