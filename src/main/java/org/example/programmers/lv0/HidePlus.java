package org.example.programmers.lv0;

public class HidePlus {
    public int solution(String my_string) {
        int answer = 0;
        String tmp = my_string.replaceAll("[^\\d]+", "");
        for (int i = 0; i < tmp.length(); i++) {
            answer += Integer.parseInt(tmp.split("")[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        HidePlus h = new HidePlus();
        System.out.println(h.solution("aAb1B2cC34oOp"));
    }
}
