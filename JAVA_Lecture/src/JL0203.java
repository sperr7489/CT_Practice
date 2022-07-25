package JAVA_Lecture.src;

import java.util.Scanner;

public class JL0203 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t = in.nextInt();
        int[] arrA = new int[t];
        int[] arrB = new int[t];
        for(int i=0; i<t; i++){
            arrA[i] = in.nextInt();
        }
        for(int i=0; i<t; i++){
            arrB[i] = in.nextInt();
        }

        solution(arrA,arrB,t);
        return;
    }
    static void solution(int[] arrA, int[] arrB, int testcase){
        char[] sol = new char[testcase];

        for (int i=0;i< testcase; i++) {
            System.out.println(rspResult(arrA[i],arrB[i]));
        }
    }
    static char rspResult(int a, int b){
        int base = a-b +3;
        if(base==3){
            return 'D';
        }
        return base%3==1 ? 'A':'B';
    }
}
