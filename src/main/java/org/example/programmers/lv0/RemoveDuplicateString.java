package org.example.programmers.lv0;

public class RemoveDuplicateString {
    public String solution(String my_string) {
        char[] charArray = my_string.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            if (!sb.toString().contains(String.valueOf(charArray[i]))) sb.append(charArray[i]);
        }
        return sb.toString();

        //Arrays.stream(myString.split("")).distinct().collect(Collectors.joining());
    }

    public static void main(String[] args) {
        RemoveDuplicateString r = new RemoveDuplicateString();
        System.out.println(r.solution("people"));
    }
}
