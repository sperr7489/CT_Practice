package JAVA_Lecture.src;

import java.util.ArrayList;
import java.util.List;

public class JL0108 {
    public static void main(String[] args) {

        System.out.println(solution("found7, time: study; Yduts; emit, 7Dnuof"));

    }
    public static String solution(String str){

        char[] arr = str.toCharArray();
        List<String> alpabetArr = new ArrayList<>();
        for (char a :
                arr) {
            if(!Character.isAlphabetic(a)){
                // 알파벳이 아니면 무시한다.
                continue;
            }
            alpabetArr.add(String.valueOf(a).toLowerCase());
        }
        String solStr = String.join("",  alpabetArr);
        StringBuilder sb = new StringBuilder(solStr);

        if(solStr.equals(sb.reverse().toString())){
            return "YES";
        }
        return "NO";
    }
}
