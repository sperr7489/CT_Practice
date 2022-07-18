package JAVA_Lecture.src;

public class JL0112 {
    public static void main(String[] args) {
        System.out.println(solution("#****###**#####**#####**##**",4));
    }
    public static String solution(String str, int n){
        int pos=0; //pos는 시작점의 위치를 말한다.

        char[] solArr =new char[n];
        int i=0;
        while(pos<str.length()){
            String subStr = str.substring(pos,pos+7);
            String firstStr =  subStr.replaceAll("#","1");
            String secondStr =  firstStr.replaceAll("\\*","0");

            System.out.println(secondStr);


            solArr[i++]=(char)Integer.parseInt(secondStr,2);

            System.out.println((char) Integer.parseInt(secondStr,2));

            pos+=7;
        }



        return String.valueOf(solArr);
    }
}
