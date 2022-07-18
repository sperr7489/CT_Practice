package kakao.kakao_92341;

import java.io.IOException;
import java.util.*;
public class kakao_92341 {
    public static void main(String[] args) throws IOException {
        int[] fees = {120, 0, 60, 591};

        String[] records ={"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"};
        System.out.println(Arrays.toString(solution(fees,records)));

    }
    // records 는 시간, 차번호, 출차 여부.

    public static int[] solution(int[] fees, String[] records) {
        ArrayList<Car> carList = new ArrayList<Car>();
        ArrayList<Integer> carNumList = new ArrayList<>();
        HashMap<Integer, Integer>  feeList = new HashMap<Integer, Integer>();
        for (String a :
                records) {
            String[] info = a.split(" ");
            int carNum = Integer.parseInt(info[1]);
            if(carNumList.contains(carNum)){
                // 차 번호가 이미 존재한다면?
                Car indexCar = null;
                for (Car car :
                        carList) {
                    if(car.getCarNum() == carNum){
                        indexCar = car;
                    }
                }
                if(info[2].equals("IN")){
                    // 차 번호가 이미 존재 한 상태에서 입차를 한경우
                    indexCar.setInTime(info[0]);
                    indexCar.setTotalTime(info[0],info[2]);
//                    feeList.put(carNum,indexCar.getTotalFee());
                }else{
                    // 차가 출차를 한 경우. out이랑 같을 경우.
                    int totalTime = indexCar.timeParking(info[0]);
                    indexCar.setTotalTime(info[0],info[2]);
//                    feeList.put(carNum,indexCar.getTotalFee());
                }
            }else{
            //차 번호가 존재 하지 않는다면. 처음 입차한 경우
                Car t = new Car(a);
                carList.add(t);
                carNumList.add(t.getCarNum());
//                feeList.put(carNum,t.getTotalFee());
                t.setTotalTime(info[0],info[2]);
            }
        }
        for (Car a :
                carList) {
            a.calFee(a.getTotalTime(),fees);
            System.out.println((int)(Math.ceil((double)1/60)));

            feeList.put(a.getCarNum(),a.getTotalFee());
        }

    List<Map.Entry<Integer,Integer>> entryList = new ArrayList<Map.Entry<Integer, Integer>>(feeList.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        int size = entryList.size();
        int[] answer = new int[size];
        int i = 0;
        for(Map.Entry<Integer,Integer> entry : entryList){
            answer[i] = entry.getValue();
            i++;
        }
        return answer;
    }
}

class Car {
    private String time;
    private int carNum;
    private String inTime; // 차량 출입 시간

    private int totalTime=0;

    private static final int dayMinute = 23*60+59;

    // 전체 요금.
    private int totalFee=0;

    public Car(String carInfo) {
        // 자동차에 대한 클래스를 만들어 관리한다.
        String[] info = carInfo.split(" ");
        this.carNum = Integer.parseInt(info[1]);
        this.inTime = info[0];
    }

    public int hourToMinute(String str){
        //str 로는 해당 출차 시간이 00:00 인지에 대해서
        String[] info = str.split(":");
        int hour = Integer.parseInt(info[0]);
        int min = Integer.parseInt(info[1]);

        return hour*60+min; // 해당 시간 만큼
    }

    public void setTotalTime(String str, String inOut) {
        //inOut은 출차 여부 str은 해당 출차 시간
        if(inOut.equals("IN")){
            this.totalTime = this.totalTime + (dayMinute - hourToMinute(str));

        }else{
            this.totalTime = this.totalTime - (dayMinute - hourToMinute(str));
        }
    }


    public int timeParking(){
        // 출차 시간이 존재하지 않을때
        String[] in = this.inTime.split(":");
        System.out.println(Arrays.toString(in));
        int inHour = Integer.parseInt(in[0]);
        int inM = Integer.parseInt(in[1]);

        int totalTime = (23-inHour)*60 + 59-inM; // 총 주차를 한 시간.

        return totalTime;
    }
    public int timeParking(String outTime){

        String[] in = this.inTime.split(":");
        String[] out = outTime.split(":");
        int inHour = Integer.parseInt(in[0]);
        int outHour = Integer.parseInt(out[0]);
        int inM = Integer.parseInt(out[1]);
        int outM = Integer.parseInt(out[1]);

        int totalTime = (outHour-inHour)*60 + outM-inM; // 총 주차를 한 시간.

        return totalTime;
    }

    // 주차 요금 계산하기.
    public int calFee(int totalTime, int[] fees){
        // fees배열은 요금표에 대한 정보들이다.
        int retVal=0;
        if(this.totalTime<=fees[0]){
            // 주차시간이 기본 시간 보다 이하라면 기본 요금을 청구.
            retVal = fees[1];
            this.totalFee+=fees[1];
        }
        else{
            //주차 시간이 기본 시간보다 초과라면
            int remaindTime = this.totalTime-fees[0];
            retVal = fees[1]+remaindTime/fees[2]*fees[3];
            this.totalFee +=(fees[1] + (int)Math.ceil((double)remaindTime/fees[2])*fees[3]);
        }

        return retVal;
    }

    public String getTime() {
        return time;
    }

    public int getCarNum() {
        return carNum;
    }

    public String getInTime() {
        return inTime;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

    public void setTotalFee(int defaultFee) {
        this.totalFee -= defaultFee;
    }

    public int getTotalFee() {
        return totalFee;
    }

    public int getTotalTime() {
        return totalTime;
    }
}