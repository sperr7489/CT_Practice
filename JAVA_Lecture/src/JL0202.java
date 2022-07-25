package JAVA_Lecture.src;

import java.util.Scanner;

public class JL0202 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t = in.nextInt();
        int[] arr = new int[t];
        for(int i=0; i<t; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(solution(arr));
        return;
    }
    static int solution(int[] arr){

        int min = Integer.MIN_VALUE;

        int seeable=0;

        for (int a :
                arr) {
            if(a>min){
                seeable++;
                min = a;
            }
        }
        return seeable;
    }
}
