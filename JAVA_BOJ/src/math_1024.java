import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class math_1024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        long sum = Integer.parseInt(str[0]);
        long eleCount = Integer.parseInt(str[1]);
        ArrayList<Long> result = new ArrayList<>();

        while(result.size() ==0){
            checkSumList(sum,eleCount,result);
            eleCount++;
        }
        for(int i =0; i<result.size(); i++  ){
            System.out.print(result.get(i) +" ");
        }
        System.out.println();
    }

    public  static void checkSumList(long sum, long eleCount, ArrayList<Long> result){
        long diff = eleCount%2 == 0 ? eleCount/2-1 : eleCount/2;
        long norm = sum/eleCount;
        long remainder = sum%eleCount; // 나머지

        if(diff > norm || eleCount>100)
        {
            result.add((long) -1);
            return;
        }

        if(eleCount%2 == 0){
            //짝수라면
            if(diff+1 == remainder){
                //정답 처리
                for(int i=0; i<eleCount; i++){
                    result.add(norm-diff+i);
                }
            }
        }else{
            //홀수라면
            if(remainder == 0){
                //나누어 떨어질 때 정답 처리.
                for(int i = 0; i<eleCount;i++){
                    result.add(norm-diff+i);
                }
            }
        }
    }
}
