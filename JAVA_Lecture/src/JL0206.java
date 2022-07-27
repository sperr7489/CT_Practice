package JAVA_Lecture.src;

import java.util.Scanner;

public class JL0206 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner in=new Scanner(System.in);
        int input1 = Integer.parseInt(in.nextLine());
        String str = in.nextLine();
        String[] strArr = str.split(" ");
        for(int i =0; i<input1; i++){
            solution(strArr[i],sb);
        }

        System.out.println(sb.toString());
    }
    static void solution(String str, StringBuilder sb){
        StringBuilder sb2 = new StringBuilder(str);
        int temp = Integer.parseInt(sb2.reverse().toString());
        if(primary(temp)){
            sb.append(temp+" ");
            return;
        }
    }
    // 소수를 판단하는 메서드
    static boolean primary(int a){
        if(a==1){
            return false;
        }
        if(a==2){
            return true;
        }

        for(int i =2; i<=(int)Math.sqrt(a); i++){
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }
}
