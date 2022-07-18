package JAVA_Lecture.src;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class JL0106 {
    static List<String> duplicatedArr = new ArrayList<>();

    public static void main(String[] args) {


        System.out.println(solution("ksekkset")  );
    }
    public static String solution(String str)
    {
        String[] arr = str.split("");

        for (String a :
                arr) {
            if (duplicatedArr.contains(a))
            {
                // duplicatedArr에 포함되어 있다면 a를 넘어가기
                continue;
            }
            duplicatedArr.add(a);

        }

        return String.join("",duplicatedArr);

    }
}
