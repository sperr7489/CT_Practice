package JAVA_Lecture.src;

public class JL0107 {
    public static void main(String[] args) {

        System.out.println(solution("gooG"));
    }

    public static String solution(String str){

        String newStr = str.toLowerCase();
        StringBuilder sb = new StringBuilder(newStr);

        if(newStr.equals(sb.reverse().toString())){
            return "YES";
        }
       return "NO";
    }

}
