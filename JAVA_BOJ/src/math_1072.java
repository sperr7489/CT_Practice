import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class math_1072 {
    static long max = 1000000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        long gameCount = Integer.parseInt(str[0]);
        long winCount =  Integer.parseInt(str[1]);
        long winPercent = winCount/gameCount*100;


        if(gameCount == winCount){
            System.out.println("-1");
        }
        else{
            System.out.println(calNewWinVal(gameCount,winCount,winPercent));
        }

    }

    public static long calNewWinVal(long gameCount, long winCount, long winPercent  ){

        long start = 1;
        long end = max;
        int x  =0; // 게임을 몇번 추가적으로 더해야하는지 판단하기 위한 변수.
        boolean flag = true;

        long newWinPercent;

        long type ;
        long mid = 0  ;

        while(flag){
            mid = (start+end)/2;
            //x를 하나씩 늘려나간다.
//            newWinPercent = (winCount+x)/(gameCount+x)*100;
                newWinPercent = (winCount+mid) /(gameCount+mid)*100;
                type = newWinPercent-winPercent;

                if(type>1){
                    //새로운 통계값과의 차이가 1보다 크다면 더 줄일 수 있다는 것.
                    end = mid-1;
                } else if (type ==0) {
                    //차이가 없으면 start를 더 키워야겠지
                    start = mid+1;
                } else if (type==1) {
                    //정답!!
                    flag= false;
                }
        }
        return mid;
    }

}
