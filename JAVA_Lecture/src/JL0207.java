package JAVA_Lecture.src;

import java.util.Scanner;

public class JL0207 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1 = Integer.parseInt(in.nextLine());
        String str = in.nextLine();

        System.out.println("정답"+Solution(str));



    }
    static int Solution(String str){
        int flag = 0;
        int point = 0;
        String[] strArr = str.split(" ");

        for (String a :
                strArr) {
            if(a.equals("1")){
                //정답이라면 점수가 올라가야한다.
                point+=flag+1;
                flag++;
                continue;
            }
            //정답이 아니라면
            flag = 0;

        }
        
        return point;
    }
}
