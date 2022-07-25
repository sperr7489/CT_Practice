package JAVA_Lecture.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JL0204 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int testcase = in.nextInt();
        List<Integer> arr = new ArrayList<>();
        solution(arr,testcase,0);

        System.out.println(String.join("",arr.toString().split("[\\[\\],]")));

//        for (Integer a :
//                arr ) {
//            System.out.print(a+" ");
//        }
    }
    public static void solution(List<Integer> arr, int t,int index ){
        if(t-index ==1){
            arr.add(arr.get(index-2)+arr.get(index-1));
            return;
        }
        if(index<2)
        {
            arr.add(1);
            solution(arr,t,++index);
            return;
        }
        arr.add(arr.get(index-2)+arr.get(index-1));
        solution(arr,t,++index);
    }

}
