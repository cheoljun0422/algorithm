package org.example.others;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public int solution(String phone_number) {
        //시작이 010이고 -0000-0000이면 리턴1
        //시작이 010이고 00000000이면 리턴2
        //시작이 +82이고 -10-0000-0000이면 리턴3
        //아니면 리턴-1
        Pattern pattern1;
        pattern1 = Pattern.compile("^\\d{3}-\\d{4}-\\d{4}$");
        Matcher matcher1 = pattern1.matcher(phone_number);

        Pattern pattern2;
        pattern2 = Pattern.compile("^\\d{11}");
        Matcher matcher2 = pattern2.matcher(phone_number);

        Pattern pattern3;
        pattern3 = Pattern.compile("^\\+\\d{2}-\\d{2}-\\d{4}-\\d{4}$");
        Matcher matcher3 = pattern3.matcher(phone_number);

        if (phone_number.startsWith("010") && matcher2.matches()) {
            return 2;
        }
        if (phone_number.startsWith("010") && matcher1.matches()) {
            return 1;
        } else if (phone_number.startsWith("+82") && phone_number.split("-")[1].equals("10") && matcher3.matches()) {
            return 3;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("+82-10-3937-3484"));
    }
}
