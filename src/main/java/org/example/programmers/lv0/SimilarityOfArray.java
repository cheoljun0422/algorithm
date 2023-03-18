package org.example.programmers.lv0;

public class SimilarityOfArray {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String value1 : s1) {
            for (String value2 : s2) {
                if (value1.equals(value2)) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SimilarityOfArray s = new SimilarityOfArray();
        String[] a = {"a", "b", "c"};
        String[] b = {"com", "b", "d", "p", "c"};
        System.out.println(s.solution(a,b));
    }
}
