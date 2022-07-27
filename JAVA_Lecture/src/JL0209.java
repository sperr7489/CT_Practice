package JAVA_Lecture.src;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class JL0209 {

    static void solution(int[][] integerArr,int testcase){
        /**
         * 1. 가로행의 합
         * 2. 세로행의 합
         * 3. 대각선의 합
         * 각각을 계산하며 맥스치를 갱신한다
         */
        int max = Integer.MIN_VALUE;
        int rowSum = 0;
        int[] colSumArr = new int[testcase];
        // case01 02
        for(int i=0;i<testcase; i++){
            rowSum=0;
            for(int j=0;j<testcase; j++){
                rowSum+=integerArr[i][j];
            }
            if(max<rowSum){
                max= rowSum;
            }
            for(int c=0;c<testcase;c++){
                colSumArr[c]+=integerArr[i][c];
            }
        }
        for(int i=0;i<testcase;i++){
            if(colSumArr[i]>max){
                max= colSumArr[i];
            }
        }
        // 대각선합.
        int[] dialSum = new int[2];
        for(int i=0;i<testcase;i++){
            for(int j=0;j<testcase;j++){
                if(i==j){
                    //대각선일 경우에
                    dialSum[0]+=integerArr[i][j];
                }
            }

        }
        for(int i=0;i<testcase;i++){
            for(int j=testcase-1;j>=0;j--){
                if(i+j==testcase-1){
                    //대각선일 경우
                        dialSum[1]+=integerArr[i][j];

                }
            }
        }
        for (int a :
                dialSum) {
            if(a>max){
                max= a;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int[][] arr = new int[testcase][testcase];
        for(int i =0;i<testcase;i++){
            for(int j=0;j<testcase;j++){
                arr[i][j] = sc.nextInt();
            }
        }
            solution(arr,testcase);
    }
}
