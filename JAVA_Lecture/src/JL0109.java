package JAVA_Lecture.src;

import java.util.*;
import java.util.regex.*;

public class JL0109 {
    public static void main(String[] args) {

        System.out.println(solution("g0en2T0s8eSoft"));

    }
    public static int solution(String str){
        String[] newStr = str.split("");
        List<String> intArr = new ArrayList<>();
        for (String a :
                newStr) {
            if(Pattern.matches("\\d",a)){
                // 만약 숫자와 매치가 된다면?
                intArr.add(a);
            }
        }
        String solStr = String.join("",intArr);

        return Integer.parseInt(solStr);




    }
}
