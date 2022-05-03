import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class tree_2805 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" "); // 입력값을 분리 0: 나무의 갯수, 1: 원하는 높이
        int num = Integer.parseInt(str[0]);
        long wanted = Long.parseLong(str[1]);
        String input[] = br.readLine().split(" ");
        Long[] arr =new Long[num];

        for(int i =0; i< num;i++){
            arr[i]= Long.parseLong(input[i]);
        }
        Arrays.sort(arr);
        System.out.println(checkRangeOfHeight(arr,wanted));
    }
    public static long checkRangeOfHeight(Long[] height,long wanted){

        int start = 0;
        int end = height.length-1;
        int mid  = (start+end)/2;



        boolean unChecked= true;

        if(height.length ==1)
        {
            return height[0]-wanted;
        }

        if(height[end]-height[end-1]>wanted){
            return height[end]-wanted;
        }
        while(unChecked){
            if(sumOfTreeCut(height,height[mid]) == wanted) {
                return height[mid];
            } else if (sumOfTreeCut(height,height[mid]) < wanted) {
                // 원하는 값보다 계산의 결과값이 더 작을경우.
                if(start ==mid){
                    long resultSum = 0;
                    for(int i= start; i<height.length;i++){
                        resultSum +=height[i];
                    }
                    long result = (resultSum-wanted)/(height.length-start);
                    return result;
                }
                end = mid -1;
                mid = (start+end)/2;
            }else{
                //원하는 값보다 계산의 결과값이 더 클 경우.
                start = mid+1;
                mid = (start+end)/2;
            }
            if(start == end) {
                unChecked = false; //반복문을 끝낸다.
            }
        }
        long resultSum =0;
        for(int i = mid+1; i<height.length;i++){
            resultSum +=height[i];
        }
        long result = (resultSum-wanted)/(height.length-mid-1);


        return result;

    }
    public static long sumOfTreeCut(Long[] height, long cutting){
        long sum=0;
        for (long a :
                height) {
            if(a>=cutting){
                sum+=(a-cutting);
            }
        }

        return sum;
    }
}
