package org.example.programmers.lv0;

/*
문자열 my_string과 문자 letter이 매개변수로 주어집니다.
my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
 */
public class DeleteLetter {
    public String solution(String my_string, String letter) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++) {
            if (!my_string.substring(i,i+1).equals(letter)) {
                answer += (my_string.charAt(i));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        DeleteLetter d = new DeleteLetter();
        System.out.println(d.solution("BCBdbe","B"));
    }
}
