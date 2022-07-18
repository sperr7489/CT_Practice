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
        long[] arr =new long[num];

        for(int i =0; i< num;i++){
            arr[i]= Long.parseLong(input[i]);
        }

        long max = getMax(arr);
        long result = binarySearch(max, arr, wanted);
        System.out.println(result);


    }
//    public static long checkRangeOfHeight(Long[] height,long wanted){
//    }

    public static long binarySearch(long max,long[] height,long wanted){ // 정렬된 배열을 입력받는다.
        //각각의 index를 첫,끝지점으로 지정.
        long start = 0;
        long end = max;
        long mid = (start+end)/2;

        boolean unChecked = true;

        while(unChecked){
            long sum = sumOfTreeCut(height,mid);

            if(wanted == sum ){
                break;
            } else if (wanted < sum) {
                //원하는 값보다 계산된 값이 더 크다면 톱날의 길이가 더 높아져야 함.
                start = mid+1;
                mid = (start+end)/2;
            }else{
                //원하는 값이 계산된 값보다 더 크다면 톱날의 길이가 더 짧아져야함(많이 짤라내야 하므로)
                end = mid -1;
                mid = (start+end)/2;
            }
            if(start > end)  {
                //start가 end보다 커졌다는 것은 이전에 mid로 잘랐을 때 자르는 양이 wanted보다 작았을 때 end = mid-1이 이루어졌을 때 !!
                mid = end;
                break;
            }
        }
        return mid;
//        height[start]와 height[end]를 따져봐야할텐데 말이야. mid 를 기준으로 바뀔 수 있다.
    }
    public static long sumOfTreeCut(long[] height, long cutting){
        long sum=0;
        for (long a :
                height) {
            if(a>cutting){
                sum+=(a-cutting);
            }
        }

        return sum;
    }
    public static long getMax(long[] arr){
        long max = 0;

        for (long a :
                arr) {
            max = Math.max(max,a);
        }
        return max;

    }
}
