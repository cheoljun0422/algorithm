package org.example.programmers.lv0;

public class AverageOfArray {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }
        return answer/ numbers.length;
    }

    public static void main(String[] args) {
        AverageOfArray a = new AverageOfArray();
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(a.solution(numbers));
    }
}
