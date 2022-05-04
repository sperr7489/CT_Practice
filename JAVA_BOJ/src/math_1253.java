import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class math_1253 {

    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int t = Integer.parseInt(num); //숫자의 갯수.
        String str[] = br.readLine().split(" ");
        long[] arr =new long[t];
        ArrayList<Long> result = new ArrayList<>();

        for(int i =0; i< t;i++){
            arr[i]= Long.parseLong(str[i]);
        }
        Arrays.sort(arr);
        for (int i = 0; i<arr.length; i++){
            twoPointer(0,i,arr,arr[i],result);
        }
        //0 이 어떻게 될까?

    }
    public static void twoPointer(int left, int right, long[] arr, long target, ArrayList<Long> resultArr){
        //투포인터로 왼쪽에서 오는것 오른쪽에서 오는것을 확인.
         boolean unchecked = true;
         while(unchecked){
             long sum = arr[left]+arr[right];
             if(sum == target){
                 result++;
                 resultArr.add(target);
                 unchecked =false;
             } else if (sum>target) {
                 //두수의 합이 target보다 크다면 오른쪽에서 한단계 줄여준다.
                 right--;
             }else{
                 //두수의 합이 tartget보다 작다면 왼쪽에서 한단계 줄여준다.
                 left++;
             }
             if(left == right){
                 //위치가 똑같아지면 false를 리턴
                 unchecked = false;
             }
         }
    }
}
