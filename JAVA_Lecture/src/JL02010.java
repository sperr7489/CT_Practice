package JAVA_Lecture.src;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class JL02010 {
    static void solution(int[][] arr, int testcase){

        int cnt = 0;

        for(int i=1 ;i<testcase-1;i++){//i는 행
            for(int j=1;j<testcase-1;j++){
                //j는 열을 뜻한다.
                if (arr[i + 1][j] >= arr[i][j]) continue;
                if(arr[i-1][j]>=arr[i][j]) continue;
                if(arr[i][j+1]>=arr[i][j]) continue;
                if(arr[i][j-1]>=arr[i][j]) continue;

                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int[][] arr = new int[testcase+2][testcase+2];
        for(int i =0;i<testcase;i++){
            for(int j=0;j<testcase;j++){
                arr[i+1][j+1] = sc.nextInt();
            }
        }

        solution(arr,testcase+2);
    }
}
