package kakao.kakao_92335;

import java.util.Scanner;

public class kakao_92335 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int k = sc.nextInt();

        System.out.println(solution(n,k));
//        System.out.println("isPrime : "+isPrime(1));
        return;
    }

    static int solution(long n, int k) {

        String numToPrime = Long.toString(n,k);
        int strLen = numToPrime.length();
        String[] arrPrime = numToPrime.split("0++");
        int answer = 0;

        for (String a :
                arrPrime) {
            if(isPrime(Long.parseLong(a))==1){
                answer++;
            }
        }
        return answer;
    }
    //2부터 ~ 루트 N까지로 나눠보는 소수 판별법.
    static int isPrime(long n) {
        if(n==1){
            return 0;
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0; //소수가 아닌것.
            }
        }
        return 1;
    }
}