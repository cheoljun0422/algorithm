package org.example.programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Z {
    public int solution(String s) {
        int answer = 0;
        List<String> tmp = new ArrayList<>(Arrays.asList(s.split(" ")));

        while (tmp.contains("Z")) {
            tmp.remove(tmp.indexOf("Z") -1);
            tmp.remove("Z");
        }
        for(int i = 0; i < tmp.size(); i++) {
            answer += Integer.parseInt(tmp.get(i));
        }


        return answer;
    }

    public static void main(String[] args) {
        Z z = new Z();
        System.out.println(z.solution("1 2 Z 3"));
    }
}
