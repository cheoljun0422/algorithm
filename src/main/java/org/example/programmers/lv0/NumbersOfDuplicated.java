package org.example.programmers.lv0;

public class NumbersOfDuplicated {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i = 0; i <array.length; i++) {
            if (n == array[i]) {
                answer++;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        NumbersOfDuplicated n = new NumbersOfDuplicated();
        int [] a = {1,1,2,3,4,5};
        int i = 0;
        System.out.println(n.solution(a,i));
    }
}