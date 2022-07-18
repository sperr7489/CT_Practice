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

        for(int i =0;i<arr.length; i++){
            twoPointer(0,t-1,arr,i,result);
        }
        int zeroNum = zeroNum(arr);
        int resultZeroNum = zeroNum(result);
        if(zeroNum >= 3){
//            System.out.println("여기?");
            resultVal -= resultZeroNum;
            resultVal += zeroNum;
        }
        //0 이 어떻게 될까?
        //0이 left나 rigtt이고 나머지 하나가 만약 targetIdx라면?
        System.out.println(resultZeroNum);
        System.out.println(zeroNum);
        System.out.println(result);
        System.out.println(resultVal);
    }
    public static void twoPointer(int left, int right, long[] arr, int targetIdx, ArrayList<Long> resultArr){
        //투포인터로 왼쪽에서 오는것 오른쪽에서 오는것을 확인.
         long target = arr[targetIdx]; // target 위치.
        // left 와 right는 반드시 해당 기준점에서 왼쪽 오른쪽으로 가게 된다.
        while(true){
            if(left ==targetIdx && left !=right){
                left++;
            }
            if(right == targetIdx && right != left){
                right--;
            }
            long sum = arr[left]+ arr[right]; // left right 인덱스가 가리키는 element의 합.
            if (left == right) {
                //left와 right가 동시에 같은 것을 가지고 있다며 이것은 해당 sum이 동일한 것을 찾지 못한 것이라고 할 수 있다.
                break;
            }
            if(sum == target ){
                resultVal++;
                resultArr.add(target);
                break;
            }else {
                if ((sum > target)) {
                    //만약 두수의 합이 target보다 더 크다면 right를 왼쪽으로 이동시켜준다.
                    right--;
                    if (right == targetIdx && right !=left) {
                        right--;
                        //right을 움직이고 나서 이것이 targetIdx와 같다면 한번더 왼쪽으로 움직여주도록 한다.
                    }
                } else {
                    //두수의 합이 target보다 더 작다면 left를 오른쪽으로 이동시켜준다.
                    left++;
                    if (left == targetIdx && left != right) {
                        left++;
                        // left를 움직이고 나서 이것이 targetIdx와 같다면 한번더 오른쪽으로 움직여주도록 한다.
                    }
                }

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
