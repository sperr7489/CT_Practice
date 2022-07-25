package JAVA_Lecture.src;

public class JL0205 {
    public static void main(String[] args) {

        System.out.println(primary(20));

        System.out.println();

        for(int i=2; i<=(int)Math.sqrt(3); i++){
            System.out.println("Baba");
        }


    }

    static int primary(int base){
        int sqr = (int) Math.sqrt(base);
        int answer = 0;

        for(int i=1;i<=base;i++){
            int flag= 0; //소수인지 판별하는 것.
            if(i==1){
                continue;
            }
            if(i==2){
                answer++;
                continue;
            }

            for(int j=2;j<=(int)Math.sqrt(i); j++){
                if(i%j ==0){
                    // 만약 나누어 떨어진다면 소수가 아니다.
                    flag=1;//합성수일땐 1
                    break;
                }
            }
            if(flag==0){
                //소수라면.
                answer++;
            }

        }


        return  answer;

    }



}
