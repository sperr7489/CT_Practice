package JAVA_Lecture.src;

import java.util.ArrayList;
import java.util.List;

public class JL0110 {

    public static void main(String[] args) {

        /**
         * 1. 떨어진 거리의 기준이 되는 문자가 어떤 idx 들어있는지 판단하도록 한다.
         * 2. 해당 인덱스에서 가장 짧게 떨어진 거리 min에 대해서 배열로 추가한다.
         * */

        System.out.println(solution("teachermode",'e'));


    }
    public static String solution(String str,char t){
        List<String> solList = new ArrayList<>();
        List<Integer> idxOfChar = new ArrayList<>();
        // 먼저 비교될 t문자가 존재하는 인덱스의 위치를 파악하도록 한다.
        int i=0;
        for (char a :
                str.toCharArray()) {
            if(a ==t){
                //동일하다면?
                idxOfChar.add(i);
            }
            i++;
        }
        for(int j=0;j<str.length();j++){
            int min =Integer.MAX_VALUE;
            for (int a :
                    idxOfChar) {
                if(min>Math.abs(a-j)){
                    min = Math.abs(a-j);
                }
            }
            solList.add(String.valueOf(min));
        }
        return String.join(" ", solList);
    }

}
