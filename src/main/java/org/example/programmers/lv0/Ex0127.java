package org.example.programmers.lv0;

public class Ex0127 {
    public static void main(String[] args) {
        for(int i=5; i>=1; i--) {
            // 공백 만들기
            for(int j=0; j<5-i; j++) {
                System.out.print(" ");
            }
            // 별찍기
            for(int j=1; j<=(i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=(i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
