import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class math_1072 {
    static long max = 1000000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        double gameCount = Integer.parseInt(str[0]);
        double winCount =  Integer.parseInt(str[1]);
        long winPercent = (long)(winCount*100/gameCount);

        long tempResult = 0;

        if(gameCount == winCount || winPercent >=99){
            System.out.println("-1");
        }
        else{
            tempResult = calNewWinVal(gameCount,winCount,winPercent);// tempResult에서 하나씩 줄여보면서 확인을 해야한다.
//            System.out.println(minResult(gameCount,winCount,winPercent,tempResult));
            System.out.println(tempResult);
        }

//        System.out.println((long)(31.0 *100/52.0 )  +" 이거?");
//        System.out.println((29*100/50)  +" 이거?");


    }

    public static long calNewWinVal(double gameCount, double winCount, double winPercent  ){

        long start = 0;
        long end = max;
        int x  =0; // 게임을 몇번 추가적으로 더해야하는지 판단하기 위한 변수.
        boolean flag = true;

        long newWinPercent = 0;

        long type ;
        long mid = 0  ;

        while(flag){
            mid = (start+end)/2;
            //x를 하나씩 늘려나간다.
//            newWinPercent = (winCount+x)/(gameCount+x)*100;
            newWinPercent = (long)((winCount+mid)*100/( gameCount+mid));
            type = (long)(newWinPercent-winPercent); // type는 반드시 정수라는 것!
//            System.out.println("type : " + type + " mid : "+ mid);
//            System.out.println(mid);
            // TODO: 2022/05/05 while 문 안에서 자꾸 무한 루프가 돌고 있는 모습을 확인할 수 있다. 이부분을 해결하는 것이 급선무
                if(type>1){
                    //새로운 통계값과의 차이가 1보다 크다면 더 줄일 수 있다는 것.
                    end = mid-1;
                } else if (type ==1) {
                    //차이가 없으면 start를 더 키워야겠지
                    end = mid;
//                    flag=false; //이부분에서 정답이 된다.
                } else {
                    start = mid+1;
                }
                if(start == mid && type ==1){
                    break;
                };
        }
        return mid;
                    //50 29 일 경우엔 바뀌지 않았는데..?
    }
//    public static long  minResult(double gameCount, double winCount, double winPercent,long tempResult){
//
//        boolean flag= true;
//        double newWinPercent;
//        long type = 0;
//        while(flag){
//            tempResult--;
//            newWinPercent = (winCount+tempResult) /(gameCount+tempResult)*100;
//            type = (long)(newWinPercent - winPercent);
//            if(type == 0){
//                flag = false;
//                ++tempResult;
//            }
//        }
//        return tempResult;
//    }
}
