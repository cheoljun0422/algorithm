package org.example.programmers;


/*
최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
정수 배열 array가 매개변수로 주어질 때,
최빈값을 return 하도록 solution 함수를 완성해보세요.
최빈값이 여러 개면 -1을 return 합니다.
 */
public class FrequentValue {
    public int solution(int[] array) {
        int answer = 0;
        int arrMax = 0;
        for (int i = 0; i < array.length; i++) {
            if(arrMax < array[i]) {
                arrMax = array[i];
            }
        }

        int[] count = new int[arrMax+1];

        for(int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }

        int max = 0;

        for(int i = 0; i < count.length; i++) {
            if(count[i] > max) {
                max = count[i];
                answer = i;
            }
        }

        int comfirm = 0;

        for(int i = 0; i < count.length; i++) {
            if(count[i] == max) {
                comfirm++;
            }
        }

        if(comfirm > 1)
            answer = -1;

        return answer;
    }

    public static void main(String[] args) {
        FrequentValue f = new FrequentValue();
        int[] arr = {1,2,3,3,3,4};
        System.out.println(f.solution(arr));
    }
}
