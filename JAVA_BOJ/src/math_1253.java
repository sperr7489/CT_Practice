import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class math_1253 {

    static int resultVal = 0;

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
        int zeroNum = zeroNum(arr);
        int flag = 0;
        if(arr[arr.length-1] <= 0){
            flag=1;
        }
        if(flag ==1){
            for(int i = 0; i<arr.length; i++){
                arr[i]*=-1;
            }
            Arrays.sort(arr);
        }
        for (int i = 1; i<arr.length; i++) {
                if (arr[0] < 0) {
                    //초깃값의 음수일 때
                    if (i != arr.length - 1) {
                        twoPointer(0, arr.length - 1, arr, i, result);
                    } else {
                        twoPointer(0, i - 1, arr, i, result);
                    }
                } else {
                    //초깃값이 0이상일 때
                    if(i!= arr.length -1){
                        if(arr[i-1]==0 ){
                            twoPointer(0, arr.length-1 , arr,i,result);
                            continue;
                        }
                    }
                    twoPointer(0, i - 1, arr, i, result);
                }
        }
        int resultZeroNum = zeroNum(result);

        if(zeroNum >= 3){
//            System.out.println("여기?");
            resultVal -= resultZeroNum;
            resultVal += zeroNum;
        }
        //0 이 어떻게 될까?
        System.out.println(resultZeroNum);
        System.out.println(zeroNum);
        System.out.println(result);
        System.out.println(resultVal);
    }
    public static void twoPointer(int left, int right, long[] arr, int targetIdx, ArrayList<Long> resultArr){
        //투포인터로 왼쪽에서 오는것 오른쪽에서 오는것을 확인.
         boolean unchecked = true;
         long target = arr[targetIdx];

         while(unchecked){
             long sum = arr[left]+arr[right];

             if(left == right){
                 //위치가 똑같아지면 false를 리턴
                 unchecked = false;
                break;
             }
             if(left == targetIdx || right == targetIdx){
                 unchecked =false;
                 break;
             }
             if(sum == target){
                 resultVal++;
                 resultArr.add(target);
                 unchecked =false;
             } else if (sum>target) {
                 //두수의 합이 target보다 크다면 오른쪽에서 한단계 줄여준다.
                 right--;
             }else{
                 //두수의 합이 tartget보다 작다면 왼쪽에서 한단계 줄여준다.
                 left++;
             }


         }
    }
    public static int zeroNum(ArrayList<Long> arr){
        int zeroNum =0;
        for(int i =0; i < arr.size();i++){
            if(arr.get(i) == 0){
                zeroNum++;
            }
        }
        return zeroNum;
    }
    public static int zeroNum(long[] arr){
        //0 이 몇개 있는지 알아내기 위한 함수.
        int zeroNum = 0;
        for (long a :
                arr) {
            if (a == 0){
                zeroNum++;
            }
        }
        return zeroNum;
    }
}
